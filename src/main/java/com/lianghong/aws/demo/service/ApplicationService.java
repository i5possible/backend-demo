package com.lianghong.aws.demo.service;

import com.lianghong.aws.demo.domain.Application;
import com.lianghong.aws.demo.domain.ApplicationAbstract;
import com.lianghong.aws.demo.domain.ApplicationDetails;
import com.lianghong.aws.demo.domain.ApplicationLender;
import com.lianghong.aws.demo.domain.ApplicationLoan;
import com.lianghong.aws.demo.domain.ApplicationStatus;
import com.lianghong.aws.demo.repository.ApplicationRepository;
import com.lianghong.aws.demo.repository.entity.ApplicationEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.lianghong.aws.demo.repository.mapper.ApplicationEntityMapper.MAPPER;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application get(String applicationId) {
        ApplicationEntity applicationEntity = applicationRepository.getApplicationAbstractById(applicationId);
        Application application = MAPPER.mapToDomain(applicationEntity);
        return application;
    }

    public List<Application> getAll(String applicationId) {
        List<ApplicationEntity> applicationEntities = applicationRepository.getApplicationEntities(applicationId);
        List<Application> applications = applicationEntities.stream().map(MAPPER::mapToDomain).collect(Collectors.toList());
        return applications;
    }

    public ApplicationDetails getApplicationDetails(String applicationId) {
        List<ApplicationEntity> applicationEntities = applicationRepository.getApplicationEntities(applicationId);
        ApplicationDetails applicationDetails = ApplicationDetails.builder()
                .applicationAbstract(getApplicationAbstract(applicationEntities))
                .applicationLender(getApplicationLender(applicationEntities))
                .applicationLoans(getApplicationLoans(applicationEntities))
                .applicationStatus(getApplicationStatus(applicationEntities))
                .build();

        return applicationDetails;
    }

    private ApplicationAbstract getApplicationAbstract (List<ApplicationEntity> applicationEntities ) {
        return applicationEntities.stream()
                .filter(applicationEntity -> applicationEntity.getSk().equals("metadata"))
                .findAny()
                .map(MAPPER::mapToAbstract)
                .orElse(ApplicationAbstract.builder().build());
    }

    private ApplicationLender getApplicationLender (List<ApplicationEntity> applicationEntities ) {
        return applicationEntities.stream()
                .filter(applicationEntity -> applicationEntity.getSk().startsWith("lender"))
                .findAny()
                .map(MAPPER::mapToLender)
                .orElse(ApplicationLender.builder().build());
    }

    private List<ApplicationLoan> getApplicationLoans (List<ApplicationEntity> applicationEntities ) {
        return applicationEntities.stream()
                .filter(applicationEntity -> applicationEntity.getSk().startsWith("loans"))
                .map(MAPPER::mapToLoan)
                .collect(Collectors.toList());

    }

    private ApplicationStatus getApplicationStatus (List<ApplicationEntity> applicationEntities ) {
        return applicationEntities.stream()
                .filter(applicationEntity -> applicationEntity.getSk().startsWith("status"))
                .findAny()
                .map(MAPPER::mapToStatus)
                .orElse(ApplicationStatus.builder().build());
    }
}

package com.lianghong.aws.demo.service;

import com.lianghong.aws.demo.domain.Application;
import com.lianghong.aws.demo.repository.ApplicationRepository;
import com.lianghong.aws.demo.repository.entity.ApplicationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.lianghong.aws.demo.repository.mapper.ApplicationEntityMapper.MAPPER;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Service
public class ApplicationService {
    @Autowired
    ApplicationRepository applicationRepository;

    public Application get(String applicationId) {
        ApplicationEntity applicationEntity = applicationRepository.getApplicationAbstractById(applicationId);
        Application application = MAPPER.mapToDomain(applicationEntity);
        return application;
    }
}

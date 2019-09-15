package com.lianghong.aws.demo.repository.mapper;

import com.lianghong.aws.demo.domain.Application;
import com.lianghong.aws.demo.domain.ApplicationAbstract;
import com.lianghong.aws.demo.domain.ApplicationLender;
import com.lianghong.aws.demo.domain.ApplicationLoan;
import com.lianghong.aws.demo.domain.ApplicationStatus;
import com.lianghong.aws.demo.repository.entity.ApplicationEntity;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.Map;
import java.util.function.Function;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Mapper
public interface ApplicationEntityMapper {
    ApplicationEntityMapper MAPPER = Mappers.getMapper(ApplicationEntityMapper.class);

    Application mapToDomain(ApplicationEntity applicationEntity);

    @Mapping(source = "pk",target ="applicationId")
    @Mapping(source = "sk",target ="type")
    @Mapping(source = "data",target ="name")
    ApplicationAbstract mapToAbstract(ApplicationEntity applicationEntity);

    @Mapping(source = "pk",target ="applicationId")
    @Mapping(source = "sk",target ="type")
    @Mapping(source = "data",target ="name")
    ApplicationLender mapToLender(ApplicationEntity applicationEntity);

    @Mapping(source = "pk",target ="applicationId")
    @Mapping(source = "sk",target ="type")
    @Mapping(source = "data",target ="name")
    ApplicationLoan mapToLoan(ApplicationEntity applicationEntity);


    @Mapping(source = "pk",target ="applicationId")
    @Mapping(source = "sk",target ="type")
    @Mapping(source = "data",target ="name")
    ApplicationStatus mapToStatus(ApplicationEntity applicationEntity);

    ApplicationEntity mapToEntity(Application application);
}

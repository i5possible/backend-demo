package com.lianghong.aws.demo.repository.mapper;

import com.lianghong.aws.demo.domain.Application;
import com.lianghong.aws.demo.repository.entity.ApplicationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Mapper
public interface ApplicationEntityMapper {
    ApplicationEntityMapper MAPPER = Mappers.getMapper(ApplicationEntityMapper.class);

    Application mapToDomain(ApplicationEntity applicationEntity);
    ApplicationEntity mapToEntity(Application application);
}

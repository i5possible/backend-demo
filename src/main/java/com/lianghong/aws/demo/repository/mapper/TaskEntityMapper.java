package com.lianghong.aws.demo.repository.mapper;

import com.lianghong.aws.demo.domain.Task;
import com.lianghong.aws.demo.repository.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Mapper
public interface TaskEntityMapper {
    TaskEntityMapper MAPPER = Mappers.getMapper(TaskEntityMapper.class);

    Task mapToDomain(TaskEntity task);
    TaskEntity mapToEntity(Task task);
}

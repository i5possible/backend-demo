package com.lianghong.aws.demo.repository.entity;

import com.lianghong.aws.demo.domain.Task;
import com.lianghong.aws.demo.presenter.TaskMapper;
import com.lianghong.aws.demo.presenter.TaskPresenter;
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

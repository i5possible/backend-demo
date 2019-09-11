package com.lianghong.aws.demo.presenter;

import com.lianghong.aws.demo.domain.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author lianghong
 * @date 2019/9/11
 */

// used for domain to presenter
@Mapper
public interface TaskMapper {
    TaskMapper MAPPER = Mappers.getMapper(TaskMapper.class);
    TaskPresenter mapToPresenter(Task task);

}

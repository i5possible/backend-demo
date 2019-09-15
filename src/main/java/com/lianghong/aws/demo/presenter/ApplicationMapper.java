package com.lianghong.aws.demo.presenter;

import com.lianghong.aws.demo.domain.Application;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author lianghong
 * @date 2019/9/11
 */

@Mapper
public interface ApplicationMapper {
    ApplicationMapper MAPPER = Mappers.getMapper(ApplicationMapper.class);
    ApplicationPresenter mapToPresenter(Application application);

}

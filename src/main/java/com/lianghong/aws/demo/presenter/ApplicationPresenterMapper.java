package com.lianghong.aws.demo.presenter;

import com.lianghong.aws.demo.domain.Application;
import com.lianghong.aws.demo.domain.ApplicationAbstract;
import com.lianghong.aws.demo.domain.ApplicationDetails;
import com.lianghong.aws.demo.domain.ApplicationLender;
import com.lianghong.aws.demo.domain.ApplicationLoan;
import com.lianghong.aws.demo.domain.ApplicationStatus;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author lianghong
 * @date 2019/9/11
 */

@Mapper
public interface ApplicationPresenterMapper {
    ApplicationPresenterMapper MAPPER = Mappers.getMapper(ApplicationPresenterMapper.class);
    ApplicationPresenter mapApplicationToPresenter(Application application);

    ApplicationDetailsPresenter mapApplicationDetailsToPresenter(ApplicationDetails application);
}

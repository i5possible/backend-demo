package com.lianghong.aws.demo.repository.mapper;

import com.lianghong.aws.demo.constant.ApplicationContentType;
import com.lianghong.aws.demo.repository.entity.ApplicationEntity;

import java.util.Map;
import java.util.function.Function;

import static com.lianghong.aws.demo.repository.mapper.ApplicationEntityMapper.MAPPER;

/**
 * @author lianghong
 * @date 2019/9/22
 */

public class ApplicationMapper<T> {

    private static Map<ApplicationContentType, Function<ApplicationEntity, ? extends Object>> mapperMap =
            Map.of(ApplicationContentType.APPLICATION_ABSTRACT, MAPPER::mapToAbstract,
                    ApplicationContentType.APPLICATION_LENDER, MAPPER::mapToLender,
                    ApplicationContentType.APPLICATION_LOAN, MAPPER::mapToLoan,
                    ApplicationContentType.APPLICATION_STATUS, MAPPER::mapToStatus
            );

    public T mapTo(String prefix, ApplicationEntity applicationEntity) {
        ApplicationContentType applicationType = ApplicationContentType.ofPrefix(prefix);
        return (T)mapperMap.get(applicationType).apply(applicationEntity);
    }
}

package com.lianghong.aws.demo.constant;

import com.lianghong.aws.demo.domain.ApplicationAbstract;
import com.lianghong.aws.demo.domain.ApplicationLender;
import com.lianghong.aws.demo.domain.ApplicationLoan;
import com.lianghong.aws.demo.domain.ApplicationStatus;
import lombok.Getter;

import java.util.Arrays;

/**
 * @author lianghong
 * @date 2019/9/22
 */

@Getter
public enum ApplicationContentType {
    APPLICATION_ABSTRACT("metadata", ApplicationAbstract.class),
    APPLICATION_LOAN("loans", ApplicationLoan.class),
    APPLICATION_STATUS("status", ApplicationStatus.class),
    APPLICATION_LENDER("lender", ApplicationLender.class),
    EMPTY("", Object.class)
    ;

    private String prefix;
    private Class clazz;

    ApplicationContentType(String prefix, Class clazz) {
        this.prefix = prefix;
        this.clazz = clazz;
    }

    public static ApplicationContentType ofPrefix(String prefix) {
        return Arrays.stream(ApplicationContentType.values())
                .filter(value -> value.getPrefix().equals(prefix))
                .findAny()
                .orElse(EMPTY);
    }
}

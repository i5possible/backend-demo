package com.lianghong.aws.demo.presenter;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
public class ApplicationLoanPresenter {
    private String applicationId;
    private String type;
    private String name;
    private BigDecimal amount;
    private BigDecimal rate;
}

package com.lianghong.aws.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationLoan {
    private String applicationId;
    private String type;
    private String name;
    private BigDecimal amount;
    private BigDecimal rate;
}

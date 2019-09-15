package com.lianghong.aws.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * @author lianghong
 * @date 2019/9/15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationAbstract {
    private String applicationId;
    private String type;
    private String name;
    private BigDecimal lvr;
    private DateTime lastUpdated;
}

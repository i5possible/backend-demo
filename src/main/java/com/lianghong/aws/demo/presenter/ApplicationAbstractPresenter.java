package com.lianghong.aws.demo.presenter;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;

import static com.lianghong.aws.demo.utils.DateTimeUtils.convertToString;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
public class ApplicationAbstractPresenter {
    private String applicationId;
    private String type;
    private String name;
    private BigDecimal lvr;
    private DateTime lastUpdated;

    public String getLastUpdated() {
        return convertToString(lastUpdated);
    }
}

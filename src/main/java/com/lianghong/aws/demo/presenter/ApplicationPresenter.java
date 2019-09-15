package com.lianghong.aws.demo.presenter;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.math.BigDecimal;

import static com.lianghong.aws.demo.utils.DateTimeUtils.convertToString;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
public class ApplicationPresenter {
    private String applicationId;
    private String type;
    private BigDecimal lvr;
    private String name;
    private DateTime lastUpdated;

    public String getLastUpdated() {
        return convertToString(lastUpdated);
    }
}

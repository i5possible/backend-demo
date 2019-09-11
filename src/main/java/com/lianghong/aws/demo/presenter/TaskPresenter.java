package com.lianghong.aws.demo.presenter;

import lombok.Data;
import org.joda.time.DateTime;

import static com.lianghong.aws.demo.utils.DateTimeUtils.convertToString;

/**
 * @author lianghong
 * @date 2019/9/11
 */

// The @Data annotation is needed, or "No converter found for return value of type" will appear
@Data
public class TaskPresenter {
    private String taskId;
    private String content;
    private String status;
    private DateTime dueDate;

    // convert the output from datetime to string
    public String getDueDate() {
        return convertToString(dueDate);
    }
}

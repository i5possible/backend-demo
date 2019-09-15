package com.lianghong.aws.demo.presenter;

import lombok.Data;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
public class ApplicationStatusPresenter {
    private String applicationId;
    private String type;
    private String name;
    private String writer;
}

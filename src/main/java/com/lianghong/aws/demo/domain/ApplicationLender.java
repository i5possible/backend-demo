package com.lianghong.aws.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationLender {
    private String applicationId;
    private String type;
    private String name;
    private String portalLink;
}

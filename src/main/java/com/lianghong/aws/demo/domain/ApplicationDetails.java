package com.lianghong.aws.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationDetails {
    private ApplicationAbstract applicationAbstract;
    private ApplicationLender applicationLender;
    private List<ApplicationLoan> applicationLoans;
    private ApplicationStatus applicationStatus;
}

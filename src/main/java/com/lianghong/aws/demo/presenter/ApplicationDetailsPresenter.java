package com.lianghong.aws.demo.presenter;

import com.lianghong.aws.demo.domain.ApplicationAbstract;
import com.lianghong.aws.demo.domain.ApplicationLender;
import com.lianghong.aws.demo.domain.ApplicationLoan;
import com.lianghong.aws.demo.domain.ApplicationStatus;
import lombok.Data;

import java.util.List;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
public class ApplicationDetailsPresenter {
    private ApplicationAbstractPresenter applicationAbstract;
    private ApplicationLenderPresenter applicationLender;
    private List<ApplicationLoanPresenter> applicationLoans;
    private ApplicationStatusPresenter applicationStatus;
}

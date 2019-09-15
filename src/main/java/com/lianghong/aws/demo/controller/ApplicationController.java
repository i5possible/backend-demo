package com.lianghong.aws.demo.controller;

import com.lianghong.aws.demo.domain.Application;
import com.lianghong.aws.demo.presenter.ApplicationDetailsPresenter;
import com.lianghong.aws.demo.presenter.ApplicationPresenter;
import com.lianghong.aws.demo.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static com.lianghong.aws.demo.presenter.ApplicationPresenterMapper.MAPPER;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@RestController
@RequestMapping("application")
public class ApplicationController {

    private ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping(path = "/{id}")
    public ApplicationPresenter getApplication(@PathVariable String id) {
        Application application = applicationService.get(id);
        ApplicationPresenter applicationPresenter = MAPPER.mapApplicationToPresenter(application);
        return applicationPresenter;
    }

    @GetMapping(path = "/{id}/all")
    public List<ApplicationPresenter> getApplicationAll(@PathVariable String id) {
        return applicationService.getAll(id).stream().map(MAPPER::mapApplicationToPresenter).collect(Collectors.toList());
    }


    @GetMapping(path = "/{id}/details")
    public ApplicationDetailsPresenter getApplicationDetails(@PathVariable String id) {
        return MAPPER.mapApplicationDetailsToPresenter(applicationService.getApplicationDetails(id));
    }

}

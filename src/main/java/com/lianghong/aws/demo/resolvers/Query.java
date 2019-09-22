//package com.lianghong.aws.demo.resolvers;
//
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import com.lianghong.aws.demo.domain.Application;
//import com.lianghong.aws.demo.domain.ApplicationAbstract;
//import com.lianghong.aws.demo.domain.ApplicationDetails;
//import com.lianghong.aws.demo.presenter.ApplicationDetailsPresenter;
//import com.lianghong.aws.demo.presenter.ApplicationPresenter;
//import com.lianghong.aws.demo.presenter.ApplicationPresenterMapper;
//import org.springframework.stereotype.Component;
//
//import java.math.BigDecimal;
//
//import static com.lianghong.aws.demo.presenter.ApplicationPresenterMapper.MAPPER;
//
///**
// * @author lianghong
// * @date 2019/9/22
// */
//
//@Component
//public class Query implements GraphQLQueryResolver {
//
//    public ApplicationDetailsPresenter application() {
//        ApplicationDetails applicationDetails = ApplicationDetails.builder()
//                .applicationAbstract(ApplicationAbstract.builder()
//                        .applicationId("applicationId")
//                        .lvr(BigDecimal.ONE)
//                        .name("application name")
//                        .type("application type")
//                        .build())
//                .build();
//        return MAPPER.mapApplicationDetailsToPresenter(applicationDetails);
//    }
//
//}

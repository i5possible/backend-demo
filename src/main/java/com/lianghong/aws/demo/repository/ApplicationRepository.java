package com.lianghong.aws.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedQueryList;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.lianghong.aws.demo.repository.entity.ApplicationEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lianghong
 * @date 2019/9/10
 */

@Repository
@Slf4j
public class ApplicationRepository {

    @Autowired
    private DynamoDBMapper mapper;

    public ApplicationEntity getApplicationAbstractById(String applicationId) {
        ApplicationEntity entity = mapper.load(ApplicationEntity.class, applicationId, "metadata");
        log.info(String.valueOf(entity));
        return entity;
    }

    public List<ApplicationEntity> getApplicationEntities(String applicationId) {
        DynamoDBQueryExpression<ApplicationEntity> query =
                new DynamoDBQueryExpression<>();
        ApplicationEntity hashKeyValues = ApplicationEntity.builder()
                .pk(applicationId)
                .build();
        query.setHashKeyValues(hashKeyValues);
        PaginatedQueryList<ApplicationEntity> list = mapper.query(ApplicationEntity.class, query);
        return list;
    }

}

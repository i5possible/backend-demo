package com.lianghong.aws.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.lianghong.aws.demo.repository.entity.ApplicationEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

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



}

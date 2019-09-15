package com.lianghong.aws.demo.repository.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

/**
 * @author lianghong
 * @date 2019/9/15
 */

public class ApplicationIdConverter implements DynamoDBTypeConverter<String, String> {


    @Override
    public String convert(String applicationId) {
        return "application-" + applicationId;
    }

    @Override
    public String unconvert(String dynamoDBPK) {
        return dynamoDBPK.substring(dynamoDBPK.indexOf("-") + 1);
    }
}

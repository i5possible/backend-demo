package com.lianghong.aws.demo.repository.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

/**
 * @author lianghong
 * @date 2019/9/15
 */

public class SkPrefix implements DynamoDBTypeConverter<String, String> {


    @Override
    public String convert(String skPrefix) {
        return "";
    }

    @Override
    public String unconvert(String dynamoDBSK) {
        return dynamoDBSK.substring(0, dynamoDBSK.indexOf("-"));
    }
}

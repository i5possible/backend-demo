package com.lianghong.aws.demo.repository.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.lianghong.aws.demo.repository.converter.ApplicationIdConverter;
import com.lianghong.aws.demo.repository.converter.DateTimeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "general")
public class ApplicationEntity {

    @DynamoDBTypeConverted(converter = ApplicationIdConverter.class)
    @DynamoDBAttribute(attributeName = "PK")
    @DynamoDBHashKey
    private String applicationId;

    @DynamoDBAttribute(attributeName = "SK")
    @DynamoDBRangeKey
    private String type;

    @DynamoDBAttribute(attributeName = "LVR")
    private BigDecimal lvr;

    @DynamoDBAttribute(attributeName = "data")
    private String name;

    @DynamoDBTypeConverted(converter = DateTimeConverter.class)
    private DateTime lastUpdated;
}

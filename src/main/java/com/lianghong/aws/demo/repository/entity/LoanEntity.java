package com.lianghong.aws.demo.repository.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.lianghong.aws.demo.repository.converter.ApplicationIdConverter;
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
@DynamoDBTable(tableName = "general")
public class LoanEntity {
    @DynamoDBTypeConverted(converter = ApplicationIdConverter.class)
    private String pk;
}

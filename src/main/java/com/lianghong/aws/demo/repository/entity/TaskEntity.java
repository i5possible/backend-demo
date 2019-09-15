package com.lianghong.aws.demo.repository.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.lianghong.aws.demo.repository.DateTimeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "tasks")
public class TaskEntity {
    @DynamoDBHashKey
    private String taskListId;
    @DynamoDBRangeKey
    private String taskId;
    private String content;
    private String status;
    @DynamoDBTypeConverted(converter = DateTimeConverter.class)
    private DateTime dueDate;
}

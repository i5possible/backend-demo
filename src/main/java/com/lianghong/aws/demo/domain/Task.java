package com.lianghong.aws.demo.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lianghong
 * @date 2019/9/10
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "tasks")
public class Task {
    @DynamoDBHashKey
    private String taskListId;
    @DynamoDBRangeKey
    private String taskId;
    private String content;
    private String status;
    private Date dueDate;
}

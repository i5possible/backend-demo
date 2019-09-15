package com.lianghong.aws.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.lianghong.aws.demo.repository.entity.TaskEntity;
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
public class TaskRepository {

    @Autowired
    private DynamoDBMapper mapper;

    public void add(TaskEntity task) {
        mapper.save(task);
    }

    public TaskEntity get(String taskListId) {
        return mapper.load(TaskEntity.class, taskListId);
    }

    public TaskEntity get(String taskListId, String taskId) {
        return mapper.load(TaskEntity.class, taskListId, taskId);
    }
    public void updateStudentDetails(TaskEntity task) {
        mapper.save(task, buildDynamoDBSaveExpression(task));
    }

    public void deleteStudentDetails(TaskEntity task) {
        mapper.delete(task);
    }

    public DynamoDBSaveExpression buildDynamoDBSaveExpression(TaskEntity task) {
        DynamoDBSaveExpression saveExpression = new DynamoDBSaveExpression();
        Map<String, ExpectedAttributeValue> expected = new HashMap<>();
        expected.put("taskId", new ExpectedAttributeValue(new AttributeValue(task.getTaskId()))
                .withComparisonOperator(ComparisonOperator.EQ));
        saveExpression.setExpected(expected);
        return saveExpression;
    }
}

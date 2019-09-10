package com.lianghong.aws.demo.controller;

import com.lianghong.aws.demo.domain.Task;
import com.lianghong.aws.demo.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lianghong
 * @date 2019/9/10
 */

@RestController()
@RequestMapping("task-list")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("{taskListId}/task/{taskId}")
    public Task getTask(@PathVariable String taskListId, @PathVariable String taskId) {
        return taskService.getTask(taskListId, taskId);
    }
}

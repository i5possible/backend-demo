package com.lianghong.aws.demo.controller;

import com.lianghong.aws.demo.domain.Task;
import com.lianghong.aws.demo.presenter.TaskPresenter;
import com.lianghong.aws.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import static com.lianghong.aws.demo.presenter.TaskMapper.MAPPER;

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
    public TaskPresenter getTask(@PathVariable String taskListId, @PathVariable String taskId) {
        return MAPPER.mapToPresenter(taskService.getTask(taskListId, taskId));
    }

    @PostMapping("{taskListId}/task")
    public Task createTask(@PathVariable String taskListId, @RequestBody Task task) {
        return taskService.createTask(taskListId, task);
    }
}

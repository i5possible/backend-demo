package com.lianghong.aws.demo.service;

import com.lianghong.aws.demo.domain.Task;
import com.lianghong.aws.demo.repository.TaskRepository;
import com.lianghong.aws.demo.repository.entity.TaskEntityMapper;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.lianghong.aws.demo.repository.entity.TaskEntityMapper.MAPPER;

/**
 * @author lianghong
 * @date 2019/9/10
 */

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks(String taskListId) {
        return List.of();
    }

    public Task getTask(String taskListId, String taskId) {
        return MAPPER.mapToDomain(taskRepository.get(taskListId, taskId));
    }

    public Task createTask(String taskListId, Task task) {
        taskRepository.add(MAPPER.mapToEntity(task));
        return null;
    }
}

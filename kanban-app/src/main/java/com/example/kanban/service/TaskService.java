package com.example.kanban.service;

import java.util.List;
import java.util.Optional;

import com.example.kanban.model.Task;
import com.example.kanban.model.TaskDTO;

public interface TaskService {

    List<Task> getAllTasks();

    Optional<Task> getTaskById(Long id);

    Optional<Task> getTaskByTitle(String title);

    Task saveNewTask(TaskDTO taskDTO);

    Task updateTask(Task oldTask, TaskDTO newTaskDTO);

    void deleteTask(Task task);
}

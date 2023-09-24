package br.edu.fateccotia.tasklist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fateccotia.tasklist.model.Task;
import br.edu.fateccotia.tasklist.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public Task save(Task task) {
		return taskRepository.save(task);
	}

	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	
	
	
	
	
	
	
}

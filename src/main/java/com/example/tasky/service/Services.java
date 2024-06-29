package com.example.tasky.service;
import com.example.tasky.model.Model;
import com.example.tasky.exception.TaskNotFound;
import com.example.tasky.jparepo.JpaRepo;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class Services {
@Autowired
JpaRepo jp;
Model model;
public List<Model> getAllTask(){
	return jp.findAll();
}
public Optional<Model> getTaskById(int taskid){
	return jp.findById(taskid);
}
public Model createTask(Model model) {
	return jp.save(model);	
}
public Model updateTask(int taskid,Model modelDetails) {
	model=jp.findById(taskid).orElseThrow(()->new TaskNotFound("Task Not Found with id "+taskid));
	model.setDescription(modelDetails.getDescription());
	model.setTaskdue(modelDetails.getTaskdue());
	model.setStatus(modelDetails.getStatus());
	return jp.save(model);	
}
public void deleteTask(int taskid) {
	model=jp.findById(taskid).orElseThrow(()->new TaskNotFound("Task Not Found with id "+taskid));
	jp.delete(model);
}
public List<Model> getAllTasks(){
	return jp.findAll();
}
}

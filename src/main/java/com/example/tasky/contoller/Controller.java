package com.example.tasky.contoller;
import com.example.tasky.service.Services;
import com.example.tasky.exception.TaskNotFound;
import com.example.tasky.model.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@RestController
@RequestMapping("/tasky")
public class Controller {
@Autowired
Services service;
@GetMapping("/gettasks")
public List<Model> getAllTask(){
	return service.getAllTask();
}
@GetMapping("/gettask/{taskid}")
public ResponseEntity<Model> getTaskById(@PathVariable int taskid){
	Model model=service.getTaskById(taskid).orElseThrow(()-> new TaskNotFound("Task not Found"));
	return ResponseEntity.ok(model);
}
@PostMapping("/addtask")
public Model createTask(@RequestBody Model model) {
	return service.createTask(model);
}
@PutMapping("/updatetask/{taskid}")
public ResponseEntity<Model> updateTask(@PathVariable int taskid,@RequestBody Model modeldetails){
	Model updatedTasks=service.updateTask(taskid, modeldetails);
	return ResponseEntity.ok(updatedTasks);
} 
@DeleteMapping("/deletetask/{taskid}")
	public ResponseEntity<Void> deleteTask(@PathVariable int taskid){
		service.deleteTask(taskid);
		return ResponseEntity.noContent().build();
	}
}


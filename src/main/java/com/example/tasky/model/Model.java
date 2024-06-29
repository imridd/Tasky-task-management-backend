package com.example.tasky.model;
import jakarta.persistence.*;
import java.time.*;
@Entity
public class Model {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int taskid;
String taskname;
String description;
String Status;
LocalTime taskdue;
public int getTaskid() {
	return taskid;
}
public void setTaskid(int taskid) {
	this.taskid = taskid;
}
public String getTaskname() {
	return taskname;
}
public void setTaskname(String taskname) {
	this.taskname = taskname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public LocalTime getTaskdue() {
	return taskdue;
}
public void setTaskdue(LocalTime taskdue) {
	this.taskdue = taskdue;
}
}

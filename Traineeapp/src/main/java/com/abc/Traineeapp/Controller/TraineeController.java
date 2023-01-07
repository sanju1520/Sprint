package com.abc.Traineeapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.Traineeapp.Service.TraineeService;
import com.abc.Traineeapp.entity.Trainee;

@RestController
public class TraineeController {
	@Autowired
	private TraineeService traineeService;
	
	@GetMapping("/trainee/all")
	public List<Trainee>fetchAllTrainee(){
		List<Trainee> list=traineeService.getAllTrainee();
		return list;
	}
	@GetMapping("/trainee/{id}")
	public ResponseEntity<Trainee> fetchTraineeDetails(@PathVariable("id")int traineeId){
		Trainee trainee=traineeService.getTraineeById(traineeId);
		ResponseEntity<Trainee> responseEntity=new ResponseEntity<>(trainee,HttpStatus.OK);
		return responseEntity;
	}
	@PostMapping("/trainee/save")
	public ResponseEntity<Trainee> addTrainee(@RequestBody Trainee trainee){
		Trainee newTrainee=traineeService.saveTrainee(trainee);
		ResponseEntity<Trainee> responseEntity=new ResponseEntity<>(newTrainee,HttpStatus.CREATED);
		return responseEntity;
	}
	
	@DeleteMapping("/trainee/delete/{id}")
	public ResponseEntity<String>removeTrainee(@PathVariable("id")int traineeId){
		traineeService.deleteTrainee(traineeId);
		ResponseEntity<String> responseEntity=new ResponseEntity<>("Trainee deleted successfully",HttpStatus.OK);
		return responseEntity;
	}
	
	@PutMapping("/trainee/update")
	public ResponseEntity<Trainee>modifyProduct(@RequestBody Trainee trainee){
		Trainee updatedTrainee=traineeService.updateTrainee(trainee);
		ResponseEntity <Trainee>responseEntity=new ResponseEntity<>(updatedTrainee,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/trainee/name/{name}")
	public ResponseEntity<Trainee> getTraineeDetails(@PathVariable("name")String traineeName){
		Trainee trainee=traineeService.getTraineeByName(traineeName);
		ResponseEntity<Trainee> responseEntity=new ResponseEntity<>(trainee,HttpStatus.OK);
		return responseEntity;
	}
}

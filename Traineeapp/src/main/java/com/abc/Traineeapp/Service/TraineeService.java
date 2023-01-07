package com.abc.Traineeapp.Service;

import java.util.List;

import com.abc.Traineeapp.entity.Trainee;

public interface TraineeService {
	public Trainee saveTrainee(Trainee trainee);
	
	public Trainee getTraineeById(int traineeId);
	
	public List<Trainee> getAllTrainee();
	
	public void deleteTrainee(int traineeId);
	
	public Trainee updateTrainee(Trainee trainee);
	
	public Trainee getTraineeByName(String name);

}

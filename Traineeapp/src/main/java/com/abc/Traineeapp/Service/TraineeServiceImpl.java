package com.abc.Traineeapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.Traineeapp.entity.Trainee;
import com.abc.Traineeapp.exception.TraineeNotFoundException;
import com.abc.Traineeapp.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService{
	@Autowired
	private TraineeRepository traineeRepository;
	
	@Override
	public Trainee saveTrainee(Trainee trainee) {
		Trainee newTrainee= traineeRepository.save(trainee);
		return newTrainee;
	}

	@Override
	public Trainee getTraineeById(int traineeId) {
		Optional<Trainee> optionalTrainee=traineeRepository.findById(traineeId);
		if (optionalTrainee.isEmpty()) {
			throw new TraineeNotFoundException("Trainee not found with id"+traineeId);
		}
		Trainee trainee=optionalTrainee.get();
		return trainee;
	}

	@Override
	public List<Trainee> getAllTrainee() {
		List<Trainee> trainees=traineeRepository.findAll();
		return trainees;
	}

	@Override
	public void deleteTrainee(int traineeId) {
		Optional<Trainee> optionalTrainee=traineeRepository.findById(traineeId);
		if(optionalTrainee.isEmpty()) {
			throw new TraineeNotFoundException("trainee not found with id: "+traineeId);
		}
		traineeRepository.deleteById(traineeId);
		
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		Optional<Trainee> optionalTrainee=traineeRepository.findById(trainee.getTraineeId());
		if(optionalTrainee.isEmpty()) {
			throw new TraineeNotFoundException("trainee not found with id: "+trainee.getTraineeId());
		}
		Trainee updatedTrainee=traineeRepository.save(trainee);
		return updatedTrainee;
	}

	@Override
	public Trainee getTraineeByName(String name) {
		Trainee trainee= traineeRepository.findBytraineeName(name);
		if(trainee==null) {
			throw new TraineeNotFoundException("trainee not found with thw name: "+name);
		}
		else {
		return trainee;
		}
	}

}

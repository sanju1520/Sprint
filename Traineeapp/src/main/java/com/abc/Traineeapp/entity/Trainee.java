package com.abc.Traineeapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee_tbl")
public class Trainee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="trainee_id")
	private int traineeId;
	
	@Column(name="trainee_Name")
	private String traineeName;
	
	@Column(name="trainee_Domain")
	private String traineeDomain;
	
	@Column(name="trainee_Location")
	private String traineeLoacation;
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public String getTraineeLoacation() {
		return traineeLoacation;
	}
	public void setTraineeLoacation(String traineeLoacation) {
		this.traineeLoacation = traineeLoacation;
	}
	
	


}

package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.gl.dao.TrainDetailsDao;
import com.gl.model.TrainDetails;

@Service
public class TrainDetailService {
	
	@Autowired
	TrainDetailsDao trainDao;
	
	
	public List <TrainDetails> getAllTrainsSvc()
	{
		return trainDao.getAllTrains();
	}

}

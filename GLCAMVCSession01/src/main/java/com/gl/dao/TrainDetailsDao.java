package com.gl.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.model.TrainDetails;

@Repository
public class TrainDetailsDao {

	ArrayList <TrainDetails> trains = new ArrayList<TrainDetails>();

	public TrainDetailsDao() {
		
		TrainDetails train1 = new TrainDetails("TR001","Shathabdhi","Bangalore","Mysore",1111,140);
		TrainDetails train2 = new TrainDetails("TR002","LalBagh","Bangalore","Chennai",2222,340);
		TrainDetails train3 = new TrainDetails("TR003","KanyaKumaryExpress","Bangalore","KanyaKumari",3333,940);
		TrainDetails train4 = new TrainDetails("TR004","HyderabadExpress","Bangalore","Hyderabad",4444,400);
		TrainDetails train5 = new TrainDetails("TR005","KKExpress","Bangalore","Hubli",5555,440);
		
		trains.add(train1);
		trains.add(train2);
		trains.add(train3);
		trains.add(train4);
		trains.add(train5);
	}
	
	public List <TrainDetails> getAllTrains()
	{
		return trains;
	}
	
	
}

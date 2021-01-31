package com.livtrain.demo.service;

import java.util.List;

import com.livtrain.demo.Entity.TrainDetails;

public interface DetailsService {

	public List<TrainDetails> getdetails();

	public TrainDetails putdetails(TrainDetails traindetails);

}

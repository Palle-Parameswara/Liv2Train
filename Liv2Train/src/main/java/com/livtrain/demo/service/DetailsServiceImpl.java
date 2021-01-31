package com.livtrain.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livtrain.demo.DAO.DetailsRepository;
import com.livtrain.demo.Entity.TrainDetails;

@Service
public class DetailsServiceImpl implements DetailsService {
	@Autowired
	private DetailsRepository detailsrepository;
	
	@Override
	@Transactional
	public List<TrainDetails> getdetails() {
		return detailsrepository.findAll();
	}

	@Override
	@Transactional
	public TrainDetails putdetails(TrainDetails traindetails) {
		return detailsrepository.save(traindetails);
	}

}

package com.livtrain.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livtrain.demo.Entity.TrainDetails;

public interface DetailsRepository extends JpaRepository<TrainDetails,Integer>{

}

package com.example.rest.service;

import com.example.rest.entities.TrainingCenter;
import com.example.rest.repository.TrainingCenterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TrainingCenterService {
    @Autowired
    TrainingCenterDao trainingCenterDao;

    public List<TrainingCenter> getAllTrainingCenters()
    {
        return trainingCenterDao.findAll();
    }

    public TrainingCenter addTrainingCenter(TrainingCenter trainingCenter)
    {
        trainingCenter.setCreatedOn(LocalDateTime.now());
        return this.trainingCenterDao.save(trainingCenter);
    }
}

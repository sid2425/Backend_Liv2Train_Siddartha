package com.example.rest.controller;

import com.example.rest.entities.TrainingCenter;
import com.example.rest.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
@Validated
public class MainController {
    // Dependency Injection - object instatiation
    @Autowired
    TrainingCenterService trainingCenterService;

    /*Defining route to get all training centers stored in database
    with METHOD="GET"
     */
    @RequestMapping(value="/all",method = RequestMethod.GET)
    public List<TrainingCenter> getAllTrainingCenters()
    {
        return this.trainingCenterService.getAllTrainingCenters();
    }


    /*
    Defining route to create a resource on database
     */
    @PostMapping("/addTrainingCenter")
    @ResponseBody
    public TrainingCenter addTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter)
    {
        return this.trainingCenterService.addTrainingCenter(trainingCenter);
    }
}

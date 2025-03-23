package com.Indian.RailwayTimeAndDistance.Contorller;

import com.Indian.RailwayTimeAndDistance.Entity.Train;
import com.Indian.RailwayTimeAndDistance.Service.TrainService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    private TrainService trainService;
    public TrainController(TrainService trainService)
    {
        this.trainService = trainService;
    }

    @GetMapping
    public List<Train> getAllTrains()
    {
        return trainService.getAllTrains();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train)
    {
        return trainService.addTrain(train);
    }
}

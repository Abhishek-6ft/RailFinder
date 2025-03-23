package com.Indian.RailwayTimeAndDistance.Contorller;

import com.Indian.RailwayTimeAndDistance.Entity.TrainSchedule;
import com.Indian.RailwayTimeAndDistance.Service.TrainSearchService;
import com.Indian.RailwayTimeAndDistance.Service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
@CrossOrigin
public class TrainSearchController {

    private TrainSearchService trainSearchService;

    public TrainSearchController(TrainSearchService trainSearchService)
    {
        this.trainSearchService = trainSearchService;
    }

    @GetMapping("/by-code")
    public List<TrainSchedule> findTrainByStatoionCode(@RequestParam String sourceCode, @RequestParam String destinationCode)
    {
        return trainSearchService.findTrainByStatoionCode(sourceCode.toUpperCase(), destinationCode.toUpperCase());
    }

    @RequestMapping("/by-name")
    public List<TrainSchedule> findTrainByStatoionName(@RequestParam String sourceName, @RequestParam String destinationName)
    {
        return trainSearchService.findTrainByStatoionName(sourceName.toUpperCase(), destinationName.toUpperCase());
    }
}

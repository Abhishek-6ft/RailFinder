package com.Indian.RailwayTimeAndDistance.Service;

import com.Indian.RailwayTimeAndDistance.Contorller.TrainSearchController;
import com.Indian.RailwayTimeAndDistance.Entity.Train;
import com.Indian.RailwayTimeAndDistance.Entity.TrainSchedule;
import com.Indian.RailwayTimeAndDistance.Repo.TrainScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearchService {

    private TrainScheduleRepository trainScheduleRepository;

    public TrainSearchService(TrainScheduleRepository trainScheduleRepository)
    {
        this.trainScheduleRepository= trainScheduleRepository;
    }


    public List<TrainSchedule> findTrainByStatoionCode(String sourceCode, String destinationCode) {
        return trainScheduleRepository.
                findBySource_StationCodeAndDestination_StationCode(sourceCode, destinationCode);
    }

    public List<TrainSchedule> findTrainByStatoionName(String sourceName, String destinationName) {

        return trainScheduleRepository.
                findBySource_StationNameAndDestination_StationName(sourceName, destinationName);
    }
}

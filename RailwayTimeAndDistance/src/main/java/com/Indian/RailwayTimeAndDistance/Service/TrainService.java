package com.Indian.RailwayTimeAndDistance.Service;

import com.Indian.RailwayTimeAndDistance.Entity.Train;
import com.Indian.RailwayTimeAndDistance.Repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {


    private TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository)
    {
        this.trainRepository = trainRepository;
    }


    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }
}

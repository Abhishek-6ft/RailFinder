package com.Indian.RailwayTimeAndDistance.Contorller;

import com.Indian.RailwayTimeAndDistance.Entity.Station;
import com.Indian.RailwayTimeAndDistance.Entity.Train;
import com.Indian.RailwayTimeAndDistance.Entity.TrainSchedule;
import com.Indian.RailwayTimeAndDistance.Repo.StationRepository;
import com.Indian.RailwayTimeAndDistance.Repo.TrainRepository;
import com.Indian.RailwayTimeAndDistance.Repo.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    StationRepository stationRepository;

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    TrainScheduleRepository trainScheduleRepository;

    @GetMapping
    public void test()
    {
        Station delhi = new Station(null, "New Delhi", "NDLS");
        Station mumbai = new Station(null, "Chhatrapati Shivaji Maharaj Terminus", "CSMT");
        Station kolkata = new Station(null, "Kolkata Railway Station", "KOAA");
        Station chennai = new Station(null, "Chennai Central", "MAS");
        Station bihar = new Station(null, "Gaya Junction", "GAYA");

        stationRepository.saveAll(List.of(delhi, mumbai, kolkata, chennai, bihar));

        Train rajdhani = new Train(null, "Rajdhani Express", "12360" ,null);
        Train goldenTempleMail = new Train(null, "Golden Temple Mail", "12904" ,null);
        Train shatabdi = new Train(null, "Shatabdi Express", "12555" ,null);
        Train duranto = new Train(null, "Duranto Express", "12990" ,null);
        Train mahabodhi = new Train(null, "Mahabodhi Express", "23902" ,null);

        trainRepository.saveAll(List.of(rajdhani,goldenTempleMail,duranto,shatabdi,mahabodhi));

        TrainSchedule sc1 = new TrainSchedule(null,duranto,kolkata,mumbai,"5:45","8:15");
        TrainSchedule sc2 = new TrainSchedule(null,goldenTempleMail,mumbai,delhi,"4:00","23:35");
        TrainSchedule sc3 = new TrainSchedule(null,shatabdi,chennai,bihar,"6:35","10:40");
        TrainSchedule sc4 = new TrainSchedule(null,rajdhani,chennai,kolkata,"6:00","18:00");
        TrainSchedule sc5 = new TrainSchedule(null,mahabodhi,delhi,bihar,"12:25","2:55");

        trainScheduleRepository.saveAll(List.of(sc1,sc2,sc3,sc4,sc5));

        System.out.println("Data insert in Data Base");

    }
}

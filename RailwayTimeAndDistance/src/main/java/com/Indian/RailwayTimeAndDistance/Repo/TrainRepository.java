package com.Indian.RailwayTimeAndDistance.Repo;

import com.Indian.RailwayTimeAndDistance.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
}



package com.Indian.RailwayTimeAndDistance.Repo;

import com.Indian.RailwayTimeAndDistance.Entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
}

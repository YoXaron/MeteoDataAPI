package com.yoxaron.Service.repositories;

import com.yoxaron.Service.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}

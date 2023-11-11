package com.yoxaron.Service.services;

import com.yoxaron.Service.models.Measurement;
import com.yoxaron.Service.repositories.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class MeasurementService {

    private final MeasurementRepository measurementRepository;
    private final SensorService sensorService;

    @Autowired
    public MeasurementService(MeasurementRepository measurementRepository, SensorService sensorService) {
        this.measurementRepository = measurementRepository;
        this.sensorService = sensorService;
    }

    public List<Measurement> findAll() {
        return measurementRepository.findAll();
    }

    @Transactional
    public void addMeasurement(Measurement measurement) {
        enrichMeasurement(measurement);
        measurementRepository.save(measurement);
    }

    public void enrichMeasurement(Measurement measurement) {

//        в json-е measurement в поле sensor приходит просто строка и hibernate не знвет, что это объект,
//        поэтому сенсор нужно найти по имени в БД и hibernate поймет, что это объект и вставит его в
//        persistence context. После чего через сеттер связываем sensor с measurement, и measurement
//        можно сохранить в БД и ошибки не будет

        measurement.setSensor(sensorService.findByName(measurement.getSensor().getName()).get());
        measurement.setDateTime(LocalDateTime.now());
    }
}

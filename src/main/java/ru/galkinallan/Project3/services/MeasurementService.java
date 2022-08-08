package ru.galkinallan.Project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.galkinallan.Project3.models.Measurement;
import ru.galkinallan.Project3.repositories.MeasurementsRepo;

import java.time.LocalDateTime;

@Service
@Transactional(readOnly = true)
public class MeasurementService {
    private MeasurementsRepo measurementsRepo;
    private final SensorService sensorService;

    @Autowired
    public MeasurementService(MeasurementsRepo measurementsRepo, SensorService sensorService) {
        this.measurementsRepo = measurementsRepo;
        this.sensorService = sensorService;
    }

    @Transactional
    public void saveMeasurement(Measurement measurement) {
        measurement.setSensor(sensorService.findByName(measurement.getSensor().getName()));
        measurement.setMeasurementDateTime(LocalDateTime.now());
        measurementsRepo.save(measurement);
    }


}

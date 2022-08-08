package ru.galkinallan.Project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.galkinallan.Project3.models.Sensor;
import ru.galkinallan.Project3.repositories.SensorRepo;

@Service
@Transactional(readOnly = true)
public class SensorService {

    private final SensorRepo sensorRepo;

    @Autowired
    public SensorService(SensorRepo sensorRepo) {
        this.sensorRepo = sensorRepo;
    }


    @Transactional
    public void save(Sensor sensor) {
        sensorRepo.save(sensor);
    }

    public Sensor findByName(String name) {
        return sensorRepo.findByName(name);
    }












}

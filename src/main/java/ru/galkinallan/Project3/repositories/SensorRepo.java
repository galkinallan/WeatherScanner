package ru.galkinallan.Project3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.galkinallan.Project3.models.Sensor;

public interface SensorRepo extends JpaRepository<Sensor, Long> {
    public Sensor findByName(String name);
}

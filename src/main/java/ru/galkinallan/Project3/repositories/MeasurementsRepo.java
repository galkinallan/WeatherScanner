package ru.galkinallan.Project3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.galkinallan.Project3.models.Measurement;

public interface MeasurementsRepo extends JpaRepository<Measurement, Long> {
}

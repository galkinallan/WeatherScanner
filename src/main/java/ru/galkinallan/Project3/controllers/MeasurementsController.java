package ru.galkinallan.Project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.galkinallan.Project3.models.Measurement;
import ru.galkinallan.Project3.services.MeasurementService;

@RestController
@RequestMapping("/measurements")
public class MeasurementsController {
    private final MeasurementService measurementService;

    @Autowired
    public MeasurementsController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> add(@RequestBody Measurement measurement) {
        measurementService.saveMeasurement(measurement);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}

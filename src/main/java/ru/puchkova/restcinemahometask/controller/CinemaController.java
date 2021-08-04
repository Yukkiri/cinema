package ru.puchkova.restcinemahometask.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.puchkova.restcinemahometask.controller.dto.CinemaDto;
import ru.puchkova.restcinemahometask.controller.dto.CinemaScheduleDto;
import ru.puchkova.restcinemahometask.data.repository.CinemaRepository;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private CinemaRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    CinemaController(CinemaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cinemas")
    List<CinemaDto> all() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/cinemas/{id}/schedule")
    List<CinemaScheduleDto> schedule() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}

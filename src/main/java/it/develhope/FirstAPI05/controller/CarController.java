package it.develhope.FirstAPI05.controller;

import it.develhope.FirstAPI05.DTO.CarDTO;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/cars")
public class CarController {

    @GetMapping
    public CarDTO getCar(HttpServletResponse response){
        CarDTO carDTO = new CarDTO();
        return carDTO;
    }

}

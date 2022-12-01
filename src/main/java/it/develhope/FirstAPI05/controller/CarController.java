package it.develhope.FirstAPI05.controller;

import it.develhope.FirstAPI05.DTO.CarDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/cars")
public class CarController {

    @GetMapping
    public CarDTO getCar(){;
        return new CarDTO("VW2022","VW T-ROC",28.000);
    }

    @PostMapping
    public String printCarDTO(@Valid @RequestBody(required = false) CarDTO carDTO){
        System.out.println(getCar());
        return HttpStatus.CREATED.getReasonPhrase() + " Http code is: "+ HttpStatus.CREATED.value();
    }


}

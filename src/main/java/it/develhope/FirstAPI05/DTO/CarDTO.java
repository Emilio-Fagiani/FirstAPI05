package it.develhope.FirstAPI05.DTO;

import jakarta.validation.constraints.NotBlank;

public class CarDTO {

    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String modelName;
    private double price;

}

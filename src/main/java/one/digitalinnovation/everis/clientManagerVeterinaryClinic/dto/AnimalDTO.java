package one.digitalinnovation.everis.clientManagerVeterinaryClinic.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AnimalDTO {

    private long id;

    @NotBlank
    private String animalType;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotBlank
    private String animalRace;

    @NotNull
    @Size(max = 3)
    private Integer age;

    @NotBlank
    private String color;

    @NotNull
    private Double weight;

    @Valid
    @NotNull
    private ClientDTO client;
}

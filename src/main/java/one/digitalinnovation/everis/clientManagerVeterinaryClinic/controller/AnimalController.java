package one.digitalinnovation.everis.clientManagerVeterinaryClinic.controller;

import one.digitalinnovation.everis.clientManagerVeterinaryClinic.dto.AnimalDTO;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.dto.MessageResponseDTO;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController //spring controller
@RequestMapping("/api/v1/animals")
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping //
    public MessageResponseDTO create(@RequestBody @Valid AnimalDTO animalDTO){
        return animalService.create(animalDTO);
    }
}

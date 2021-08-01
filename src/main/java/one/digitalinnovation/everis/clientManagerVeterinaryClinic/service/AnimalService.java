package one.digitalinnovation.everis.clientManagerVeterinaryClinic.service;

import one.digitalinnovation.everis.clientManagerVeterinaryClinic.dto.MessageResponseDTO;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.entity.Animal;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public MessageResponseDTO create(Animal animal){
        Animal savedAnimal = animalRepository.save(animal);
        return MessageResponseDTO.builder()
                .message("Animal created with ID: " + savedAnimal.getId())
                .build();
    }
}

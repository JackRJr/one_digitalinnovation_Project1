package one.digitalinnovation.everis.clientManagerVeterinaryClinic.service;

import one.digitalinnovation.everis.clientManagerVeterinaryClinic.dto.AnimalDTO;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.dto.MessageResponseDTO;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.entity.Animal;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.mapper.AnimalMapper;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    private final AnimalMapper animalMapper = AnimalMapper.INSTANCE;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {

        this.animalRepository = animalRepository;
    }

    public MessageResponseDTO create(AnimalDTO animalDTO){
        Animal animalToSave = animalMapper.toModel(animalDTO);

        Animal savedAnimal = animalRepository.save(animalToSave);
        return MessageResponseDTO.builder()
                .message("Animal created with ID: " + savedAnimal.getId())
                .build();
    }

    public AnimalDTO findById(Long id) {
        Optional<Animal> optionalAnimal = animalRepository.findById(id);
        return animalMapper.toDTO(optionalAnimal.get());
    }
}

package one.digitalinnovation.everis.clientManagerVeterinaryClinic.mapper;

import one.digitalinnovation.everis.clientManagerVeterinaryClinic.dto.AnimalDTO;
import one.digitalinnovation.everis.clientManagerVeterinaryClinic.entity.Animal;
import org.mapstruct.factory.Mappers;

public interface AnimalMapper {

    AnimalMapper INSTANCE = Mappers.getMapper(AnimalMapper.class);

    Animal toModel(AnimalDTO animalDTO);

    AnimalDTO toDTO(Animal animal);
}

package one.digitalinnovation.everis.clientManagerVeterinaryClinic.repository;

import one.digitalinnovation.everis.clientManagerVeterinaryClinic.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}

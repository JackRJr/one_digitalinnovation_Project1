package one.digitalinnovation.everis.clientManagerVeterinaryClinic.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus //(HttpStatus.NOT_FOUND)
public class AnimalNotFoundException extends Exception {
    public AnimalNotFoundException(Long id) {
        super(String.format("Animal with ID not found", id));
    }
}

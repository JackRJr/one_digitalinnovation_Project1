package one.digitalinnovation.everis.clientManagerVeterinaryClinic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Data //Getters and Setters (Lombok)
@Builder //Object constructor
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String animalType;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String animalRace;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private Double weight;

}

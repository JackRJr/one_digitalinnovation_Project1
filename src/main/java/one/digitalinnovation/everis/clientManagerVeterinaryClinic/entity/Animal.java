package one.digitalinnovation.everis.clientManagerVeterinaryClinic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "client_id")
    private Client client;

}

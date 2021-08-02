package one.digitalinnovation.everis.clientManagerVeterinaryClinic.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotBlank
    @Size(max = 11)
    @Pattern(regexp = "\\d{3}.\\d{3}.\\d{3}-\\d{2}")
    private String cpf;

    @NotBlank
    @Size(max = 11)
    private String phoneNumber;
}

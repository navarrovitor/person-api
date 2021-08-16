package navarro.vitor.personapi.dto.request;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import navarro.vitor.personapi.entity.Phone;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
  private Long id;

  @NotEmpty
  @Size(min = 3, max = 15)
  private String firstName;

  @NotEmpty
  @Size(min = 3, max = 15)
  private String lastName;

  @NotEmpty
  @Size(min = 9, max = 9)
  private String ssn;

  private LocalDate birthDate;

  @Valid
  @NotEmpty
  private List<Phone> phones;
}
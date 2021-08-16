package navarro.vitor.personapi.dto.request;

import java.time.LocalDate;
import java.util.List;

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

  private String firstName;

  private String lastName;

  private String ssn;

  private LocalDate birthDate;

  private List<Phone> phones;
}

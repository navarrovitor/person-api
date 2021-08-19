package navarro.vitor.personapi.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

  private String birthDate;

  @Valid
  @NotEmpty
  private List<PhoneDTO> phones;
}
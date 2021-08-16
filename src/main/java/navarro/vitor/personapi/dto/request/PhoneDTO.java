package navarro.vitor.personapi.dto.request;

import lombok.*;
import navarro.vitor.personapi.enums.PhoneType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
  private Long id;

  private PhoneType type;

  private String number;
}

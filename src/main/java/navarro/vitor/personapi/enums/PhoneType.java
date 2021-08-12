package navarro.vitor.personapi.enums;

import lombok.*;

@Getter
@AllArgsConstructor
public enum PhoneType {
  HOME("Home"), MOBILE("Mobile"), COMMERCIAL("Commercial");

  private final String description;
}

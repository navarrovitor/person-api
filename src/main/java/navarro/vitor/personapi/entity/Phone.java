package navarro.vitor.personapi.entity;

import navarro.vitor.personapi.enums.PhoneType;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private PhoneType type;

  @Column(nullable = false)
  private String number;
}

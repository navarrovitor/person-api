package navarro.vitor.personapi.utils;

import navarro.vitor.personapi.dto.request.PersonDTO;
import navarro.vitor.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Vitor";
    private static final String LAST_NAME = "Navarro";
    private static final String SSN_NUMBER = "001113337";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder().firstName(FIRST_NAME).lastName(LAST_NAME).ssn(SSN_NUMBER).birthDate("2010-04-04")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO())).build();
    }

    public static Person createFakeEntity() {
        return Person.builder().id(PERSON_ID).firstName(FIRST_NAME).lastName(LAST_NAME).ssn(SSN_NUMBER)
                .birthDate(BIRTH_DATE).phones(Collections.singletonList(PhoneUtils.createFakeEntity())).build();
    }
}

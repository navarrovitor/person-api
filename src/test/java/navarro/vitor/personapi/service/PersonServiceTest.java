package navarro.vitor.personapi.service;

import navarro.vitor.personapi.dto.request.PersonDTO;
import navarro.vitor.personapi.dto.response.MessageResponseDTO;
import navarro.vitor.personapi.entity.Person;
import navarro.vitor.personapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static navarro.vitor.personapi.utils.PersonUtils.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

  @Mock
  private PersonRepository personRepository;

  @InjectMocks
  private PersonService personService;

  @Test
  void testGivenPersonDTOThenReturnSavedMessage() {
    PersonDTO personDTO = createFakeDTO();
    Person expectedSavedPerson = createFakeEntity();

    when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

    MessageResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPerson.getId());
    MessageResponseDTO succesMessage = personService.createPerson(personDTO);

    assertEquals(expectedSuccessMessage, succesMessage);
  }

  private MessageResponseDTO createExpectedMessageResponse(Long id) {
    return MessageResponseDTO.builder().message("Created person with ID " + id).build();
  }
}

package navarro.vitor.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import navarro.vitor.personapi.dto.response.MessageResponseDTO;
import navarro.vitor.personapi.entity.Person;
import navarro.vitor.personapi.repository.PersonRepository;

@Service
public class PersonService {
  private PersonRepository personRepository;

  @Autowired
  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public MessageResponseDTO createPerson(Person person) {
    Person savedPerson = personRepository.save(person);
    return MessageResponseDTO.builder().message("created person with id " + savedPerson.getId()).build();
  }
}

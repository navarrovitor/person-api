package navarro.vitor.personapi.controller;

import navarro.vitor.personapi.dto.response.MessageResponseDTO;
import navarro.vitor.personapi.entity.Person;
import navarro.vitor.personapi.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

  private PersonRepository personRepository;

  @Autowired
  public PersonController(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @PostMapping
  public MessageResponseDTO createPerson(@RequestBody Person person) {
    Person savedPerson = personRepository.save(person);
    return MessageResponseDTO.builder().message("created person with id " + savedPerson.getId()).build();
  }

}

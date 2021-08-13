package navarro.vitor.personapi.controller;

import navarro.vitor.personapi.dto.response.MessageResponseDTO;
import navarro.vitor.personapi.entity.Person;
import navarro.vitor.personapi.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

  private PersonService personService;

  @Autowired
  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MessageResponseDTO createPerson(@RequestBody Person person) {
    return personService.createPerson(person);
  }

}

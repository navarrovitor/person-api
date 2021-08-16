package navarro.vitor.personapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import navarro.vitor.personapi.dto.request.PersonDTO;
import navarro.vitor.personapi.dto.response.MessageResponseDTO;
import navarro.vitor.personapi.entity.Person;
import navarro.vitor.personapi.exception.PersonNotFoundException;
import navarro.vitor.personapi.mapper.PersonMapper;
import navarro.vitor.personapi.repository.PersonRepository;

@Service
public class PersonService {

  private PersonRepository personRepository;

  private final PersonMapper personMapper = PersonMapper.INSTANCE;

  @Autowired
  public PersonService(PersonRepository personRepository) {

    this.personRepository = personRepository;
  }

  public MessageResponseDTO createPerson(PersonDTO personDTO) {
    Person personToSave = personMapper.toModel(personDTO);

    Person savedPerson = personRepository.save(personToSave);
    return MessageResponseDTO.builder().message("created person with id " + savedPerson.getId()).build();
  }

  public List<PersonDTO> listAll() {
    List<Person> allPeople = personRepository.findAll();
    return allPeople.stream().map(personMapper::toDTO).collect(Collectors.toList());
  }

  public PersonDTO findById(Long id) throws PersonNotFoundException {
    Person person = verifyIfExists(id);
    return personMapper.toDTO(person);
  }

  public void delete(Long id) throws PersonNotFoundException {
    verifyIfExists(id);
    personRepository.deleteById(id);
  }

  private Person verifyIfExists(Long id) throws PersonNotFoundException {
    return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
  }

}

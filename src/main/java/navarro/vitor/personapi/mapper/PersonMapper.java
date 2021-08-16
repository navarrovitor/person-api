package navarro.vitor.personapi.mapper;

import navarro.vitor.personapi.dto.request.PersonDTO;
import navarro.vitor.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

  PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

  @Mapping(target = "birthDate", source = "birthDate", dateFormat = "yyyy-MM-dd")
  Person toModel(PersonDTO personDTO);

  PersonDTO toDTO(Person person);
}

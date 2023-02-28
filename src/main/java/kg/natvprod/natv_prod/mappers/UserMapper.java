package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.entities.User;
import kg.natvprod.natv_prod.entities.dto.UserDto;
import org.apache.catalina.UserDatabase;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto userDtoToUser(User user);

    @InheritInverseConfiguration
    User userDtoToUser(UserDto userDto);
}

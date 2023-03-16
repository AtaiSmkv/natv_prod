package kg.natvprod.natv_prod.mappers;

import kg.natvprod.natv_prod.models.entities.User;
import kg.natvprod.natv_prod.models.dto.UserDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto userDtoToUser(User user);

    @InheritInverseConfiguration
    User userDtoToUser(UserDto userDto);
}

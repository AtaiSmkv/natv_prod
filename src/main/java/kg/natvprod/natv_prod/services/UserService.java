package kg.natvprod.natv_prod.services;

import kg.natvprod.natv_prod.models.entities.User;
import kg.natvprod.natv_prod.models.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    List<User> findAll();
}

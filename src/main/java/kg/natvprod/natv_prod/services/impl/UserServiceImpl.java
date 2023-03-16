package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.models.entities.User;
import kg.natvprod.natv_prod.models.dto.UserDto;
import kg.natvprod.natv_prod.mappers.UserMapper;
import kg.natvprod.natv_prod.repository.UserRepo;
import kg.natvprod.natv_prod.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    public UserServiceImpl( UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @Override
    public UserDto save(UserDto userDto) {
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user = userRepo.save(user);
        userDto.setId(user.getId());
        return userDto;
    }
    @Override
    public List <User> findAll() {
        return userRepo.findAll();
    }
}

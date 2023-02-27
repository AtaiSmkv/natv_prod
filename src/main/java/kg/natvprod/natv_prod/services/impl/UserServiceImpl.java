package kg.natvprod.natv_prod.services.impl;

import kg.natvprod.natv_prod.entities.User;
import kg.natvprod.natv_prod.entities.dto.UserDto;
import kg.natvprod.natv_prod.mappers.UserMapper;
import kg.natvprod.natv_prod.repository.UserRepo;
import kg.natvprod.natv_prod.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepo userRepo;

    public UserServiceImpl(UserMapper userMapper, UserRepo userRepo) {
        this.userMapper = userMapper;
        this.userRepo = userRepo;
    }


    @Override
    public UserDto save(UserDto userDto) {
        User user = userMapper.INSTANCE.userDtoToUser(userDto);
        user = userRepo.save(user);
        return userDto;
    }
}

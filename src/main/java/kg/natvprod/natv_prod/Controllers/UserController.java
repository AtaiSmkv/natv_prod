package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.models.entities.User;
import kg.natvprod.natv_prod.models.dto.UserDto;
import kg.natvprod.natv_prod.repository.UserRepo;
import kg.natvprod.natv_prod.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;
    private final UserRepo userRepo;
    public UserController(UserService userService, UserRepo userRepo) {
        this.userService = userService;
        this.userRepo = userRepo;
    }
    @PostMapping("/save")
    public UserDto save(@RequestBody UserDto userDto) {
        return userService.save(userDto);
    }
    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
    @GetMapping("/findById")
    public User findById(@RequestParam long id) {
        return userRepo.findById(id);
    }


}

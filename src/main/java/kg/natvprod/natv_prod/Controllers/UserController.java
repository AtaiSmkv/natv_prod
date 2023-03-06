package kg.natvprod.natv_prod.Controllers;

import kg.natvprod.natv_prod.entities.User;
import kg.natvprod.natv_prod.entities.dto.UserDto;
import kg.natvprod.natv_prod.services.UserService;
import org.apache.catalina.UserDatabase;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/save")
    public UserDto save(@RequestBody UserDto userDto) {
        return userService.save(userDto);
    }
    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }


}

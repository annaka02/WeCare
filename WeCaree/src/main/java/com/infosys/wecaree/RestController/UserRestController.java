package com.infosys.wecaree.RestController;

import com.infosys.wecaree.DTO.UserDTO;
import com.infosys.wecaree.Entity.User;
import com.infosys.wecaree.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<UserDTO> getallUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/id")
    public Optional<User> getById(@PathVariable String id){
        return userService.getById(id);
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @PutMapping("/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
}

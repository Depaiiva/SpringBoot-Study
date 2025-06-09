package depaiva.com.estudos.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import depaiva.com.estudos.models.User;

@RestController
@RequestMapping("User")
public class UserController {

    @PostMapping
    public User save(@RequestBody User user) {
        System.out.println("Usuario recebido: " + user);
        return user;
    }
}

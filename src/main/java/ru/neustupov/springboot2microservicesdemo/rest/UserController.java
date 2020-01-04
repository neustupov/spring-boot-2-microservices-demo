package ru.neustupov.springboot2microservicesdemo.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neustupov.springboot2microservicesdemo.model.User;
import ru.neustupov.springboot2microservicesdemo.model.UserRepository;

@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/users")
  public List<User> allUsers() {
    return userRepository.findAll();
  }
}

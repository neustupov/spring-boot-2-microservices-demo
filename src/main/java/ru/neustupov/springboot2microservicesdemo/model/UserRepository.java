package ru.neustupov.springboot2microservicesdemo.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

  List<User> findAll();
}

package ru.neustupov.springboot2microservicesdemo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

  private String id;
  private String name;
}

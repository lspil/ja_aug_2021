package com.example.ja_c3_e3.repositories;

import com.example.ja_c3_e3.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

  private List<User> users = new ArrayList<>();

  public UserRepository() {
    User u1 = new User("bob","12345");
    User u2 = new User("jane","password");

    users.add(u1);
    users.add(u2);
  }

  public Optional<User> findUserByUsername(String username) {
    return users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst();
  }
}

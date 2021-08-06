package com.example.ja_c3_e3.service;

import com.example.ja_c3_e3.dto.User;
import com.example.ja_c3_e3.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginService {

  private final UserRepository userRepository;

  public boolean login(User user) {
    Optional<User> userInDb =
        userRepository.findUserByUsername(user.getUsername());

    return userInDb.stream()
        .filter(u -> u.getPassword().equals(user.getPassword()))
        .findFirst().isPresent();
  }
}

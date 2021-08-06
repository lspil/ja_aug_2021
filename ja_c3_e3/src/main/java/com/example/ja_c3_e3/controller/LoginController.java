package com.example.ja_c3_e3.controller;

import com.example.ja_c3_e3.dto.User;
import com.example.ja_c3_e3.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {

  private final LoginService loginService;

  @PostMapping("/login")
  public ResponseEntity<Void> login(@RequestBody User user) {
    boolean loginResult = loginService.login(user);

    if (loginResult) {
      return ResponseEntity.ok().build();
    } else {
      return ResponseEntity.noContent().build();
    }
  }
}

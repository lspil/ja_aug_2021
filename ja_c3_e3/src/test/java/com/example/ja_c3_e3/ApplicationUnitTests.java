package com.example.ja_c3_e3;

import com.example.ja_c3_e3.dto.User;
import com.example.ja_c3_e3.repositories.UserRepository;
import com.example.ja_c3_e3.service.LoginService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
class ApplicationUnitTests {

  @MockBean
  private UserRepository userRepository;

  @Autowired
  private LoginService loginService;

  @Test
  @DisplayName("When username and password are correct, " +
      "the app returns a 200 OK HTTP response.")
  void test1() {
    User u = new User();
    u.setUsername("bill");
    u.setPassword("12345");

    when(userRepository.findUserByUsername("bill"))
        .thenReturn(Optional.of(u));

    boolean result = loginService.login(u);

    assertTrue(result);
  }

  @Test
  @DisplayName("When username is not correct, " +
      "the app returns a 204 No Content HTTP response.")
  void test2() {
    User u = new User();
    u.setUsername("bill");
    u.setPassword("12345");

    when(userRepository.findUserByUsername("bill"))
        .thenReturn(Optional.empty());

    boolean result = loginService.login(u);

    assertFalse(result);
  }

  @Test
  @DisplayName("When password is not correct, " +
      "the app returns a 204 No Content HTTP response.")
  void test3() {
    User requestUser = new User();
    requestUser.setUsername("bill");
    requestUser.setPassword("12345");

    User resultUser = new User();
    resultUser.setUsername("bill");
    resultUser.setPassword("password");

    when(userRepository.findUserByUsername("bill"))
        .thenReturn(Optional.of(resultUser));

    boolean result = loginService.login(requestUser);

    assertFalse(result);
  }
}

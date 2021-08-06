package com.example.ja_c3_e3;

import com.example.ja_c3_e3.dto.User;
import com.example.ja_c3_e3.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationIntegrationTests {

  @MockBean
  private UserRepository userRepository;

  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("When username and password are correct, " +
      "the app returns a 200 OK HTTP response.")
  void test1() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    User u = new User();
    u.setUsername("bob");
    u.setPassword("12345");

    when(userRepository.findUserByUsername("bill"))
        .thenReturn(Optional.of(u));


    mockMvc.perform(post("/login")
      .contentType(MediaType.APPLICATION_JSON)
      .content(mapper.writeValueAsString(u))
    ).andExpect(status().isOk());
  }
}

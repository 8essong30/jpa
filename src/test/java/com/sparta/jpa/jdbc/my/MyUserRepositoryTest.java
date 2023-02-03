package com.sparta.jpa.jdbc.my;

import com.sparta.jpa.jdbc.user.User;
import com.sparta.jpa.jdbc.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(value = false)
public class MyUserRepositoryTest {

  @Autowired
  UserRepository userRepository;

  @Test
  void myUserRepositoryDeleteTest() {
    // given
    var newUser = User.builder().username("new-user").password("new-pass").build();
    userRepository.save(newUser); // 얘가 기존 jpa 먼저 실행이 되면서 딜리트도 jpa가 고대로 실행된것일수도...! 트랜잭셔널,,

    // when
    userRepository.delete(newUser);

  }
}

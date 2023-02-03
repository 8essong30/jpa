package com.sparta.jpa.jdbc.my;

import com.sparta.jpa.jdbc.user.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
//@Transactional
public class MyUserRepositoryImpl implements MyRepository<User> {

  @Autowired
  EntityManager entityManager;

  @Override
  public void delete(User user) {
    System.out.println("delete force");
    entityManager.remove(user);
  }
}

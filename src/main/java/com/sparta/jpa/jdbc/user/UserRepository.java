package com.sparta.jpa.jdbc.user;

import com.sparta.jpa.jdbc.my.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

// delete 기능 추가
public interface UserRepository extends JpaRepository<User, Long>, MyRepository<User> {

}

/*
// @NoRepositoryBean  인터페이스로 한번더 감싸서 레파지토리 제한
public interface UserRepository extends MyRepository<User, Long> {
}
*/

/*
@RepositoryDefinition(domainClass = User.class, idClass = Long.class)
public interface UserRepository { // extends 뒤에 부분 빼줌 @RepositoryDefinition 이 주입해줌

  Optional<User> findByUsername(
      String username);

  // findByPassword 막기 위해 findByUsername만 하도록 제한을 해
}
*/

//@Repository // jpa레파지토리로 변경 ; class -> interface
//public class UserRepository {
/*
    @PersistenceContext
    private EntityManager entityManager;

    public User insertUser(User user) {
        entityManager.persist(user);
        return user;
    }

    public User selectUser(Long id) {
        return entityManager.find(User.class, id);
    }
 }
*/

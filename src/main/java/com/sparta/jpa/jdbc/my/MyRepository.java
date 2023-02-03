package com.sparta.jpa.jdbc.my;

// 삭제 기능 추가하기
public interface MyRepository<T> {

  void delete(T entity);

}

/*
// 레파지토리 기능 제한하기 위해 사용
@NoRepositoryBean
public interface MyRepository<User, ID extends Serializable> extends Repository<User, ID> {

  User save(User entity);

  Optional<User> findByUsername(String username);
}
*/

// 직접 빈으로 레파지토리 주입할 때 사용한 클래스
//
//import lombok.Setter;
//
//import java.util.HashMap;
//
//@Setter
//public class MyRepository {
//    private HashMap<Long, String> dataTable; // DB 테이블 의믜
//
//    public String find(Long id) {
//        return dataTable.getOrDefault(id, ""); // 디폴트 공백은 데이터 없을 때 공백으로 갖고오려에
//    }
//
//    public Long save(String data) {
//        var newId = Long.valueOf(dataTable.size());
//        this.dataTable.put(newId, data);
//        return newId;
//    }
//}

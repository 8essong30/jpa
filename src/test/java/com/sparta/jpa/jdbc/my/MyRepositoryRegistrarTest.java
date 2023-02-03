//package com.sparta.jpa.jdbc.my;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@Import(MyRepositoryRegistrar.class) // 빈 주입. 걍 클래스라 컴포넌트 등록 안해줬기 때문
//@SpringBootTest
//class MyRepositoryRegistrarTest {
//    @Autowired
//    MyRepository myRepository;
//
//    @Test
//    void myRepositoryTest() {
//        // given
//        var newData = "NEW DATA";
//        var savedId = myRepository.save(newData);
//
//        // when
//        var savedData  = myRepository.find(savedId);
//
//        // then
//        System.out.println(savedData);
//
//    }
//}
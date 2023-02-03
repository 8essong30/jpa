// 영속성 전이로 삭제됨
// package com.sparta.jpa.jdbc.userChannel;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class UserChannelRepository {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public UserChannel insertUserChannel(UserChannel userChannel) {
//        entityManager.persist(userChannel);
//        return userChannel;
//    }
//
//    public UserChannel selectUserChannel(Long id) {
//        return entityManager.find(UserChannel.class, id);
//    }
//}

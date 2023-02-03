//package com.sparta.jpa.jdbc.channel;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//@Rollback(value = false)
//class ChannelRepositoryTest {
//
//    @Autowired
//    private ChannelRepository channelRepository;
//
//    @Test
//    void insertSelectGroupTest() {
//        // given
//        var newChannel = Channel.builder().name("new-group").build();
//
//        // when
//        var savedChannel = channelRepository.insertChannel(newChannel);
//
//        //then
//        var foundChannel = channelRepository.selectChannel(savedChannel.getId()); // 1차캐시에서 조회해오기 떄문에 쿼리는 insert만 날라감
//        assert foundChannel.getId().equals(savedChannel.getId());
//    }
//
//
//}
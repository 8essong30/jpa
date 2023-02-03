//package com.sparta.jpa.jdbc.userChannel;
//
//import com.sparta.jpa.jdbc.channel.Channel;
//import com.sparta.jpa.jdbc.channel.ChannelRepository;
//import com.sparta.jpa.jdbc.user.User;
//import com.sparta.jpa.jdbc.user.UserRepository;
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
//class UserChannelRepositoryTest {
//
//    @Autowired
//    private ChannelRepository channelRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
////    @Autowired
////    private UserChannelRepository userChannelRepository;
//
//
//    @Test
//    void userJoinChannelTest() {
//        // given
//        var newChannel = Channel.builder().name("new-channle").build();
//        var newUser = User.builder().username("new-user").password("new-pass").build();
//        var newUserChannel = newChannel.joinUser(newUser);
//
//        // when
//        var savedUser = userRepository.insertUser(newUser);
//        var savedChannel = channelRepository.insertChannel(newChannel);
////        var savedUserChannel = userChannelRepository.insertUserChannel(newUserChannel); // 영속성 전이, orphanRemoval 붙여줌
//        // 그럼 이제 userChannelRepository가 없어도 됨
//
//        // then
//        var foundChannel = channelRepository.selectChannel(savedChannel.getId());
//        assert foundChannel.getUserChannels().stream()
//                .map(UserChannel::getChannel)
//                .map(Channel::getName)
//                .anyMatch(name -> name.equals(newChannel.getName()));
//    }
//
//    @Test
//    void userJoinChannelWithCascadeTest() {
//        // given
//        var newChannel = Channel.builder().name("new-channel").build();
//        var newUser = User.builder().password("newpass").username("new-user").build();
//        newChannel.joinUser(newUser); // cascade.all 해서 유저채널에도
//
//        // when
//        var savedChannel = channelRepository.insertChannel(newChannel);
//        var savedUser = userRepository.insertUser(newUser);
//
//        // then
//        var foundChannel = channelRepository.selectChannel(savedChannel.getId());
//        assert foundChannel.getUserChannels().stream()
//                .map(UserChannel::getChannel)
//                .map(Channel::getName)
//                .anyMatch(name -> name.equals(newChannel.getName()));
//
//    }
//
//}
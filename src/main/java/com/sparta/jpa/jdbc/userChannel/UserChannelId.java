//package com.sparta.jpa.jdbc.userChannel;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Embeddable;
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
///**/
//import java.io.Serializable;
//import java.util.Objects;
//
//@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Embeddable
//public class UserChannelId implements Serializable {
//
//    // @IdClass 사용 시
//    private Long user;   // UserChannel 의 user 필드명과 동일해야함
//    private Long channel; // UserChannel 의 channel 필드명과 동일해야함
///*
//    // @EmbeddedId 사용 시
//    @Column(name = "user_id")
//    private Long userId;
//
//    @Column(name = "channel_id")
//    private Long channelId;
//*/
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UserChannelId userChannelId = (UserChannelId) o;
//        return Objects.equals(getUser(), userChannelId.getUser()) && Objects.equals(getChannel(), userChannelId.getChannel());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getUser(), getChannel());
//    }
//
//}
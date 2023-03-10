package com.sparta.jpa.jdbc.userChannel;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.sparta.jpa.jdbc.channel.Channel;
import com.sparta.jpa.jdbc.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// Lombok
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

// Jpa
@Entity
//@IdClass(UserChannelId.class)
public class UserChannel {

//    @EmbeddedId
//    private UserChannelId userChannelId;
    /**
     * 컬럼 - 연관관계 컬럼을 제외한 컬럼을 정의합니다.
     */
    // 복합키 사용하게 되면
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    /**
     * 생성자 - 약속된 형태로만 생성가능하도록 합니다.
     */
    @Builder
    public UserChannel(User user, Channel channel) {
        this.user = user;
        this.channel = channel;
    }


    /**
     * 연관관계 - Foreign Key 값을 따로 컬럼으로 정의하지 않고 연관 관계로 정의합니다.
     */
//    @Id  // @IdClass 사용할 때
    @ManyToOne
//    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User user;

//    @Id
    @ManyToOne
//    @MapsId("channel_id")
    @JoinColumn(name = "channel_id")
    private Channel channel;


    /**
     * 연관관계 편의 메소드 - 반대쪽에는 연관관계 편의 메소드가 없도록 주의합니다.
     */


    /**
     * 서비스 메소드 - 외부에서 엔티티를 수정할 메소드를 정의합니다. (단일 책임을 가지도록 주의합니다.)
     */
}

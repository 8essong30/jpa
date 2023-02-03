package com.sparta.jpa.jdbc.channel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository // jpa레파지토리로 변경 ; class -> interface
public interface ChannelRepository extends JpaRepository<Channel, Long> {
/*
    @PersistenceContext
    EntityManager entityManager;

    public Channel insertChannel(Channel channel) {
        entityManager.persist(channel);
        return channel;
    }

    public Channel selectChannel(Long id) {
        return entityManager.find(Channel.class, id);
    }
*/
}

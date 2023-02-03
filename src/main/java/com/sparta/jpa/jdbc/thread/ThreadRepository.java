package com.sparta.jpa.jdbc.thread;

import com.sparta.jpa.jdbc.channel.Channel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository // jpa레파지토리로 변경 ; class -> interface
public interface ThreadRepository extends JpaRepository<Thread, Long> {
/*
    @PersistenceContext
    EntityManager entityManager;

    public Thread insertThread(Thread thread) {
        entityManager.persist(thread);
        return thread;
    }

    public Thread selectThread(Long id) {
        return entityManager.find(Thread.class, id);
    }
*/
}

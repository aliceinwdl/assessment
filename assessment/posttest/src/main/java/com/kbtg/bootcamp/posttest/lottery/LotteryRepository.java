package com.kbtg.bootcamp.posttest.lottery;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LotteryRepository extends JpaRepository<Lottery,Long> {
//    @Query("SELECT t FROM LOTTERY t WHERE t.tickey = ?1")
//    Optional<Lottery> findByTicket(String ticket);
}

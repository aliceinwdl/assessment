package com.kbtg.bootcamp.posttest.sale;

import org.hibernate.sql.exec.spi.JdbcCallParameterExtractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserTicketRepository extends JpaRepository<UserTicket,Long> {
    @Query(value = "SELECT * FROM user_ticket WHERE user_id = ?1",nativeQuery = true)
    Optional<List<UserTicket>> findByUserId(String userId);

    @Query(value = "DELETE FROM user_ticket WHERE user_id = ?1 AND ticket_id = ?2",nativeQuery = true)
    void deleteLotteryByUserIdAndTicketId(String userId, String ticketId);
}

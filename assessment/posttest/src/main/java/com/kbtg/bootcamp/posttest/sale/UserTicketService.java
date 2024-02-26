package com.kbtg.bootcamp.posttest.sale;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserTicketService {
    private final UserTicketRepository userTicketRepository;

    public UserTicketService(UserTicketRepository userTicketRepository) {
        this.userTicketRepository = userTicketRepository;
    }
//    public List<UserTicket> getLotteryByUserId(String userId) {
//        return this.userTicketRepository.findByUserId(userId)
//    }

    public Optional<List<UserTicket>> getLotteryByUserId(String userId) {
        return this.userTicketRepository.findByUserId(userId);
    }



    public void deleteLotteryByUserIdAndTicketId(String userId, String ticketId) {
        this.userTicketRepository.deleteLotteryByUserIdAndTicketId(userId,ticketId);
    }
}

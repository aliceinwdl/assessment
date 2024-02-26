package com.kbtg.bootcamp.posttest.sale;

import com.kbtg.bootcamp.posttest.Exception.ApiRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserTicketService userTicketService;

    public UserController(UserService userService, UserTicketService userTicketService) {
        this.userService = userService;
        this.userTicketService = userTicketService;
    }

    @GetMapping("")
    public List<User> getUserLottery() {
        return this.userService.getUserLottery();
    }

//    POST /users/:userId/lotteries/:ticketId
    @PostMapping("/{userId}/lotteries/{ticketId}")
    public String buyLottery(@PathVariable String userId,@PathVariable String ticketId) {
        return userId+":"+ticketId;
    }


//    @GetMapping("/{userId}/lotteries")
//    public List<UserTicket> getLotteryByUserId(@PathVariable String userId){
//        return this.userTicketService.getLotteryByUserId(userId);
//    }

    @GetMapping("/{userId}/lotteries")
    public List<UserTicket>  getLotteryByUserId(@PathVariable String userId){
        return this.userTicketService.getLotteryByUserId(userId).orElseThrow(()->new ApiRequestException("User id : "+userId+" Not found!"));
//        throw new ApiRequestException("User id : "+userId+" Not found!");
//        return Optional.ofNullable(Optional.ofNullable(this.userTicketService.getLotteryByUserId(userId)).orElseThrow(() -> new ApiRequestException("User not found")));
    }




//    DELETE /users/:userId/lotteries/:ticketId
    @DeleteMapping("/{userId}/lotteries/{ticketId}")
    public void deleteLotteryByUserIdAndTicketId(@PathVariable String userId,@PathVariable String ticketId){
        this.userTicketService.deleteLotteryByUserIdAndTicketId(userId,ticketId);
    }


}

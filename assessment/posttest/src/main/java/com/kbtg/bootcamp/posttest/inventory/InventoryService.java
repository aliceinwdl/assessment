package com.kbtg.bootcamp.posttest.inventory;

import com.kbtg.bootcamp.posttest.lottery.LotteryRepository;
import com.kbtg.bootcamp.posttest.lottery.Lottery;
import com.kbtg.bootcamp.posttest.lottery.LotteryRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    private final LotteryRepository lotteryRepository;

    public InventoryService(LotteryRepository lotterRepository) {
        this.lotteryRepository = lotterRepository;
    }

    public List<Lottery> getLotteryList() {
        return lotteryRepository.findAll();
    }

    public Lottery creatLottery(LotteryRequestDto requestDto) {
//        Optional<Lottery> optionalLottery = lotteryRepository.findByTicket(requestDto.getTicket());
        Lottery lottery;
//        if(optionalLottery.isPresent()) {
//            lottery = optionalLottery.get();
//        } else {
            lottery = new Lottery();
            lottery.setTicket(requestDto.getTicket());
            lottery.setPrice(requestDto.getPrice());
            lottery.setAmount(requestDto.getAmount());
            lotteryRepository.save(lottery);
//            return lottery;
//        }
        return lottery;
    }
}

package com.kbtg.bootcamp.posttest.lottery;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotteryService {
    private final LotteryRepository lotterRepository;

    public LotteryService(LotteryRepository lotterRepository) {
        this.lotterRepository = lotterRepository;
    }

    public List<Lottery> getLotterList() {
        return lotterRepository.findAll();
    }
}

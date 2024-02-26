package com.kbtg.bootcamp.posttest.inventory;

import com.kbtg.bootcamp.posttest.lottery.Lottery;
import com.kbtg.bootcamp.posttest.lottery.LotteryRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("")
    public List<Lottery> getLotteryList() {
        return this.inventoryService.getLotteryList();
    }

    @PostMapping("/lotteries")
    public Lottery createLottery(@RequestBody LotteryRequestDto requestDto) throws Exception {
        return this.inventoryService.creatLottery(requestDto);
    }


}

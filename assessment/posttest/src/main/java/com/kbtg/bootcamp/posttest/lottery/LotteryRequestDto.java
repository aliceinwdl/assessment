package com.kbtg.bootcamp.posttest.lottery;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


public class LotteryRequestDto {

    @NotNull
    @NotEmpty
    @Size(min = 6, max = 6,message = "Lenght of Lottery number is : 6")
    private String ticket;

    @NotNull
    @NotEmpty
    private float price;

    @NotNull
    @NotEmpty
    private float amount;

    public LotteryRequestDto(String ticket, float price, float amount) {
        this.ticket = ticket;
        this.price = price;
        this.amount = amount;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

package com.kbtg.bootcamp.posttest.sale;

import com.kbtg.bootcamp.posttest.lottery.Lottery;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class UserRequestDto {

    @NotNull
    @NotEmpty
    private String user_id;

    @NotNull
    @NotEmpty
    private String ticket;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}

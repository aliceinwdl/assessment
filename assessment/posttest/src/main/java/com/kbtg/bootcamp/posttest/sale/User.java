package com.kbtg.bootcamp.posttest.sale;

import com.kbtg.bootcamp.posttest.lottery.Lottery;
import com.kbtg.bootcamp.posttest.sale.UserTicket;
import jakarta.persistence.*;

import java.util.List;

@Entity()
@Table(name="user_profile")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private String  user_id;

    @Column(name = "user_name")
    private String  user_name;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

//    public List<Lottery> getLotteries() {
//        return lotteries;
//    }
//
//    public void setLotteries(List<Lottery> lotteries) {
//        this.lotteries = lotteries;
//    }
}

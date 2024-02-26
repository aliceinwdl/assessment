package com.kbtg.bootcamp.posttest.sale;

import com.kbtg.bootcamp.posttest.sale.User;
import com.kbtg.bootcamp.posttest.sale.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUserLottery() {
        return this.userRepository.findAll();
    }
}

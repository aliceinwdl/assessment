package com.kbtg.bootcamp.posttest.sale;

import com.kbtg.bootcamp.posttest.sale.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

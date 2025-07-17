package com.finconsgroup.parco_macchine.repository;

import com.finconsgroup.parco_macchine.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {

    User findByUserName(String username);
}

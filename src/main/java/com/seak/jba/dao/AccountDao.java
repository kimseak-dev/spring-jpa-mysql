package com.seak.jba.dao;

import com.seak.jba.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao  extends JpaRepository<Account,Integer> {
}
package com.nwallet.nwallet.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nwallet.nwallet.core.models.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {
    
}

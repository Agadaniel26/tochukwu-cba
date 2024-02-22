package com.tochi.cba.tochicba.repository;

import com.tochi.cba.tochicba.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}

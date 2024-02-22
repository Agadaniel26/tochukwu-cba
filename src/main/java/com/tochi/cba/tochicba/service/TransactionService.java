package com.tochi.cba.tochicba.service;

import com.tochi.cba.tochicba.dto.TransactionDto;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {

    void saveTransaction(TransactionDto transaction);
}

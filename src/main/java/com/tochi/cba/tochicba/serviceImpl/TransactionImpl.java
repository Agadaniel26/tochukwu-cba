package com.tochi.cba.tochicba.serviceImpl;

import com.tochi.cba.tochicba.dto.TransactionDto;
import com.tochi.cba.tochicba.entity.Transaction;
import com.tochi.cba.tochicba.enums.Status;
import com.tochi.cba.tochicba.repository.TransactionRepository;
import com.tochi.cba.tochicba.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .transactionAmount(transactionDto.getTransactionAmount())
                .transactionAccountNumber(transactionDto.getTransactionAccountNumber())
                .transactionStatus(Status.ACTIVE)
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }

}


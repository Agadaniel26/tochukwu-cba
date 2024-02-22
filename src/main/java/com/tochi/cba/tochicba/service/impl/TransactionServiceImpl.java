package com.tochi.cba.tochicba.service.impl;

import com.tochi.cba.tochicba.dto.TransactionDto;
import com.tochi.cba.tochicba.entity.TransactionEntity;
import com.tochi.cba.tochicba.enums.Status;
import com.tochi.cba.tochicba.repository.TransactionRepository;
import com.tochi.cba.tochicba.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {


    private final TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        TransactionEntity transaction = TransactionEntity.builder()
                .transactionType(transactionDto.getTransactionType())
                .transactionAmount(transactionDto.getTransactionAmount())
                .transactionAccountNumber(transactionDto.getTransactionAccountNumber())
                .transactionStatus(Status.ACTIVE)
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }

}


package com.tochi.cba.tochicba.dto;

import com.tochi.cba.tochicba.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDto {
    private String transactionType;
    private BigDecimal transactionAmount;
    private String transactionAccountNumber;
    private Status transactionStatus;
}

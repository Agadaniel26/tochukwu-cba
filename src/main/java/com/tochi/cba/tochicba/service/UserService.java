package com.tochi.cba.tochicba.service;

import com.tochi.cba.tochicba.dto.*;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);
    BankResponse creditAccount(CreditDebitRequest creditRequest);
    BankResponse debitAccount(CreditDebitRequest DebitRequest);
    BankResponse transfer(TransferRequest transferRequest);
}

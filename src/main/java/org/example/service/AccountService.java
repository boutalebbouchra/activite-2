package org.example.service;

import org.example.dto.BankAccountDTO;
import org.example.dto.BankAccountResponseDTO;
import org.example.entities.AccountType;
import org.example.entities.BankAccount;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountDTO bankAccountDTO);
}

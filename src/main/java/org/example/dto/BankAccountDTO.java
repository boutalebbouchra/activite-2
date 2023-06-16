package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entities.AccountType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountDTO {
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}

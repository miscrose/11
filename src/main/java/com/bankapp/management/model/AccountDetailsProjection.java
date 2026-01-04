package com.bankapp.management.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Account.class)
public interface AccountDetailsProjection {
    double getBalance();
    AccountType getType();
}
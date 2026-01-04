package com.bankapp.management.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "balance", types = Account.class)
public interface AccountBalanceProjection {
    double getBalance();
}
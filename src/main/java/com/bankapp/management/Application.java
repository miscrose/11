package com.bankapp.management;

import com.bankapp.management.model.Account;
import com.bankapp.management.model.AccountType;
import com.bankapp.management.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner start(AccountRepository accountRepository, RepositoryRestConfiguration restConfiguration) {
        return args -> {
            restConfiguration.exposeIdsFor(Account.class);
            // Initialize sample accounts with random balances
            accountRepository.save(new Account(null, Math.random()*10000, new Date(), AccountType.SAVINGS));
            accountRepository.save(new Account(null, Math.random()*10000, new Date(), AccountType.CHECKING));
            accountRepository.save(new Account(null, Math.random()*10000, new Date(), AccountType.SAVINGS));
        };
    }
}
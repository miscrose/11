package com.bankapp.management.repository;

import com.bankapp.management.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "accounts")
public interface AccountRepository extends JpaRepository<Account, Long> {
}
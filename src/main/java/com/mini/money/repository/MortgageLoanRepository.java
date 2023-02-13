package com.mini.money.repository;

import com.mini.money.entity.MortgageLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MortgageLoanRepository extends JpaRepository<MortgageLoan, Long> {
}

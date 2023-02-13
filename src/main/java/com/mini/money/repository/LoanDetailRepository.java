package com.mini.money.repository;

import com.mini.money.entity.LoanDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanDetailRepository extends JpaRepository<LoanDetail, Long> {
}

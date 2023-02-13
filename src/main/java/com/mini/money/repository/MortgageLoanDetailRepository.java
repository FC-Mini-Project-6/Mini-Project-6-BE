package com.mini.money.repository;

import com.mini.money.entity.MortgageLoanDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MortgageLoanDetailRepository extends JpaRepository<MortgageLoanDetail, Long> {
}

package com.mini.money.repository;

import com.mini.money.entity.HomeLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeLoanRepository extends JpaRepository<HomeLoan, Long> {
}

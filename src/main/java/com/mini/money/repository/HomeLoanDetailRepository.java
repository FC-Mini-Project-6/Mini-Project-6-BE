package com.mini.money.repository;

import com.mini.money.entity.HomeLoanDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeLoanDetailRepository extends JpaRepository<HomeLoanDetail, Long> {
}

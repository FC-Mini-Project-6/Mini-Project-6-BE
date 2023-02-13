package com.mini.money.repository;

import com.mini.money.entity.SavingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingDetailRepository extends JpaRepository<SavingDetail, Long> {
}

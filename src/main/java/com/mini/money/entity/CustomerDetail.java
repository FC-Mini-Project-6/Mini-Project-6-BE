package com.mini.money.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customer_detail")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class CustomerDetail {

    @Id
    @Column(name="detail_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email")
    private Customer customer;

    @Column(name="age")
    private int age;

    @Column(name="address")
    private String address;

    @Column(name="job")
    private String job;

    @Column(name="bank")
    private String bank;

    @Column(name="crdt_grade")
    private Double crdtGrade;

    @Column(name="income")
    private int income;


}

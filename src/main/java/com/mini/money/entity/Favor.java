package com.mini.money.entity;


import javax.persistence.*;

@Entity
@Table(name = "favor")
public class Favor {

    @Id
    @Column(name = "favor_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loan_id")
    private Loan loan;





}

package com.mini.money.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "deposit_option")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class DepositDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fin_prdt_cd")
    private Deposit deposit;

    @Column(name = "intr_rate_type")
    private String intrRateType;

    @Column(name = "intr_rate_type_nm")
    private String intrRateTypeNm;

    @Column(name = "save_trm")
    private String saveTrm;

    @Column(name = "intr_rate")
    private String intrRate;

    @Column(name = "intr_rate2")
    private String intrRate2;

//    public DepositDetail(String finPrdtCd, String intrRateType,
//                        String intrRateTypeNm, String saveTrm, String intrRate, String intrRate2) {
//
//        this.finPrdtCd = finPrdtCd;
//        this.intrRateType = intrRateType;
//        this.intrRateTypeNm = intrRateTypeNm;
//        this.saveTrm = saveTrm;
//        this.intrRate = intrRate;
//        this.intrRate2 = intrRate2;
//    }
}

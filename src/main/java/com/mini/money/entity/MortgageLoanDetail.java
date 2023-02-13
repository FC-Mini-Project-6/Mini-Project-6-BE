package com.mini.money.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mortgage_detail_loan")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class MortgageLoanDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fin_prdt_cd")
    private MortgageLoan mortgageLoan;

    @Column(name = "mrtg_type")
    private String mrtgType;

    @Column(name = "mrtg_type_nm")
    private String mrtgTypeNm;

    @Column(name = "rpay_type")
    private String rpayType;

    @Column(name = "rpay_type_nm")
    private String rpayTypeNm;

    @Column(name = "lend_rate_type")
    private String lendRateType;

    @Column(name = "lend_rate_type_nm")
    private String lendRateTypeNm;

    @Column(name = "lend_rate_min")
    private String lendRateMin;

    @Column(name = "lend_rate_max")
    private String lendRateMax;

    @Column(name = "lend_rate_avg")
    private String lendRateAvg;

//    public MortgageLoanDetail(String finPrdtCd, String mrtgType, String mrtgTypeNm,
//                              String rpayType, String rpayTypeNm, String lendRateType,
//                              String lendRateTypeNm, String lendRateMin, String lendRateMax, String lendRateAvg) {
//
//        this.finPrdtCd = finPrdtCd;
//        this.mrtgType = mrtgType;
//        this.mrtgTypeNm = mrtgTypeNm;
//        this.rpayType = rpayType;
//        this.rpayTypeNm = rpayTypeNm;
//        this.lendRateType = lendRateType;
//        this.lendRateTypeNm = lendRateTypeNm;
//        this.lendRateMin = lendRateMin;
//        this.lendRateMax = lendRateMax;
//        this.lendRateAvg = lendRateAvg;
//
//    }
}

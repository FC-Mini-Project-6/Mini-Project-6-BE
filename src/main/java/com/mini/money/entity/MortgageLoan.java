package com.mini.money.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mortgage_loan")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class MortgageLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fin_prdt_cd")
    private String finPrdtCd;

    @Column(name = "kor_co_nm")
    private String korCoNm;

    @Column(name = "fin_prdt_nm")
    private String finPrdtNm;

    @Column(name = "join_way")
    private String joinWay;

    @Column(name = "loan_inci_expn")
    private String loanInciExpn;

    @Column(name = "erly_rpay_fee")
    private String erlyRpayFee;

    @Column(name = "dly_rate")
    private String dlyRate;

    @Column(name = "loan_lmt")
    private String loanLmt;

    @Column(name = "dcls_strt_day")
    private String dclsStrtDay;

    @Column(name = "dcls_end_day")
    private String dclsEndDay;


//    public MortgageLoan(String finPrdtCd, String korCoNm,
//                    String finPrdtNm, String joinWay, String loanInciExpn,
//                    String erlyRpayFee, String dlyRate, String loanLmt,
//                    String dclsStrtDay, String dclsEndDay) {
//
//        this.korCoNm = korCoNm;
//        this.finPrdtCd = finPrdtCd;
//        this.finPrdtNm = finPrdtNm;
//        this.joinWay = joinWay;
//        this.loanInciExpn = loanInciExpn;
//        this.erlyRpayFee = erlyRpayFee;
//        this.dlyRate = dlyRate;
//        this.loanLmt = loanLmt;
//        this.dclsStrtDay = dclsStrtDay;
//        this.dclsEndDay = dclsEndDay;
//
//    }
}

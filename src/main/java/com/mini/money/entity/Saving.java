package com.mini.money.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "saving_baseinfo")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class Saving {
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

    @Column(name = "mtrt_int")
    private String mtrtInt;

    @Column(name = "spcl_cnd")
    private String spclCnd;

    @Column(name = "join_member")
    private String joinMember;

    @Column(name = "etc_note")
    private String etcNote;

    @Column(name = "max_limit")
    private String maxLimit;

    @Column(name = "dcls_strt_day")
    private String dclsStrtDay;

    @Column(name = "dcls_end_day")
    private String dclsEndDay;

//    public Saving(String finPrdtCd, String korCoNm, String finPrdtNm, String joinWay, String mtrtInt, String spclCnd,
//                  String joinMember, String etcNote, String maxLimit, String dclsStrtDay, String dclsEndDay) {
//
//        this.finPrdtCd = finPrdtCd;
//        this.korCoNm = korCoNm;
//        this.finPrdtNm = finPrdtNm;
//        this.joinWay = joinWay;
//        this.mtrtInt = mtrtInt;
//        this.spclCnd = spclCnd;
//        this.joinMember = joinMember;
//        this.etcNote = etcNote;
//        this.maxLimit = maxLimit;
//        this.dclsStrtDay = dclsStrtDay;
//        this.dclsEndDay = dclsEndDay;
//
//    }
}

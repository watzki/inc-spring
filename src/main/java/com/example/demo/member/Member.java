package com.example.demo.member;

import javax.persistence.*;

@Entity
@Table
public class Member {
    @Id
    @SequenceGenerator(
            name = "member_sequence",
            sequenceName = "member_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "member_sequence"
    )
    private Long id;
    private String lName;
    private String fName;
    private String kapisan;
    private Integer purok;
    private Integer grupo;
    private Boolean isDKN;
    private Boolean isKNG;
    private Boolean isMWT;
    private Boolean isPAN;
    private Boolean isKAP;
    private Boolean isPNK;
    private Boolean isSCN;
    private Boolean isKAL;
    private Boolean isILW;
    private Boolean isTSV;
    @Transient
    private Boolean isMT;

    public Member() {
    }

    public Member(int i, String datu, String estrella, String buklod, int grupo, int i1, boolean isKNG, boolean isMWT, boolean isPAN, boolean isKAP, boolean isPNK, boolean isSCN, boolean isKAL, boolean isILW, boolean isTSV) {
    }

    public Member(Long id,
                  String lName,
                  String fName,
                  String kapisan,
                  Integer purok,
                  Integer grupo,
                  Boolean isDKN,
                  Boolean isKNG,
                  Boolean isMWT,
                  Boolean isPAN,
                  Boolean isKAP,
                  Boolean isPNK,
                  Boolean isSCN,
                  Boolean isKAL,
                  Boolean isILW,
                  Boolean isTSV) {
        this.id = id;
        this.lName = lName;
        this.fName = fName;
        this.kapisan = kapisan;
        this.purok = purok;
        this.grupo = grupo;
        this.isDKN = isDKN;
        this.isKNG = isKNG;
        this.isMWT = isMWT;
        this.isPAN = isPAN;
        this.isKAP = isKAP;
        this.isPNK = isPNK;
        this.isSCN = isSCN;
        this.isKAL = isKAL;
        this.isILW = isILW;
        this.isTSV = isTSV;
    }

    public Member(String lName,
                  String fName,
                  String kapisan,
                  Integer purok,
                  Integer grupo,
                  Boolean isDKN,
                  Boolean isKNG,
                  Boolean isMWT,
                  Boolean isPAN,
                  Boolean isKAP,
                  Boolean isPNK,
                  Boolean isSCN,
                  Boolean isKAL,
                  Boolean isILW,
                  Boolean isTSV) {
        this.lName = lName;
        this.fName = fName;
        this.kapisan = kapisan;
        this.purok = purok;
        this.grupo = grupo;
        this.isDKN = isDKN;
        this.isKNG = isKNG;
        this.isMWT = isMWT;
        this.isPAN = isPAN;
        this.isKAP = isKAP;
        this.isPNK = isPNK;
        this.isSCN = isSCN;
        this.isKAL = isKAL;
        this.isILW = isILW;
        this.isTSV = isTSV;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getKapisan() {
        return kapisan;
    }

    public void setKapisan(String kapisan) {
        this.kapisan = kapisan;
    }

    public Integer getPurok() {
        return purok;
    }

    public void setPurok(Integer purok) {
        this.purok = purok;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public Boolean getIsDKN() {
        return isDKN;
    }

    public void setIsDKN(Boolean DKN) {
        isDKN = DKN;
    }

    public Boolean getIsKNG() {
        return isKNG;
    }

    public void setIsKNG(Boolean KNG) {
        isKNG = KNG;
    }

    public Boolean getIsMWT() {
        return isMWT;
    }

    public void setIsMWT(Boolean MWT) {
        isMWT = MWT;
    }

    public Boolean getIsPAN() {
        return isPAN;
    }

    public void setIsPAN(Boolean PAN) {
        isPAN = PAN;
    }

    public Boolean getIsKAP() {
        return isKAP;
    }

    public void setIsKAP(Boolean KAP) {
        isKAP = KAP;
    }

    public Boolean getIsPNK() {
        return isPNK;
    }

    public void setIsPNK(Boolean PNK) {
        isPNK = PNK;
    }

    public Boolean getIsSCN() {
        return isSCN;
    }

    public void setIsSCN(Boolean SCN) {
        isSCN = SCN;
    }

    public Boolean getIsKAL() {
        return isKAL;
    }

    public void setIsKAL(Boolean KAL) {
        isKAL = KAL;
    }

    public Boolean getIsILW() {
        return isILW;
    }

    public void setIsILW(Boolean ILW) {
        isILW = ILW;
    }

    public Boolean getIsTSV() {
        return isTSV;
    }

    public void setIsTSV(Boolean TSV) {
        isTSV = TSV;
    }


    public Boolean getMT() {
        return isDKN || isKNG || isMWT || isPAN || isKAP || isPNK || isSCN || isKAL || isILW || isTSV;
    }

    public void setMT(Boolean MT) {
        isMT = MT;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", kapisan='" + kapisan + '\'' +
                ", purok=" + purok +
                ", grupo=" + grupo +
                ", isDKN=" + isDKN +
                ", isKNG=" + isKNG +
                ", isMWT=" + isMWT +
                ", isPAN=" + isPAN +
                ", isKAP=" + isKAP +
                ", isPNK=" + isPNK +
                ", isSCN=" + isSCN +
                ", isKAL=" + isKAL +
                ", isILW=" + isILW +
                ", isTSV=" + isTSV +
                ", isMT=" + isMT +
                '}';
    }
}

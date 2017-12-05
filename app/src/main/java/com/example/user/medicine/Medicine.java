package com.example.user.medicine;

public class Medicine {

    private String ITEM_SEQ; // 품목기준코드
    private String ITEM_NAME; // 품목명
    private String ENTP_NAME; // 업체명
    private String ITEM_PERMIT_DATE; // 품목허가일자
    private String INDUTY; // 업종
    private String PRDLST_STDR_CODE; // 품목일련번호
    private String SPCLTY_PBLC; // 전문/일반 구분
    private String PRDUCT_TYPE; // 분류명
    private String PRDUCT_PRMISN_NO; // 품목허가번호
    private String ITEM_INGR_NAME; // 주성분
    private String ITEM_INGR_CNT; // 주성분수
    private String PERMIT_KIND_CODE; // 신고/허가구분
    private String CANCEL_DATE; // 취하일자
    private String CANCEL_NAME; // 취하구분


    // 1. 품목기준코드
    public String getITEM_SEQ() {
        return ITEM_SEQ;
    }

    public void setITEM_SEQ(String ITEM_SEQ) {
        this.ITEM_SEQ = ITEM_SEQ;
    }

    // 2. 품목명
    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public void setITEM_NAME(String ITEM_NAME) {
        this.ITEM_NAME = ITEM_NAME;
    }

    // 3. 업체명
    public String getENTP_NAME() {
        return ENTP_NAME;
    }

    public void setENTP_NAME(String ENTP_NAME) {
        this.ENTP_NAME = ENTP_NAME;
    }

    // 4. 품목허가일자
    public String getITEM_PERMIT_DATE() {
        return ITEM_PERMIT_DATE;
    }

    public void setITEM_PERMIT_DATE(String ITEM_PERMIT_DATE) {
        this.ITEM_PERMIT_DATE = ITEM_PERMIT_DATE;
    }

    // 5. 업종
    public String getINDUTY() {
        return INDUTY;
    }

    public void setINDUTY(String INDUTY) {
        this.INDUTY = INDUTY;
    }

    // 6. 품목일련번호
    public String getPRDLST_STDR_CODE() {
        return PRDLST_STDR_CODE;
    }

    public void setPRDLST_STDR_CODE(String PRDLST_STDR_CODE) {
        this.PRDLST_STDR_CODE = PRDLST_STDR_CODE;
    }

    // 7. 전문/일반 구분
    public String getSPCLTY_PBLC() {
        return SPCLTY_PBLC;
    }

    public void setSPCLTY_PBLC(String SPCLTY_PBLC) {
        this.SPCLTY_PBLC = SPCLTY_PBLC;
    }

    // 8. 분류명
    public String getPRDUCT_TYPE() {
        return PRDUCT_TYPE;
    }

    public void setPRDUCT_TYPE(String PRDUCT_TYPE) {
        this.PRDUCT_TYPE = PRDUCT_TYPE;
    }

    // 9. 품목허가번호
    public String getPRDUCT_PRMISN_NO() {
        return PRDUCT_PRMISN_NO;
    }

    public void setPRDUCT_PRMISN_NO(String PRDUCT_PRMISN_NO) {
        this.PRDUCT_PRMISN_NO = PRDUCT_PRMISN_NO;
    }

    // 10. 주 성분
    public String getITEM_INGR_NAME() {
        return ITEM_INGR_NAME;
    }

    public void setITEM_INGR_NAME(String ITEM_INGR_NAME) {
        this.ITEM_INGR_NAME = ITEM_INGR_NAME;
    }

    // 11. 주 성분 수
    public String getITEM_INGR_CNT() {
        return ITEM_INGR_CNT;
    }

    public void setITEM_INGR_CNT(String ITEM_INGR_CNT) {
        this.ITEM_INGR_CNT = ITEM_INGR_CNT;
    }

    // 12. 신고/허가 구분
    public String getPERMIT_KIND_CODE() {
        return PERMIT_KIND_CODE;
    }

    public void setPERMIT_KIND_CODE(String PERMIT_KIND_CODE) {
        this.PERMIT_KIND_CODE = PERMIT_KIND_CODE;
    }

    // 13. 취하 일자
    public String getCANCEL_DATE() {
        return CANCEL_DATE;
    }

    public void setCANCEL_DATE(String CANCEL_DATE) {
        this.CANCEL_DATE = CANCEL_DATE;
    }

    // 14. 취하 구분
    public String getCANCEL_NAME() {
        return CANCEL_NAME;
    }

    public void setCANCEL_NAME(String CANCEL_NAME) {
        this.CANCEL_NAME = CANCEL_NAME;
    }

    @Override
    public String toString() {
        return "Medicine [ITEM_SEQ=" + ITEM_SEQ + ", ITEM_NAME=" + ITEM_NAME + ", ENTP_NAME=" + ENTP_NAME + "]";
        //return "Medicine [ITEM_SEQ=" + ITEM_SEQ + ", ITEM_NAME=" + ITEM_NAME + ", ENTP_NAME=" + ENTP_NAME + ", ITEM_PERMIT_DATE=" + ITEM_PERMIT_DATE + ", INDUTY=" + INDUTY
        //        + ", PRDLST_STDR_CODE=" + PRDLST_STDR_CODE + ", SPCLTY_PBLC=" + SPCLTY_PBLC + ", PRDUCT_TYPE=" + PRDUCT_TYPE + ", PRDUCT_PRMISN_NO=" + PRDUCT_PRMISN_NO
        //        + ", ITEM_INGR_NAME=" + ITEM_INGR_NAME + ", ITEM_INGR_CNT=" + ITEM_INGR_CNT + ", PERMIT_KIND_CODE=" + PERMIT_KIND_CODE + ", CANCEL_DATE=" + CANCEL_DATE +
        //       ", CANCEL_NAME=" + CANCEL_NAME + "]";
    }
}


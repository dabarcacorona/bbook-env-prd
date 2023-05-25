package cl.corona.bbookenvprd.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bbook_mtc_sdivpcpvr")
public class bbookMtcsdivpcpvr {


    @Column(name="batch_num" ,columnDefinition = "number(12)")
    protected Long batchNum;

    @Column(name="case_pack_id" ,columnDefinition = "nchar(25)")
    protected String casePackId;

    @Column(name="prd_pdh_name_1" ,columnDefinition = "nchar(30)")
    protected String prdPdhName1;

    @Column(name="prd_pdh_name_2" ,columnDefinition = "nchar(30)")
    protected String prdPdhName2;

    @Column(name="prd_pdh_name_3" ,columnDefinition = "nchar(30)")
    protected String prdPdhName3;

    @Column(name="prd_pdd_code_1" ,columnDefinition = "nchar(6)")
    protected String prdPddCode1;

    @Column(name="prd_pdd_code_2" ,columnDefinition = "nchar(6)")
    protected String prdPddCode2;

    @Column(name="prd_pdd_code_3" ,columnDefinition = "nchar(6)")
    protected String prdPddCode3;

    @Column(name="variation_qty" ,columnDefinition = "number(10,3)")
    protected Integer variationQty;

    @Column(name="download_date_1" ,columnDefinition = "date")
    private Date downloadDate1;

    @Id
    @Column(name="id_java" ,columnDefinition = "number(14)")
    private Long idJava;

    public bbookMtcsdivpcpvr() {
        super();
        // TODO Auto-generated constructor stub
    }

    public bbookMtcsdivpcpvr(Long batchNum, String casePackId, String prdPdhName1, String prdPdhName2,
                             String prdPdhName3, String prdPddCode1, String prdPddCode2, String prdPddCode3, Integer variationQty,
                             Date downloadDate1, Long idJava) {
        super();
        this.batchNum = batchNum;
        this.casePackId = casePackId;
        this.prdPdhName1 = prdPdhName1;
        this.prdPdhName2 = prdPdhName2;
        this.prdPdhName3 = prdPdhName3;
        this.prdPddCode1 = prdPddCode1;
        this.prdPddCode2 = prdPddCode2;
        this.prdPddCode3 = prdPddCode3;
        this.variationQty = variationQty;
        this.downloadDate1 = downloadDate1;
        this.idJava = idJava;
    }

    @Override
    public String toString() {
        return "BbookMtcSdivpcpvr [batchNum=" + batchNum + ", casePackId=" + casePackId + ", prdPdhName1=" + prdPdhName1
                + ", prdPdhName2=" + prdPdhName2 + ", prdPdhName3=" + prdPdhName3 + ", prdPddCode1=" + prdPddCode1
                + ", prdPddCode2=" + prdPddCode2 + ", prdPddCode3=" + prdPddCode3 + ", variationQty=" + variationQty
                + ", downloadDate1=" + downloadDate1 + ", idJava=" + idJava + "]";
    }

    public Long getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(Long batchNum) {
        this.batchNum = batchNum;
    }

    public String getCasePackId() {
        return casePackId;
    }

    public void setCasePackId(String casePackId) {
        this.casePackId = casePackId;
    }

    public String getPrdPdhName1() {
        return prdPdhName1;
    }

    public void setPrdPdhName1(String prdPdhName1) {
        this.prdPdhName1 = prdPdhName1;
    }

    public String getPrdPdhName2() {
        return prdPdhName2;
    }

    public void setPrdPdhName2(String prdPdhName2) {
        this.prdPdhName2 = prdPdhName2;
    }

    public String getPrdPdhName3() {
        return prdPdhName3;
    }

    public void setPrdPdhName3(String prdPdhName3) {
        this.prdPdhName3 = prdPdhName3;
    }

    public String getPrdPddCode1() {
        return prdPddCode1;
    }

    public void setPrdPddCode1(String prdPddCode1) {
        this.prdPddCode1 = prdPddCode1;
    }

    public String getPrdPddCode2() {
        return prdPddCode2;
    }

    public void setPrdPddCode2(String prdPddCode2) {
        this.prdPddCode2 = prdPddCode2;
    }

    public String getPrdPddCode3() {
        return prdPddCode3;
    }

    public void setPrdPddCode3(String prdPddCode3) {
        this.prdPddCode3 = prdPddCode3;
    }

    public Integer getVariationQty() {
        return variationQty;
    }

    public void setVariationQty(Integer variationQty) {
        this.variationQty = variationQty;
    }

    public Date getDownloadDate1() {
        return downloadDate1;
    }

    public void setDownloadDate1(Date downloadDate1) {
        this.downloadDate1 = downloadDate1;
    }

    public Long getIdJava() {
        return idJava;
    }

    public void setIdJava(Long idJava) {
        this.idJava = idJava;
    }


}

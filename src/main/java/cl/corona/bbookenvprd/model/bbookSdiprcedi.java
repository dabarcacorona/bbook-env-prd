package cl.corona.bbookenvprd.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="bbook_sdiprcedi")
public class bbookSdiprcedi {

    @Column(name="batch_num" ,columnDefinition = "number(14)")
    protected Long batchNum;

    @Column(name="trans_sequence" ,columnDefinition = "number(12)")
    protected Integer transSequence;

    @Column(name="trans_dtl_sequence" ,columnDefinition = "number(12)")
    protected Integer transDtlSequence;

    @Column(name="prd_lvl_number" ,columnDefinition = "nchar(15)")
    protected String prdLvlNumber;

    @Column(name="prd_plu" ,columnDefinition = "nchar(15)")
    protected String prdPlu;

    @Column(name="prd_upc" ,columnDefinition = "number(18)")
    protected Integer prdUpc;

    @Column(name="prc_group_number" ,columnDefinition = "nchar(15)")
    protected String prcGroupNumber;

    @Column(name="prc_group_flag" ,columnDefinition = "char(1)")
    protected String prcGroupFlag;

    @Column(name="prc_zone_number" ,columnDefinition = "number(7)")
    protected Integer prcZoneNumber;

    @Column(name="org_lvl_number" ,columnDefinition = "number(12)")
    protected Integer orgLvlNumber;

    @Column(name="prc_mult" ,columnDefinition = "number(7)")
    protected Integer prcMult;

    @Column(name="prc_price" ,columnDefinition = "number(11,3)")
    protected Integer prcPrice;

    @Column(name="prc_buy_qty" ,columnDefinition = "number(7)")
    protected Integer prcBuyQty;

    @Column(name="prc_get_qty" ,columnDefinition = "number(7)")
    protected Integer prcGetQty;

    @Column(name="prc_get_value" ,columnDefinition = "number(11,3)")
    protected Integer prcGetValue;

    @Column(name="prc_get_type" ,columnDefinition = "char(1)")
    protected String prcGetType;

    @Column(name="prc_fcst_qty" ,columnDefinition = "number(12)")
    protected Integer prcFcstQty;

    @Column(name="prc_max_qty" ,columnDefinition = "number(12)")
    protected Integer prcMaxQty;

    @Column(name="prc_uom" ,columnDefinition = "varchar2(6)")
    protected String prcUom;

    @Column(name="prc_curr_code" ,columnDefinition = "varchar2(3)")
    protected String prcCurrCode;

    @Column(name="prc_allow_rnd" ,columnDefinition = "char(1)")
    protected String prcAllowRnd;

    @Column(name="prc_allow_curr" ,columnDefinition = "char(1)")
    protected String prcAllowCurr;

    @Column(name="prc_allow_link" ,columnDefinition = "char(1)")
    protected String prcAllowLink;

    @Column(name="rej_code" ,columnDefinition = "number(3)")
    protected Integer rejCode;

    @Column(name="download_date_1" ,columnDefinition = "date")
    protected Date downloadDate1;

    @Column(name="download_date_2" ,columnDefinition = "date")
    protected Date downloadDate2;

    @Column(name="batch_numb" ,columnDefinition = "number(14)")
    protected Long batchNumb;

    @Column(name="nombre_archivo" ,columnDefinition = "varchar2(50)")
    private String nombreArchivo;

    @Column(name="fecha_stage" ,columnDefinition = "date")
    private Date fechaStage;

    @Column(name="fecha_permanente" ,columnDefinition = "date")
    private Date fechaPermanente;

    @Column(name="fecha_backup" ,columnDefinition = "date")
    private Date fechaBackup;

    @Id
    @Column(name="id_java" ,columnDefinition = "number(14)")
    private Long idJava;


    public bbookSdiprcedi() {
        super();
        // TODO Auto-generated constructor stub
    }


    public bbookSdiprcedi(Long batchNum, Integer transSequence, Integer transDtlSequence, String prdLvlNumber,
                          String prdPlu, Integer prdUpc, String prcGroupNumber, String prcGroupFlag, Integer prcZoneNumber,
                          Integer orgLvlNumber, Integer prcMult, Integer prcPrice, Integer prcBuyQty, Integer prcGetQty,
                          Integer prcGetValue, String prcGetType, Integer prcFcstQty, Integer prcMaxQty, String prcUom,
                          String prcCurrCode, String prcAllowRnd, String prcAllowCurr, String prcAllowLink, Integer rejCode,
                          Date downloadDate1, Date downloadDate2, Long batchNumb, String nombreArchivo, Date fechaStage,
                          Date fechaPermanente, Date fechaBackup, Long idJava) {
        super();
        this.batchNum = batchNum;
        this.transSequence = transSequence;
        this.transDtlSequence = transDtlSequence;
        this.prdLvlNumber = prdLvlNumber;
        this.prdPlu = prdPlu;
        this.prdUpc = prdUpc;
        this.prcGroupNumber = prcGroupNumber;
        this.prcGroupFlag = prcGroupFlag;
        this.prcZoneNumber = prcZoneNumber;
        this.orgLvlNumber = orgLvlNumber;
        this.prcMult = prcMult;
        this.prcPrice = prcPrice;
        this.prcBuyQty = prcBuyQty;
        this.prcGetQty = prcGetQty;
        this.prcGetValue = prcGetValue;
        this.prcGetType = prcGetType;
        this.prcFcstQty = prcFcstQty;
        this.prcMaxQty = prcMaxQty;
        this.prcUom = prcUom;
        this.prcCurrCode = prcCurrCode;
        this.prcAllowRnd = prcAllowRnd;
        this.prcAllowCurr = prcAllowCurr;
        this.prcAllowLink = prcAllowLink;
        this.rejCode = rejCode;
        this.downloadDate1 = downloadDate1;
        this.downloadDate2 = downloadDate2;
        this.batchNumb = batchNumb;
        this.nombreArchivo = nombreArchivo;
        this.fechaStage = fechaStage;
        this.fechaPermanente = fechaPermanente;
        this.fechaBackup = fechaBackup;
        this.idJava = idJava;
    }


    @Override
    public String toString() {
        return "BbookSdiprcedi [batchNum=" + batchNum + ", transSequence=" + transSequence + ", transDtlSequence="
                + transDtlSequence + ", prdLvlNumber=" + prdLvlNumber + ", prdPlu=" + prdPlu + ", prdUpc=" + prdUpc
                + ", prcGroupNumber=" + prcGroupNumber + ", prcGroupFlag=" + prcGroupFlag + ", prcZoneNumber="
                + prcZoneNumber + ", orgLvlNumber=" + orgLvlNumber + ", prcMult=" + prcMult + ", prcPrice=" + prcPrice
                + ", prcBuyQty=" + prcBuyQty + ", prcGetQty=" + prcGetQty + ", prcGetValue=" + prcGetValue
                + ", prcGetType=" + prcGetType + ", prcFcstQty=" + prcFcstQty + ", prcMaxQty=" + prcMaxQty + ", prcUom="
                + prcUom + ", prcCurrCode=" + prcCurrCode + ", prcAllowRnd=" + prcAllowRnd + ", prcAllowCurr="
                + prcAllowCurr + ", prcAllowLink=" + prcAllowLink + ", rejCode=" + rejCode + ", downloadDate1="
                + downloadDate1 + ", downloadDate2=" + downloadDate2 + ", batchNumb=" + batchNumb + ", nombreArchivo="
                + nombreArchivo + ", fechaStage=" + fechaStage + ", fechaPermanente=" + fechaPermanente
                + ", fechaBackup=" + fechaBackup + ", idJava=" + idJava + "]";
    }


    public Long getBatchNum() {
        return batchNum;
    }


    public void setBatchNum(Long batchNum) {
        this.batchNum = batchNum;
    }


    public Integer getTransSequence() {
        return transSequence;
    }


    public void setTransSequence(Integer transSequence) {
        this.transSequence = transSequence;
    }


    public Integer getTransDtlSequence() {
        return transDtlSequence;
    }


    public void setTransDtlSequence(Integer transDtlSequence) {
        this.transDtlSequence = transDtlSequence;
    }


    public String getPrdLvlNumber() {
        return prdLvlNumber;
    }


    public void setPrdLvlNumber(String prdLvlNumber) {
        this.prdLvlNumber = prdLvlNumber;
    }


    public String getPrdPlu() {
        return prdPlu;
    }


    public void setPrdPlu(String prdPlu) {
        this.prdPlu = prdPlu;
    }


    public Integer getPrdUpc() {
        return prdUpc;
    }


    public void setPrdUpc(Integer prdUpc) {
        this.prdUpc = prdUpc;
    }


    public String getPrcGroupNumber() {
        return prcGroupNumber;
    }


    public void setPrcGroupNumber(String prcGroupNumber) {
        this.prcGroupNumber = prcGroupNumber;
    }


    public String getPrcGroupFlag() {
        return prcGroupFlag;
    }


    public void setPrcGroupFlag(String prcGroupFlag) {
        this.prcGroupFlag = prcGroupFlag;
    }


    public Integer getPrcZoneNumber() {
        return prcZoneNumber;
    }


    public void setPrcZoneNumber(Integer prcZoneNumber) {
        this.prcZoneNumber = prcZoneNumber;
    }


    public Integer getOrgLvlNumber() {
        return orgLvlNumber;
    }


    public void setOrgLvlNumber(Integer orgLvlNumber) {
        this.orgLvlNumber = orgLvlNumber;
    }


    public Integer getPrcMult() {
        return prcMult;
    }


    public void setPrcMult(Integer prcMult) {
        this.prcMult = prcMult;
    }


    public Integer getPrcPrice() {
        return prcPrice;
    }


    public void setPrcPrice(Integer prcPrice) {
        this.prcPrice = prcPrice;
    }


    public Integer getPrcBuyQty() {
        return prcBuyQty;
    }


    public void setPrcBuyQty(Integer prcBuyQty) {
        this.prcBuyQty = prcBuyQty;
    }


    public Integer getPrcGetQty() {
        return prcGetQty;
    }


    public void setPrcGetQty(Integer prcGetQty) {
        this.prcGetQty = prcGetQty;
    }


    public Integer getPrcGetValue() {
        return prcGetValue;
    }


    public void setPrcGetValue(Integer prcGetValue) {
        this.prcGetValue = prcGetValue;
    }


    public String getPrcGetType() {
        return prcGetType;
    }


    public void setPrcGetType(String prcGetType) {
        this.prcGetType = prcGetType;
    }


    public Integer getPrcFcstQty() {
        return prcFcstQty;
    }


    public void setPrcFcstQty(Integer prcFcstQty) {
        this.prcFcstQty = prcFcstQty;
    }


    public Integer getPrcMaxQty() {
        return prcMaxQty;
    }


    public void setPrcMaxQty(Integer prcMaxQty) {
        this.prcMaxQty = prcMaxQty;
    }


    public String getPrcUom() {
        return prcUom;
    }


    public void setPrcUom(String prcUom) {
        this.prcUom = prcUom;
    }


    public String getPrcCurrCode() {
        return prcCurrCode;
    }


    public void setPrcCurrCode(String prcCurrCode) {
        this.prcCurrCode = prcCurrCode;
    }


    public String getPrcAllowRnd() {
        return prcAllowRnd;
    }


    public void setPrcAllowRnd(String prcAllowRnd) {
        this.prcAllowRnd = prcAllowRnd;
    }


    public String getPrcAllowCurr() {
        return prcAllowCurr;
    }


    public void setPrcAllowCurr(String prcAllowCurr) {
        this.prcAllowCurr = prcAllowCurr;
    }


    public String getPrcAllowLink() {
        return prcAllowLink;
    }


    public void setPrcAllowLink(String prcAllowLink) {
        this.prcAllowLink = prcAllowLink;
    }


    public Integer getRejCode() {
        return rejCode;
    }


    public void setRejCode(Integer rejCode) {
        this.rejCode = rejCode;
    }


    public Date getDownloadDate1() {
        return downloadDate1;
    }


    public void setDownloadDate1(Date downloadDate1) {
        this.downloadDate1 = downloadDate1;
    }


    public Date getDownloadDate2() {
        return downloadDate2;
    }


    public void setDownloadDate2(Date downloadDate2) {
        this.downloadDate2 = downloadDate2;
    }


    public Long getBatchNumb() {
        return batchNumb;
    }


    public void setBatchNumb(Long batchNumb) {
        this.batchNumb = batchNumb;
    }


    public String getNombreArchivo() {
        return nombreArchivo;
    }


    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }


    public Date getFechaStage() {
        return fechaStage;
    }


    public void setFechaStage(Date fechaStage) {
        this.fechaStage = fechaStage;
    }


    public Date getFechaPermanente() {
        return fechaPermanente;
    }


    public void setFechaPermanente(Date fechaPermanente) {
        this.fechaPermanente = fechaPermanente;
    }


    public Date getFechaBackup() {
        return fechaBackup;
    }


    public void setFechaBackup(Date fechaBackup) {
        this.fechaBackup = fechaBackup;
    }


    public Long getIdJava() {
        return idJava;
    }


    public void setIdJava(Long idJava) {
        this.idJava = idJava;
    }
}

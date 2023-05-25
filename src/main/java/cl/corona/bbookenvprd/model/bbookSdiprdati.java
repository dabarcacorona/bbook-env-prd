package cl.corona.bbookenvprd.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bbook_sdiprdati")
public class bbookSdiprdati {

    @Column(name="batch_num" ,columnDefinition = "number(14)")
    protected Long batchNum;

    @Column(name="control_number" ,columnDefinition = "number(12)")
    protected Integer controlNumber;

    @Column(name="prd_lvl_number" ,columnDefinition = "nchar(15)")
    protected String prdLvlNumber;

    @Column(name="org_lvl_number" ,columnDefinition = "number(12)")
    protected Integer orgLvlNumber;

    @Column(name="atr_typ_tech_key" ,columnDefinition = "number(12)")
    protected Integer atrTypTechKey;

    @Column(name="atr_type_desc" ,columnDefinition = "nvarchar2(20)")
    protected String atrTypeDesc;

    @Column(name="atr_hdr_tech_key" ,columnDefinition = "number(12)")
    protected Integer atrHdrTechKey;

    @Column(name="atr_hdr_desc" ,columnDefinition = "nvarchar2(20)")
    protected String atrHdrDesc;

    @Column(name="atr_code" ,columnDefinition = "nchar(10)")
    protected String atrCode;

    @Column(name="tran_type" ,columnDefinition = "char(1)")
    protected String tranType ;

    @Column(name="atr_code_desc" ,columnDefinition = "nvarchar2(40)")
    protected String atrCodeDesc ;

    @Column(name="att_create" ,columnDefinition = "char(1)")
    protected String attCreate ;

    @Column(name="prd_lvl_id" ,columnDefinition = "number(5)")
    protected Integer prd_lvl_id ;

    @Column(name="org_lvl_id" ,columnDefinition = "number(5)")
    protected Integer org_lvl_id ;

    @Column(name="date_created" ,columnDefinition = "varchar2(8)")
    protected String dateCreated ;

    @Column(name="download_date_1" ,columnDefinition = "date")
    protected Date downloadDate1 ;

    @Column(name="download_date_2" ,columnDefinition = "date")
    protected Date downloadDate2 ;

    @Column(name="atr_is_value" ,columnDefinition = "char(1)")
    protected String atrIsValue  ;

    @Column(name="error_code" ,columnDefinition = "number(1)")
    protected String errorCode  ;

    @Column(name="vendor_number" ,columnDefinition = "nchar(15)")
    protected String vendorNumber  ;

    @Column(name="alt_prd_lvl_number" ,columnDefinition = "nchar(15)")
    protected String altPrdLvlNumber  ;

    @Column(name="alt_prd_lvl_id" ,columnDefinition = "number(5)")
    protected Integer altPrdLvlId  ;

    @Column(name="alt_org_lvl_number" ,columnDefinition = "number(12)")
    protected Integer altOrgLvlNumber  ;

    @Column(name="alt_org_lvl_id" ,columnDefinition = "number(5)")
    protected Integer altOrgLvlId  ;

    @Column(name="prd_ref" ,columnDefinition = "varchar2(12)")
    protected String prdRef ;

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


    public bbookSdiprdati() {
        super();
        // TODO Auto-generated constructor stub
    }


    public bbookSdiprdati(Long batchNum, Integer controlNumber, String prdLvlNumber, Integer orgLvlNumber,
                          Integer atrTypTechKey, String atrTypeDesc, Integer atrHdrTechKey, String atrHdrDesc, String atrCode,
                          String tranType, String atrCodeDesc, String attCreate, Integer prd_lvl_id, Integer org_lvl_id,
                          String dateCreated, Date downloadDate1, Date downloadDate2, String atrIsValue, String errorCode,
                          String vendorNumber, String altPrdLvlNumber, Integer altPrdLvlId, Integer altOrgLvlNumber,
                          Integer altOrgLvlId, String prdRef, String nombreArchivo, Date fechaStage, Date fechaPermanente,
                          Date fechaBackup, Long idJava) {
        super();
        this.batchNum = batchNum;
        this.controlNumber = controlNumber;
        this.prdLvlNumber = prdLvlNumber;
        this.orgLvlNumber = orgLvlNumber;
        this.atrTypTechKey = atrTypTechKey;
        this.atrTypeDesc = atrTypeDesc;
        this.atrHdrTechKey = atrHdrTechKey;
        this.atrHdrDesc = atrHdrDesc;
        this.atrCode = atrCode;
        this.tranType = tranType;
        this.atrCodeDesc = atrCodeDesc;
        this.attCreate = attCreate;
        this.prd_lvl_id = prd_lvl_id;
        this.org_lvl_id = org_lvl_id;
        this.dateCreated = dateCreated;
        this.downloadDate1 = downloadDate1;
        this.downloadDate2 = downloadDate2;
        this.atrIsValue = atrIsValue;
        this.errorCode = errorCode;
        this.vendorNumber = vendorNumber;
        this.altPrdLvlNumber = altPrdLvlNumber;
        this.altPrdLvlId = altPrdLvlId;
        this.altOrgLvlNumber = altOrgLvlNumber;
        this.altOrgLvlId = altOrgLvlId;
        this.prdRef = prdRef;
        this.nombreArchivo = nombreArchivo;
        this.fechaStage = fechaStage;
        this.fechaPermanente = fechaPermanente;
        this.fechaBackup = fechaBackup;
        this.idJava = idJava;
    }


    @Override
    public String toString() {
        return "BbookSdiprdati [batchNum=" + batchNum + ", controlNumber=" + controlNumber + ", prdLvlNumber="
                + prdLvlNumber + ", orgLvlNumber=" + orgLvlNumber + ", atrTypTechKey=" + atrTypTechKey
                + ", atrTypeDesc=" + atrTypeDesc + ", atrHdrTechKey=" + atrHdrTechKey + ", atrHdrDesc=" + atrHdrDesc
                + ", atrCode=" + atrCode + ", tranType=" + tranType + ", atrCodeDesc=" + atrCodeDesc + ", attCreate="
                + attCreate + ", prd_lvl_id=" + prd_lvl_id + ", org_lvl_id=" + org_lvl_id + ", dateCreated="
                + dateCreated + ", downloadDate1=" + downloadDate1 + ", downloadDate2=" + downloadDate2
                + ", atrIsValue=" + atrIsValue + ", errorCode=" + errorCode + ", vendorNumber=" + vendorNumber
                + ", altPrdLvlNumber=" + altPrdLvlNumber + ", altPrdLvlId=" + altPrdLvlId + ", altOrgLvlNumber="
                + altOrgLvlNumber + ", altOrgLvlId=" + altOrgLvlId + ", prdRef=" + prdRef + ", nombreArchivo="
                + nombreArchivo + ", fechaStage=" + fechaStage + ", fechaPermanente=" + fechaPermanente
                + ", fechaBackup=" + fechaBackup + ", idJava=" + idJava + "]";
    }


    public Long getBatchNum() {
        return batchNum;
    }


    public void setBatchNum(Long batchNum) {
        this.batchNum = batchNum;
    }


    public Integer getControlNumber() {
        return controlNumber;
    }


    public void setControlNumber(Integer controlNumber) {
        this.controlNumber = controlNumber;
    }


    public String getPrdLvlNumber() {
        return prdLvlNumber;
    }


    public void setPrdLvlNumber(String prdLvlNumber) {
        this.prdLvlNumber = prdLvlNumber;
    }


    public Integer getOrgLvlNumber() {
        return orgLvlNumber;
    }


    public void setOrgLvlNumber(Integer orgLvlNumber) {
        this.orgLvlNumber = orgLvlNumber;
    }


    public Integer getAtrTypTechKey() {
        return atrTypTechKey;
    }


    public void setAtrTypTechKey(Integer atrTypTechKey) {
        this.atrTypTechKey = atrTypTechKey;
    }


    public String getAtrTypeDesc() {
        return atrTypeDesc;
    }


    public void setAtrTypeDesc(String atrTypeDesc) {
        this.atrTypeDesc = atrTypeDesc;
    }


    public Integer getAtrHdrTechKey() {
        return atrHdrTechKey;
    }


    public void setAtrHdrTechKey(Integer atrHdrTechKey) {
        this.atrHdrTechKey = atrHdrTechKey;
    }


    public String getAtrHdrDesc() {
        return atrHdrDesc;
    }


    public void setAtrHdrDesc(String atrHdrDesc) {
        this.atrHdrDesc = atrHdrDesc;
    }


    public String getAtrCode() {
        return atrCode;
    }


    public void setAtrCode(String atrCode) {
        this.atrCode = atrCode;
    }


    public String getTranType() {
        return tranType;
    }


    public void setTranType(String tranType) {
        this.tranType = tranType;
    }


    public String getAtrCodeDesc() {
        return atrCodeDesc;
    }


    public void setAtrCodeDesc(String atrCodeDesc) {
        this.atrCodeDesc = atrCodeDesc;
    }


    public String getAttCreate() {
        return attCreate;
    }


    public void setAttCreate(String attCreate) {
        this.attCreate = attCreate;
    }


    public Integer getPrd_lvl_id() {
        return prd_lvl_id;
    }


    public void setPrd_lvl_id(Integer prd_lvl_id) {
        this.prd_lvl_id = prd_lvl_id;
    }


    public Integer getOrg_lvl_id() {
        return org_lvl_id;
    }


    public void setOrg_lvl_id(Integer org_lvl_id) {
        this.org_lvl_id = org_lvl_id;
    }


    public String getDateCreated() {
        return dateCreated;
    }


    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
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


    public String getAtrIsValue() {
        return atrIsValue;
    }


    public void setAtrIsValue(String atrIsValue) {
        this.atrIsValue = atrIsValue;
    }


    public String getErrorCode() {
        return errorCode;
    }


    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    public String getVendorNumber() {
        return vendorNumber;
    }


    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }


    public String getAltPrdLvlNumber() {
        return altPrdLvlNumber;
    }


    public void setAltPrdLvlNumber(String altPrdLvlNumber) {
        this.altPrdLvlNumber = altPrdLvlNumber;
    }


    public Integer getAltPrdLvlId() {
        return altPrdLvlId;
    }


    public void setAltPrdLvlId(Integer altPrdLvlId) {
        this.altPrdLvlId = altPrdLvlId;
    }


    public Integer getAltOrgLvlNumber() {
        return altOrgLvlNumber;
    }


    public void setAltOrgLvlNumber(Integer altOrgLvlNumber) {
        this.altOrgLvlNumber = altOrgLvlNumber;
    }


    public Integer getAltOrgLvlId() {
        return altOrgLvlId;
    }


    public void setAltOrgLvlId(Integer altOrgLvlId) {
        this.altOrgLvlId = altOrgLvlId;
    }


    public String getPrdRef() {
        return prdRef;
    }


    public void setPrdRef(String prdRef) {
        this.prdRef = prdRef;
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


package cl.corona.bbookenvprd.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bbook_sdiprddsi")
public class bbookSdiprddsi {

    @Column(name="batch_num" ,columnDefinition = "number(14)")
    protected Long batchNum;

    @Column(name="audit_number" ,columnDefinition = "number(12)")
    protected Long auditNumber;

    @Column(name="prd_lvl_number" ,columnDefinition = "nchar(15)")
    protected String prdLvlNumber;

    @Column(name="tran_type" ,columnDefinition = "char(1)")
    protected String tranType;

    @Column(name="prd_desc" ,columnDefinition = "nvarchar2(40)")
    protected String prdDesc;

    @Column(name="prd_desc_name" ,columnDefinition = "nvarchar2(40)")
    protected String prdDescName;

    @Column(name="prd_desc_length" ,columnDefinition = "number(2)")
    protected Integer prdDescLength;

    @Column(name="desc_create" ,columnDefinition = "char(1)")
    protected String descCreate;

    @Column(name="date_created" ,columnDefinition = "varchar2(8)")
    protected String dateCreated;

    @Column(name="download_date_1" ,columnDefinition = "date")
    protected Date downloadDate1;

    @Column(name="download_date_2" ,columnDefinition = "date")
    protected Date downloadDate2;

    @Column(name="error_code" ,columnDefinition = "number(3)")
    protected Integer errorCode;

    @Column(name="mandatory" ,columnDefinition = "char(1)")
    protected String mandatory;

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


    public bbookSdiprddsi() {
        super();
        // TODO Auto-generated constructor stub
    }


    public bbookSdiprddsi(Long batchNum, Long auditNumber, String prdLvlNumber, String tranType, String prdDesc,
                          String prdDescName, Integer prdDescLength, String descCreate, String dateCreated, Date downloadDate1,
                          Date downloadDate2, Integer errorCode, String mandatory, String prdRef, String nombreArchivo,
                          Date fechaStage, Date fechaPermanente, Date fechaBackup, Long idJava) {
        super();
        this.batchNum = batchNum;
        this.auditNumber = auditNumber;
        this.prdLvlNumber = prdLvlNumber;
        this.tranType = tranType;
        this.prdDesc = prdDesc;
        this.prdDescName = prdDescName;
        this.prdDescLength = prdDescLength;
        this.descCreate = descCreate;
        this.dateCreated = dateCreated;
        this.downloadDate1 = downloadDate1;
        this.downloadDate2 = downloadDate2;
        this.errorCode = errorCode;
        this.mandatory = mandatory;
        this.prdRef = prdRef;
        this.nombreArchivo = nombreArchivo;
        this.fechaStage = fechaStage;
        this.fechaPermanente = fechaPermanente;
        this.fechaBackup = fechaBackup;
        this.idJava = idJava;
    }


    @Override
    public String toString() {
        return "BbookSdiprddsi [batchNum=" + batchNum + ", auditNumber=" + auditNumber + ", prdLvlNumber="
                + prdLvlNumber + ", tranType=" + tranType + ", prdDesc=" + prdDesc + ", prdDescName=" + prdDescName
                + ", prdDescLength=" + prdDescLength + ", descCreate=" + descCreate + ", dateCreated=" + dateCreated
                + ", downloadDate1=" + downloadDate1 + ", downloadDate2=" + downloadDate2 + ", errorCode=" + errorCode
                + ", mandatory=" + mandatory + ", prdRef=" + prdRef + ", nombreArchivo=" + nombreArchivo
                + ", fechaStage=" + fechaStage + ", fechaPermanente=" + fechaPermanente + ", fechaBackup=" + fechaBackup
                + ", idJava=" + idJava + "]";
    }


    public Long getBatchNum() {
        return batchNum;
    }


    public void setBatchNum(Long batchNum) {
        this.batchNum = batchNum;
    }


    public Long getAuditNumber() {
        return auditNumber;
    }


    public void setAuditNumber(Long auditNumber) {
        this.auditNumber = auditNumber;
    }


    public String getPrdLvlNumber() {
        return prdLvlNumber;
    }


    public void setPrdLvlNumber(String prdLvlNumber) {
        this.prdLvlNumber = prdLvlNumber;
    }


    public String getTranType() {
        return tranType;
    }


    public void setTranType(String tranType) {
        this.tranType = tranType;
    }


    public String getPrdDesc() {
        return prdDesc;
    }


    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }


    public String getPrdDescName() {
        return prdDescName;
    }


    public void setPrdDescName(String prdDescName) {
        this.prdDescName = prdDescName;
    }


    public Integer getPrdDescLength() {
        return prdDescLength;
    }


    public void setPrdDescLength(Integer prdDescLength) {
        this.prdDescLength = prdDescLength;
    }


    public String getDescCreate() {
        return descCreate;
    }


    public void setDescCreate(String descCreate) {
        this.descCreate = descCreate;
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


    public Integer getErrorCode() {
        return errorCode;
    }


    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


    public String getMandatory() {
        return mandatory;
    }


    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
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


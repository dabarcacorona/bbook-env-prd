package cl.corona.bbookenvprd.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bbook_sdiprddss")
public class bbookSdiprddss {

    @Column(name="batch_num" ,columnDefinition = "number(14)")
    protected long batchNum;

    @Column(name="prd_lvl_number" ,columnDefinition = "nchar(15)")
    protected String prdLvlNumber;

    @Column(name="prd_pdh_name" ,columnDefinition = "nchar(30)")
    protected String prdPdhName;

    @Column(name="prd_pdd_code" ,columnDefinition = "nchar(6)")
    protected String prdPddCode;

    @Column(name="date_created" ,columnDefinition = "varchar2(8)")
    protected String dateCreated;

    @Column(name="download_date_1" ,columnDefinition = "date")
    protected Date downloadDate1;

    @Column(name="download_date_2" ,columnDefinition = "date")
    protected Date downloadDate2;

    @Column(name="error_code" ,columnDefinition = "number(3)")
    protected Integer errorCode;

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

    public bbookSdiprddss() {
        super();
        // TODO Auto-generated constructor stub
    }

    public bbookSdiprddss(long batchNum, String prdLvlNumber, String prdPdhName, String prdPddCode, String dateCreated,
                          Date downloadDate1, Date downloadDate2, Integer errorCode, String nombreArchivo, Date fechaStage,
                          Date fechaPermanente, Date fechaBackup, Long idJava) {
        super();
        this.batchNum = batchNum;
        this.prdLvlNumber = prdLvlNumber;
        this.prdPdhName = prdPdhName;
        this.prdPddCode = prdPddCode;
        this.dateCreated = dateCreated;
        this.downloadDate1 = downloadDate1;
        this.downloadDate2 = downloadDate2;
        this.errorCode = errorCode;
        this.nombreArchivo = nombreArchivo;
        this.fechaStage = fechaStage;
        this.fechaPermanente = fechaPermanente;
        this.fechaBackup = fechaBackup;
        this.idJava = idJava;
    }

    @Override
    public String toString() {
        return "BbookSdiprddss [batchNum=" + batchNum + ", prdLvlNumber=" + prdLvlNumber + ", prdPdhName=" + prdPdhName
                + ", prdPddCode=" + prdPddCode + ", dateCreated=" + dateCreated + ", downloadDate1=" + downloadDate1
                + ", downloadDate2=" + downloadDate2 + ", errorCode=" + errorCode + ", nombreArchivo=" + nombreArchivo
                + ", fechaStage=" + fechaStage + ", fechaPermanente=" + fechaPermanente + ", fechaBackup=" + fechaBackup
                + ", idJava=" + idJava + "]";
    }

    public long getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(long batchNum) {
        this.batchNum = batchNum;
    }

    public String getPrdLvlNumber() {
        return prdLvlNumber;
    }

    public void setPrdLvlNumber(String prdLvlNumber) {
        this.prdLvlNumber = prdLvlNumber;
    }

    public String getPrdPdhName() {
        return prdPdhName;
    }

    public void setPrdPdhName(String prdPdhName) {
        this.prdPdhName = prdPdhName;
    }

    public String getPrdPddCode() {
        return prdPddCode;
    }

    public void setPrdPddCode(String prdPddCode) {
        this.prdPddCode = prdPddCode;
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


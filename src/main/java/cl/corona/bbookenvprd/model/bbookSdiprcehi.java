package cl.corona.bbookenvprd.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bbook_sdiprcehi")
public class bbookSdiprcehi {

    @Column(name="batch_num" ,columnDefinition = "number(14)")
    protected Long batchNum;

    @Column(name="trans_sequence" ,columnDefinition = "number(12)")
    protected Integer transSequence;

    @Column(name="trans_type" ,columnDefinition = "char(1)")
    protected String transType;

    @Column(name="prc_hdr_number" ,columnDefinition = "number(12)")
    protected Integer prcHdrNumber;

    @Column(name="prc_hdr_name" ,columnDefinition = "nvarchar2(40)")
    protected String prcHdrName;

    @Column(name="cap_chain_id" ,columnDefinition = "number(12)")
    protected Integer capChainId;

    @Column(name="prc_book_number" ,columnDefinition = "number(12)")
    protected Integer prcBookNumber;

    @Column(name="prc_type" ,columnDefinition = "number(2)")
    protected Integer prcType;

    @Column(name="prc_sub_type" ,columnDefinition = "number(2)")
    protected Integer prcSubType;

    @Column(name="prc_hdr_from_date" ,columnDefinition = "varchar2(8)")
    protected String prcHdrFromDate;

    @Column(name="prc_hdr_to_date" ,columnDefinition = "varchar2(8)")
    protected String prcHdrToDate;

    @Column(name="prc_source" ,columnDefinition = "number(2)")
    protected Integer prc_source;

    @Column(name="hist_price" ,columnDefinition = "char(1)")
    protected String histPrice;

    @Column(name="prc_track_hist" ,columnDefinition = "char(1)")
    protected String prcTrackHist;

    @Column(name="prc_hdr_notes" ,columnDefinition = "nvarchar2(2000)")
    protected String prcHdrNotes;

    @Column(name="auto_release" ,columnDefinition = "char(1)")
    protected String autoRelease;

    @Column(name="date_created" ,columnDefinition = "varchar2(8)")
    protected String dateCreated;

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


    public bbookSdiprcehi() {
        super();
        // TODO Auto-generated constructor stub
    }


    public bbookSdiprcehi(Long batchNum, Integer transSequence, String transType, Integer prcHdrNumber,
                          String prcHdrName, Integer capChainId, Integer prcBookNumber, Integer prcType, Integer prcSubType,
                          String prcHdrFromDate, String prcHdrToDate, Integer prc_source, String histPrice, String prcTrackHist,
                          String prcHdrNotes, String autoRelease, String dateCreated, Integer rejCode, Date downloadDate1,
                          Date downloadDate2, Long batchNumb, String nombreArchivo, Date fechaStage, Date fechaPermanente,
                          Date fechaBackup, Long idJava) {
        super();
        this.batchNum = batchNum;
        this.transSequence = transSequence;
        this.transType = transType;
        this.prcHdrNumber = prcHdrNumber;
        this.prcHdrName = prcHdrName;
        this.capChainId = capChainId;
        this.prcBookNumber = prcBookNumber;
        this.prcType = prcType;
        this.prcSubType = prcSubType;
        this.prcHdrFromDate = prcHdrFromDate;
        this.prcHdrToDate = prcHdrToDate;
        this.prc_source = prc_source;
        this.histPrice = histPrice;
        this.prcTrackHist = prcTrackHist;
        this.prcHdrNotes = prcHdrNotes;
        this.autoRelease = autoRelease;
        this.dateCreated = dateCreated;
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
        return "BbookSdiprcehi [batchNum=" + batchNum + ", transSequence=" + transSequence + ", transType=" + transType
                + ", prcHdrNumber=" + prcHdrNumber + ", prcHdrName=" + prcHdrName + ", capChainId=" + capChainId
                + ", prcBookNumber=" + prcBookNumber + ", prcType=" + prcType + ", prcSubType=" + prcSubType
                + ", prcHdrFromDate=" + prcHdrFromDate + ", prcHdrToDate=" + prcHdrToDate + ", prc_source=" + prc_source
                + ", histPrice=" + histPrice + ", prcTrackHist=" + prcTrackHist + ", prcHdrNotes=" + prcHdrNotes
                + ", autoRelease=" + autoRelease + ", dateCreated=" + dateCreated + ", rejCode=" + rejCode
                + ", downloadDate1=" + downloadDate1 + ", downloadDate2=" + downloadDate2 + ", batchNumb=" + batchNumb
                + ", nombreArchivo=" + nombreArchivo + ", fechaStage=" + fechaStage + ", fechaPermanente="
                + fechaPermanente + ", fechaBackup=" + fechaBackup + ", idJava=" + idJava + "]";
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


    public String getTransType() {
        return transType;
    }


    public void setTransType(String transType) {
        this.transType = transType;
    }


    public Integer getPrcHdrNumber() {
        return prcHdrNumber;
    }


    public void setPrcHdrNumber(Integer prcHdrNumber) {
        this.prcHdrNumber = prcHdrNumber;
    }


    public String getPrcHdrName() {
        return prcHdrName;
    }


    public void setPrcHdrName(String prcHdrName) {
        this.prcHdrName = prcHdrName;
    }


    public Integer getCapChainId() {
        return capChainId;
    }


    public void setCapChainId(Integer capChainId) {
        this.capChainId = capChainId;
    }


    public Integer getPrcBookNumber() {
        return prcBookNumber;
    }


    public void setPrcBookNumber(Integer prcBookNumber) {
        this.prcBookNumber = prcBookNumber;
    }


    public Integer getPrcType() {
        return prcType;
    }


    public void setPrcType(Integer prcType) {
        this.prcType = prcType;
    }


    public Integer getPrcSubType() {
        return prcSubType;
    }


    public void setPrcSubType(Integer prcSubType) {
        this.prcSubType = prcSubType;
    }


    public String getPrcHdrFromDate() {
        return prcHdrFromDate;
    }


    public void setPrcHdrFromDate(String prcHdrFromDate) {
        this.prcHdrFromDate = prcHdrFromDate;
    }


    public String getPrcHdrToDate() {
        return prcHdrToDate;
    }


    public void setPrcHdrToDate(String prcHdrToDate) {
        this.prcHdrToDate = prcHdrToDate;
    }


    public Integer getPrc_source() {
        return prc_source;
    }


    public void setPrc_source(Integer prc_source) {
        this.prc_source = prc_source;
    }


    public String getHistPrice() {
        return histPrice;
    }


    public void setHistPrice(String histPrice) {
        this.histPrice = histPrice;
    }


    public String getPrcTrackHist() {
        return prcTrackHist;
    }


    public void setPrcTrackHist(String prcTrackHist) {
        this.prcTrackHist = prcTrackHist;
    }


    public String getPrcHdrNotes() {
        return prcHdrNotes;
    }


    public void setPrcHdrNotes(String prcHdrNotes) {
        this.prcHdrNotes = prcHdrNotes;
    }


    public String getAutoRelease() {
        return autoRelease;
    }


    public void setAutoRelease(String autoRelease) {
        this.autoRelease = autoRelease;
    }


    public String getDateCreated() {
        return dateCreated;
    }


    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
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
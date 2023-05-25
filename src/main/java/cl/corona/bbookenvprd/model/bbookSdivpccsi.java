package cl.corona.bbookenvprd.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bbook_sdivpccsi")
public class bbookSdivpccsi {

    @Column(name = "batch_num", columnDefinition = "number(14)")
    protected Long batchNum;

    @Column(name = "tech_key", columnDefinition = "number(12)")
    protected Integer techKey;

    @Column(name = "tran_type", columnDefinition = "char(1)")
    protected String tranType;

    @Column(name = "prd_lvl_number", columnDefinition = "nchar(15)")
    protected String prdLvlNumber;

    @Column(name = "case_pack_id", columnDefinition = "nchar(25)")
    protected String casePackId;

    @Column(name = "vendor_number", columnDefinition = "nchar(15)")
    protected String vendorNumber;

    @Column(name = "vpc_prd_cost", columnDefinition = "number(15,5)")
    protected Double vpcPrdCost;

    @Column(name = "vpc_case_qty", columnDefinition = "number(11,4)")
    protected Integer vpcCaseQty;

    @Column(name = "vpc_case_std_pack", columnDefinition = "number(11,4)")
    protected Integer vpcCaseStdPack;

    @Column(name = "vpc_cst_start", columnDefinition = "date")
    protected Date vpcCstStart;

    @Column(name = "vpc_cst_end", columnDefinition = "date")
    protected Date vpcCstEnd;

    @Column(name = "case_pack_desc", columnDefinition = "nvarchar2(50)")
    protected String casePackDesc;

    @Column(name = "date_created", columnDefinition = "varchar2(8)")
    protected String dateCreated;

    @Column(name = "download_date_1", columnDefinition = "date")
    protected Date downloadDate1;

    @Column(name = "download_date_2", columnDefinition = "date")
    protected Date downloadDate2;

    @Column(name = "prd_sll_uom", columnDefinition = "nchar(6)")
    protected String prdSllUom;

    @Column(name = "curr_code", columnDefinition = "nchar(3)")
    protected String currCode;

    @Column(name = "subs_accepted", columnDefinition = "number(2)")
    protected Integer subsAccepted;

    @Column(name = "vpc_case_qty_uom", columnDefinition = "nchar(6)")
    protected String vpcCaseQtyUom;

    @Column(name = "number_of_inners", columnDefinition = "number(8)")
    protected Integer numberOfInners;

    @Column(name = "inv_units_per_inner", columnDefinition = "number(11,4)")
    protected Integer invUnitsPerInner;

    @Column(name = "inv_uom", columnDefinition = "nchar(6)")
    protected String inv_uom;

    @Column(name = "eaches_per_inner", columnDefinition = "number(8)")
    protected Integer eachesPerInner;

    @Column(name = "grade_code", columnDefinition = "nchar(10)")
    protected String gradeCode;

    @Column(name = "vpc_case_gross_wgt", columnDefinition = "number(11,4)")
    protected Integer vpcCaseGrossWgt;

    @Column(name = "vpc_case_wgt", columnDefinition = "number(11,4)")
    protected Integer vpcCaseWgt;

    @Column(name = " vpc_case_wgt_uom", columnDefinition = "nchar(6)")
    protected String vpcCaseWgtUom;

    @Column(name = "vpc_prd_status", columnDefinition = "number(2)")
    protected Integer vpcPrdStatus;

    @Column(name = "vpc_case_width", columnDefinition = "number(10,3)")
    protected Integer vpcCaseWidth;

    @Column(name = "vpc_case_len", columnDefinition = "number(10,3)")
    protected Integer vpcCaseLen;

    @Column(name = "vpc_case_height", columnDefinition = "number(10,3)")
    protected Integer vpcCaseHeight;

    @Column(name = "vpc_case_cube", columnDefinition = "number(10,3)")
    protected Integer vpcCaseCube;

    @Column(name = "vpc_case_dim_uom", columnDefinition = "nchar(6)")
    protected String vpcCaseDimUom;

    @Column(name = "vpc_pallet_hi", columnDefinition = "number(3)")
    protected Integer vpcPalletHi;

    @Column(name = "vpc_pallet_tier", columnDefinition = "number(10,2)")
    protected Integer vpcPalletTier;

    @Column(name = "pack_by_no_days", columnDefinition = "number(6)")
    protected Integer packByNoDays;

    @Column(name = "rcv_by_no_days", columnDefinition = "number(6)")
    protected Integer rcvByNoDays;

    @Column(name = "sell_by_no_days", columnDefinition = "number(6)")
    protected Integer sellByNoDays;

    @Column(name = "vpc_cp_dsd", columnDefinition = "Char(1)")
    protected String vpcCpDsd;

    @Column(name = "vpc_primary_flag", columnDefinition = "Char(1)")
    protected String vpcPrimaryFlag;

    @Column(name = "vpc_active_flag", columnDefinition = "Char(1)")
    protected String vpcActiveFlag;

    @Column(name = "sll_units_per_inner", columnDefinition = "number(11, 4)")
    protected Integer sllUnitsPerInner;

    @Column(name = "case_cube_uom", columnDefinition = "nchar(6)")
    protected String caseCubeUom;

    @Column(name = "associated_prd_upc", columnDefinition = "number(18)")
    protected Integer associatedPrdUpc;

    @Column(name = "vpc_cube_ord_fct", columnDefinition = "number(11,4)")
    protected Integer vpcCubeOrdFct;

    @Column(name = "vpc_buy_multiple", columnDefinition = "number(11,4)")
    protected Integer vpcBuyMultiple;

    @Column(name = "nombre_archivo", columnDefinition = "varchar2(50)")
    private String nombreArchivo;

    @Column(name = "fecha_stage", columnDefinition = "date")
    private Date fechaStage;

    @Column(name = "fecha_permanente", columnDefinition = "date")
    private Date fechaPermanente;

    @Column(name = "fecha_backup", columnDefinition = "date")
    private Date fechaBackup;

    @Id
    @Column(name = "id_java", columnDefinition = "number(14)")
    private Long idJava;


    public bbookSdivpccsi() {
        super();
        // TODO Auto-generated constructor stub
    }


    public bbookSdivpccsi(Long batchNum, Integer techKey, String tranType, String prdLvlNumber, String casePackId,
                          String vendorNumber, Double vpcPrdCost, Integer vpcCaseQty, Integer vpcCaseStdPack, Date vpcCstStart,
                          Date vpcCstEnd, String casePackDesc, String dateCreated, Date downloadDate1, Date downloadDate2,
                          String prdSllUom, String currCode, Integer subsAccepted, String vpcCaseQtyUom, Integer numberOfInners,
                          Integer invUnitsPerInner, String inv_uom, Integer eachesPerInner, String gradeCode, Integer vpcCaseGrossWgt,
                          Integer vpcCaseWgt, String vpcCaseWgtUom, Integer vpcPrdStatus, Integer vpcCaseWidth, Integer vpcCaseLen,
                          Integer vpcCaseHeight, Integer vpcCaseCube, String vpcCaseDimUom, Integer vpcPalletHi,
                          Integer vpcPalletTier, Integer packByNoDays, Integer rcvByNoDays, Integer sellByNoDays, String vpcCpDsd,
                          String vpcPrimaryFlag, String vpcActiveFlag, Integer sllUnitsPerInner, String caseCubeUom,
                          Integer associatedPrdUpc, Integer vpcCubeOrdFct, Integer vpcBuyMultiple, String nombreArchivo,
                          Date fechaStage, Date fechaPermanente, Date fechaBackup, Long idJava) {
        super();
        this.batchNum = batchNum;
        this.techKey = techKey;
        this.tranType = tranType;
        this.prdLvlNumber = prdLvlNumber;
        this.casePackId = casePackId;
        this.vendorNumber = vendorNumber;
        this.vpcPrdCost = vpcPrdCost;
        this.vpcCaseQty = vpcCaseQty;
        this.vpcCaseStdPack = vpcCaseStdPack;
        this.vpcCstStart = vpcCstStart;
        this.vpcCstEnd = vpcCstEnd;
        this.casePackDesc = casePackDesc;
        this.dateCreated = dateCreated;
        this.downloadDate1 = downloadDate1;
        this.downloadDate2 = downloadDate2;
        this.prdSllUom = prdSllUom;
        this.currCode = currCode;
        this.subsAccepted = subsAccepted;
        this.vpcCaseQtyUom = vpcCaseQtyUom;
        this.numberOfInners = numberOfInners;
        this.invUnitsPerInner = invUnitsPerInner;
        this.inv_uom = inv_uom;
        this.eachesPerInner = eachesPerInner;
        this.gradeCode = gradeCode;
        this.vpcCaseGrossWgt = vpcCaseGrossWgt;
        this.vpcCaseWgt = vpcCaseWgt;
        this.vpcCaseWgtUom = vpcCaseWgtUom;
        this.vpcPrdStatus = vpcPrdStatus;
        this.vpcCaseWidth = vpcCaseWidth;
        this.vpcCaseLen = vpcCaseLen;
        this.vpcCaseHeight = vpcCaseHeight;
        this.vpcCaseCube = vpcCaseCube;
        this.vpcCaseDimUom = vpcCaseDimUom;
        this.vpcPalletHi = vpcPalletHi;
        this.vpcPalletTier = vpcPalletTier;
        this.packByNoDays = packByNoDays;
        this.rcvByNoDays = rcvByNoDays;
        this.sellByNoDays = sellByNoDays;
        this.vpcCpDsd = vpcCpDsd;
        this.vpcPrimaryFlag = vpcPrimaryFlag;
        this.vpcActiveFlag = vpcActiveFlag;
        this.sllUnitsPerInner = sllUnitsPerInner;
        this.caseCubeUom = caseCubeUom;
        this.associatedPrdUpc = associatedPrdUpc;
        this.vpcCubeOrdFct = vpcCubeOrdFct;
        this.vpcBuyMultiple = vpcBuyMultiple;
        this.nombreArchivo = nombreArchivo;
        this.fechaStage = fechaStage;
        this.fechaPermanente = fechaPermanente;
        this.fechaBackup = fechaBackup;
        this.idJava = idJava;
    }


    @Override
    public String toString() {
        return "BbookSdivpccsi [batchNum=" + batchNum + ", techKey=" + techKey + ", tranType=" + tranType
                + ", prdLvlNumber=" + prdLvlNumber + ", casePackId=" + casePackId + ", vendorNumber=" + vendorNumber
                + ", vpcPrdCost=" + vpcPrdCost + ", vpcCaseQty=" + vpcCaseQty + ", vpcCaseStdPack=" + vpcCaseStdPack
                + ", vpcCstStart=" + vpcCstStart + ", vpcCstEnd=" + vpcCstEnd + ", casePackDesc=" + casePackDesc
                + ", dateCreated=" + dateCreated + ", downloadDate1=" + downloadDate1 + ", downloadDate2="
                + downloadDate2 + ", prdSllUom=" + prdSllUom + ", currCode=" + currCode + ", subsAccepted="
                + subsAccepted + ", vpcCaseQtyUom=" + vpcCaseQtyUom + ", numberOfInners=" + numberOfInners
                + ", invUnitsPerInner=" + invUnitsPerInner + ", inv_uom=" + inv_uom + ", eachesPerInner="
                + eachesPerInner + ", gradeCode=" + gradeCode + ", vpcCaseGrossWgt=" + vpcCaseGrossWgt + ", vpcCaseWgt="
                + vpcCaseWgt + ", vpcCaseWgtUom=" + vpcCaseWgtUom + ", vpcPrdStatus=" + vpcPrdStatus + ", vpcCaseWidth="
                + vpcCaseWidth + ", vpcCaseLen=" + vpcCaseLen + ", vpcCaseHeight=" + vpcCaseHeight + ", vpcCaseCube="
                + vpcCaseCube + ", vpcCaseDimUom=" + vpcCaseDimUom + ", vpcPalletHi=" + vpcPalletHi + ", vpcPalletTier="
                + vpcPalletTier + ", packByNoDays=" + packByNoDays + ", rcvByNoDays=" + rcvByNoDays + ", sellByNoDays="
                + sellByNoDays + ", vpcCpDsd=" + vpcCpDsd + ", vpcPrimaryFlag=" + vpcPrimaryFlag + ", vpcActiveFlag="
                + vpcActiveFlag + ", sllUnitsPerInner=" + sllUnitsPerInner + ", caseCubeUom=" + caseCubeUom
                + ", associatedPrdUpc=" + associatedPrdUpc + ", vpcCubeOrdFct=" + vpcCubeOrdFct + ", vpcBuyMultiple="
                + vpcBuyMultiple + ", nombreArchivo=" + nombreArchivo + ", fechaStage=" + fechaStage
                + ", fechaPermanente=" + fechaPermanente + ", fechaBackup=" + fechaBackup + ", idJava=" + idJava + "]";
    }


    public Long getBatchNum() {
        return batchNum;
    }


    public void setBatchNum(Long batchNum) {
        this.batchNum = batchNum;
    }


    public Integer getTechKey() {
        return techKey;
    }


    public void setTechKey(Integer techKey) {
        this.techKey = techKey;
    }


    public String getTranType() {
        return tranType;
    }


    public void setTranType(String tranType) {
        this.tranType = tranType;
    }


    public String getPrdLvlNumber() {
        return prdLvlNumber;
    }


    public void setPrdLvlNumber(String prdLvlNumber) {
        this.prdLvlNumber = prdLvlNumber;
    }


    public String getCasePackId() {
        return casePackId;
    }


    public void setCasePackId(String casePackId) {
        this.casePackId = casePackId;
    }


    public String getVendorNumber() {
        return vendorNumber;
    }


    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }


    public Double getVpcPrdCost() {
        return vpcPrdCost;
    }


    public void setVpcPrdCost(Double vpcPrdCost) {
        this.vpcPrdCost = vpcPrdCost;
    }


    public Integer getVpcCaseQty() {
        return vpcCaseQty;
    }


    public void setVpcCaseQty(Integer vpcCaseQty) {
        this.vpcCaseQty = vpcCaseQty;
    }


    public Integer getVpcCaseStdPack() {
        return vpcCaseStdPack;
    }


    public void setVpcCaseStdPack(Integer vpcCaseStdPack) {
        this.vpcCaseStdPack = vpcCaseStdPack;
    }


    public Date getVpcCstStart() {
        return vpcCstStart;
    }


    public void setVpcCstStart(Date vpcCstStart) {
        this.vpcCstStart = vpcCstStart;
    }


    public Date getVpcCstEnd() {
        return vpcCstEnd;
    }


    public void setVpcCstEnd(Date vpcCstEnd) {
        this.vpcCstEnd = vpcCstEnd;
    }


    public String getCasePackDesc() {
        return casePackDesc;
    }


    public void setCasePackDesc(String casePackDesc) {
        this.casePackDesc = casePackDesc;
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


    public String getPrdSllUom() {
        return prdSllUom;
    }


    public void setPrdSllUom(String prdSllUom) {
        this.prdSllUom = prdSllUom;
    }


    public String getCurrCode() {
        return currCode;
    }


    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }


    public Integer getSubsAccepted() {
        return subsAccepted;
    }


    public void setSubsAccepted(Integer subsAccepted) {
        this.subsAccepted = subsAccepted;
    }


    public String getVpcCaseQtyUom() {
        return vpcCaseQtyUom;
    }


    public void setVpcCaseQtyUom(String vpcCaseQtyUom) {
        this.vpcCaseQtyUom = vpcCaseQtyUom;
    }


    public Integer getNumberOfInners() {
        return numberOfInners;
    }


    public void setNumberOfInners(Integer numberOfInners) {
        this.numberOfInners = numberOfInners;
    }


    public Integer getInvUnitsPerInner() {
        return invUnitsPerInner;
    }


    public void setInvUnitsPerInner(Integer invUnitsPerInner) {
        this.invUnitsPerInner = invUnitsPerInner;
    }


    public String getInv_uom() {
        return inv_uom;
    }


    public void setInv_uom(String inv_uom) {
        this.inv_uom = inv_uom;
    }


    public Integer getEachesPerInner() {
        return eachesPerInner;
    }


    public void setEachesPerInner(Integer eachesPerInner) {
        this.eachesPerInner = eachesPerInner;
    }


    public String getGradeCode() {
        return gradeCode;
    }


    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }


    public Integer getVpcCaseGrossWgt() {
        return vpcCaseGrossWgt;
    }


    public void setVpcCaseGrossWgt(Integer vpcCaseGrossWgt) {
        this.vpcCaseGrossWgt = vpcCaseGrossWgt;
    }


    public Integer getVpcCaseWgt() {
        return vpcCaseWgt;
    }


    public void setVpcCaseWgt(Integer vpcCaseWgt) {
        this.vpcCaseWgt = vpcCaseWgt;
    }


    public String getVpcCaseWgtUom() {
        return vpcCaseWgtUom;
    }


    public void setVpcCaseWgtUom(String vpcCaseWgtUom) {
        this.vpcCaseWgtUom = vpcCaseWgtUom;
    }


    public Integer getVpcPrdStatus() {
        return vpcPrdStatus;
    }


    public void setVpcPrdStatus(Integer vpcPrdStatus) {
        this.vpcPrdStatus = vpcPrdStatus;
    }


    public Integer getVpcCaseWidth() {
        return vpcCaseWidth;
    }


    public void setVpcCaseWidth(Integer vpcCaseWidth) {
        this.vpcCaseWidth = vpcCaseWidth;
    }


    public Integer getVpcCaseLen() {
        return vpcCaseLen;
    }


    public void setVpcCaseLen(Integer vpcCaseLen) {
        this.vpcCaseLen = vpcCaseLen;
    }


    public Integer getVpcCaseHeight() {
        return vpcCaseHeight;
    }


    public void setVpcCaseHeight(Integer vpcCaseHeight) {
        this.vpcCaseHeight = vpcCaseHeight;
    }


    public Integer getVpcCaseCube() {
        return vpcCaseCube;
    }


    public void setVpcCaseCube(Integer vpcCaseCube) {
        this.vpcCaseCube = vpcCaseCube;
    }


    public String getVpcCaseDimUom() {
        return vpcCaseDimUom;
    }


    public void setVpcCaseDimUom(String vpcCaseDimUom) {
        this.vpcCaseDimUom = vpcCaseDimUom;
    }


    public Integer getVpcPalletHi() {
        return vpcPalletHi;
    }


    public void setVpcPalletHi(Integer vpcPalletHi) {
        this.vpcPalletHi = vpcPalletHi;
    }


    public Integer getVpcPalletTier() {
        return vpcPalletTier;
    }


    public void setVpcPalletTier(Integer vpcPalletTier) {
        this.vpcPalletTier = vpcPalletTier;
    }


    public Integer getPackByNoDays() {
        return packByNoDays;
    }


    public void setPackByNoDays(Integer packByNoDays) {
        this.packByNoDays = packByNoDays;
    }


    public Integer getRcvByNoDays() {
        return rcvByNoDays;
    }


    public void setRcvByNoDays(Integer rcvByNoDays) {
        this.rcvByNoDays = rcvByNoDays;
    }


    public Integer getSellByNoDays() {
        return sellByNoDays;
    }


    public void setSellByNoDays(Integer sellByNoDays) {
        this.sellByNoDays = sellByNoDays;
    }


    public String getVpcCpDsd() {
        return vpcCpDsd;
    }


    public void setVpcCpDsd(String vpcCpDsd) {
        this.vpcCpDsd = vpcCpDsd;
    }


    public String getVpcPrimaryFlag() {
        return vpcPrimaryFlag;
    }


    public void setVpcPrimaryFlag(String vpcPrimaryFlag) {
        this.vpcPrimaryFlag = vpcPrimaryFlag;
    }


    public String getVpcActiveFlag() {
        return vpcActiveFlag;
    }


    public void setVpcActiveFlag(String vpcActiveFlag) {
        this.vpcActiveFlag = vpcActiveFlag;
    }


    public Integer getSllUnitsPerInner() {
        return sllUnitsPerInner;
    }


    public void setSllUnitsPerInner(Integer sllUnitsPerInner) {
        this.sllUnitsPerInner = sllUnitsPerInner;
    }


    public String getCaseCubeUom() {
        return caseCubeUom;
    }


    public void setCaseCubeUom(String caseCubeUom) {
        this.caseCubeUom = caseCubeUom;
    }


    public Integer getAssociatedPrdUpc() {
        return associatedPrdUpc;
    }


    public void setAssociatedPrdUpc(Integer associatedPrdUpc) {
        this.associatedPrdUpc = associatedPrdUpc;
    }


    public Integer getVpcCubeOrdFct() {
        return vpcCubeOrdFct;
    }


    public void setVpcCubeOrdFct(Integer vpcCubeOrdFct) {
        this.vpcCubeOrdFct = vpcCubeOrdFct;
    }


    public Integer getVpcBuyMultiple() {
        return vpcBuyMultiple;
    }


    public void setVpcBuyMultiple(Integer vpcBuyMultiple) {
        this.vpcBuyMultiple = vpcBuyMultiple;
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



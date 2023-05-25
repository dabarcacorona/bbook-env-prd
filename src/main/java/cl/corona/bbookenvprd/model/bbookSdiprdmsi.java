package cl.corona.bbookenvprd.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bbook_sdiprdmsi")
public class bbookSdiprdmsi {

    @Column(name="batch_num" ,columnDefinition = "number(14)")
    protected Long batchNum;

    @Column(name="prd_lvl_number" ,columnDefinition = "nchar(15)")
    protected String prdLvlNumber;

    @Column(name="prd_lvl_id" ,columnDefinition = "number(5)")
    protected Integer prdLvlId;

    @Column(name="tran_type" ,columnDefinition = "char(1)")
    protected String tranType;

    @Column(name="prd_lvl_parent" ,columnDefinition = "nchar(15)")
    protected String prdLvlParent;

    @Column(name="prd_name_full" ,columnDefinition = "nvarchar2(50)")
    protected String prdNameFull;

    @Column(name="prd_targetgm" ,columnDefinition = "number(7,3)")
    protected Integer prdTargetgm;

    @Column(name="prd_style_ind" ,columnDefinition = "char(1)")
    protected String prdStyleInd;

    @Column(name="prd_status" ,columnDefinition = "number(2)")
    protected Integer prdStatus;

    @Column(name="prd_inh_val" ,columnDefinition = "number(5)")
    protected Integer prdInhVal;

    @Column(name="prd_pdh_name_1" ,columnDefinition = "nchar(30)")
    protected String prdPdhName1;

    @Column(name="prd_pdd_code_1" ,columnDefinition = "nchar(6)")
    protected String prdPddCode1;

    @Column(name="prd_pdh_name_2" ,columnDefinition = "nchar(30)")
    protected String prdPdhName2;

    @Column(name="prd_pdd_code_2" ,columnDefinition = "nchar(6)")
    protected String prdPddCode2;

    @Column(name="prd_pdh_name_3" ,columnDefinition = "nchar(30)")
    protected String prdPdhName3;

    @Column(name="prd_pdd_code_3" ,columnDefinition = "nchar(6)")
    protected String prdPddCode3;

    @Column(name="date_created" ,columnDefinition = "varchar2(8)")
    protected String dateCreated;

    @Column(name="download_date_1" ,columnDefinition = "date")
    protected Date downloadDate1;

    @Column(name="download_date_2" ,columnDefinition = "date")
    protected Date downloadDate2;

    @Column(name="prd_uom_size" ,columnDefinition = "number(13,7)")
    protected Integer prdUomSize;

    @Column(name="prd_sll_uom" ,columnDefinition = "nchar(6)")
    protected String prdSllUom;

    @Column(name="prd_comp_uom" ,columnDefinition = "nchar(6)")
    protected String prdCompUom;

    @Column(name="prd_conv_qty" ,columnDefinition = "number(13,7)")
    protected Integer prdConvQty;

    @Column(name="error_code" ,columnDefinition = "number(3)")
    protected Integer errorCode;

    @Column(name="prd_cross_dock" ,columnDefinition = "char(1)")
    protected String prdCrossDock;

    @Column(name="imp_dss_flag" ,columnDefinition = "char(1)")
    protected String impDssFlag;

    @Column(name="vendor_number" ,columnDefinition = "nchar(15)")
    protected String vendorNumber;

    @Column(name="alt_sll_uom_1" ,columnDefinition = "nchar(6)")
    protected String altSllUom1;

    @Column(name="alt_sll_uom_2" ,columnDefinition = "nchar(6)")
    protected String altSllUom2;

    @Column(name="var_weight_item" ,columnDefinition = "char(1)")
    protected String varWeightItem;

    @Column(name="var_weight_type" ,columnDefinition = "char(1)")
    protected String varWeightType;

    @Column(name="prd_sku_type" ,columnDefinition = "nchar(3)")
    protected String prdSkuType;

    @Column(name="prd_shrink_rate" ,columnDefinition = "number(4,2)")
    protected Integer prdShrinkRate;

    @Column(name="prd_waste_code" ,columnDefinition = "nchar(6)")
    protected String prdWasteCode;

    @Column(name="sll_uom_1_rate" ,columnDefinition = "number(20,10)")
    protected Integer sllUom1Rate;

    @Column(name="sll_uom_2_rate" ,columnDefinition = "number(20,10)")
    protected Integer sllUom2Rate;

    @Column(name="prd_size_uom" ,columnDefinition = "nchar(6)")
    protected String prdSizeUom;

    @Column(name="mandatory_plu" ,columnDefinition = "nchar(1)")
    protected String mandatoryPlu;

    @Column(name="mandatory_prd_gtin" ,columnDefinition = "nchar(1)")
    protected String mandatoryPrdGtin;

    @Column(name="mandatory_cp_gtin" ,columnDefinition = "nchar(1)")
    protected String mandatoryCpGtin;

    @Column(name="prc_link_id" ,columnDefinition = "nchar(15)")
    protected String prcLinkId;

    @Column(name="unit_height" ,columnDefinition = "number(7,3)")
    protected Integer unitHeight;

    @Column(name="unit_width" ,columnDefinition = "number(7,3)")
    protected Integer unitWidth;

    @Column(name="unit_depth" ,columnDefinition = "number(7,3)")
    protected Integer unitDepth;

    @Column(name="fill_color" ,columnDefinition = "nchar(6)")
    protected String fillColor;

    @Column(name="package_type" ,columnDefinition = "nchar(3)")
    protected String packageType;

    @Column(name="manufacturer" ,columnDefinition = "nchar(32)")
    protected String manufacturer;

    @Column(name="package_size" ,columnDefinition = "number(5,2)")
    protected Integer packageSize;

    @Column(name="unit_of_measure" ,columnDefinition = "nchar(3)")
    protected String unitOfMeasure;

    @Column(name="tray_quantity" ,columnDefinition = "number(4)")
    protected Integer trayQuantity;

    @Column(name="tray_height" ,columnDefinition = "number(7,3)")
    protected Integer trayHeight;

    @Column(name="tray_width" ,columnDefinition = "number(7,3)")
    protected Integer trayWidth;

    @Column(name="tray_depth" ,columnDefinition = "number(7,3)")
    protected Integer trayDepth;

    @Column(name="case_quantity" ,columnDefinition = "number(4)")
    protected Integer caseQuantity;

    @Column(name="case_height" ,columnDefinition = "number(7,3)")
    protected Integer caseHeight;

    @Column(name="case_width" ,columnDefinition = "number(7,3)")
    protected Integer caseWidth;

    @Column(name="case_depth" ,columnDefinition = "number(7,4)")
    protected Integer caseDepth;

    @Column(name="matching_key_value" ,columnDefinition = "nchar(30)")
    protected String matchingKeyValue;

    @Column(name="cont_type" ,columnDefinition = "nchar(6)")
    protected String contType;

    @Column(name="cont_mult" ,columnDefinition = "nchar(5)")
    protected String contMult;

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


    public bbookSdiprdmsi() {
        super();
        // TODO Auto-generated constructor stub
    }


    public bbookSdiprdmsi(Long batchNum, String prdLvlNumber, Integer prdLvlId, String tranType, String prdLvlParent,
                          String prdNameFull, Integer prdTargetgm, String prdStyleInd, Integer prdStatus, Integer prdInhVal,
                          String prdPdhName1, String prdPddCode1, String prdPdhName2, String prdPddCode2, String prdPdhName3,
                          String prdPddCode3, String dateCreated, Date downloadDate1, Date downloadDate2, Integer prdUomSize,
                          String prdSllUom, String prdCompUom, Integer prdConvQty, Integer errorCode, String prdCrossDock,
                          String impDssFlag, String vendorNumber, String altSllUom1, String altSllUom2, String varWeightItem,
                          String varWeightType, String prdSkuType, Integer prdShrinkRate, String prdWasteCode, Integer sllUom1Rate,
                          Integer sllUom2Rate, String prdSizeUom, String mandatoryPlu, String mandatoryPrdGtin,
                          String mandatoryCpGtin, String prcLinkId, Integer unitHeight, Integer unitWidth, Integer unitDepth,
                          String fillColor, String packageType, String manufacturer, Integer packageSize, String unitOfMeasure,
                          Integer trayQuantity, Integer trayHeight, Integer trayWidth, Integer trayDepth, Integer caseQuantity,
                          Integer caseHeight, Integer caseWidth, Integer caseDepth, String matchingKeyValue, String contType,
                          String contMult, String prdRef, String nombreArchivo, Date fechaStage, Date fechaPermanente,
                          Date fechaBackup, Long idJava) {
        super();
        this.batchNum = batchNum;
        this.prdLvlNumber = prdLvlNumber;
        this.prdLvlId = prdLvlId;
        this.tranType = tranType;
        this.prdLvlParent = prdLvlParent;
        this.prdNameFull = prdNameFull;
        this.prdTargetgm = prdTargetgm;
        this.prdStyleInd = prdStyleInd;
        this.prdStatus = prdStatus;
        this.prdInhVal = prdInhVal;
        this.prdPdhName1 = prdPdhName1;
        this.prdPddCode1 = prdPddCode1;
        this.prdPdhName2 = prdPdhName2;
        this.prdPddCode2 = prdPddCode2;
        this.prdPdhName3 = prdPdhName3;
        this.prdPddCode3 = prdPddCode3;
        this.dateCreated = dateCreated;
        this.downloadDate1 = downloadDate1;
        this.downloadDate2 = downloadDate2;
        this.prdUomSize = prdUomSize;
        this.prdSllUom = prdSllUom;
        this.prdCompUom = prdCompUom;
        this.prdConvQty = prdConvQty;
        this.errorCode = errorCode;
        this.prdCrossDock = prdCrossDock;
        this.impDssFlag = impDssFlag;
        this.vendorNumber = vendorNumber;
        this.altSllUom1 = altSllUom1;
        this.altSllUom2 = altSllUom2;
        this.varWeightItem = varWeightItem;
        this.varWeightType = varWeightType;
        this.prdSkuType = prdSkuType;
        this.prdShrinkRate = prdShrinkRate;
        this.prdWasteCode = prdWasteCode;
        this.sllUom1Rate = sllUom1Rate;
        this.sllUom2Rate = sllUom2Rate;
        this.prdSizeUom = prdSizeUom;
        this.mandatoryPlu = mandatoryPlu;
        this.mandatoryPrdGtin = mandatoryPrdGtin;
        this.mandatoryCpGtin = mandatoryCpGtin;
        this.prcLinkId = prcLinkId;
        this.unitHeight = unitHeight;
        this.unitWidth = unitWidth;
        this.unitDepth = unitDepth;
        this.fillColor = fillColor;
        this.packageType = packageType;
        this.manufacturer = manufacturer;
        this.packageSize = packageSize;
        this.unitOfMeasure = unitOfMeasure;
        this.trayQuantity = trayQuantity;
        this.trayHeight = trayHeight;
        this.trayWidth = trayWidth;
        this.trayDepth = trayDepth;
        this.caseQuantity = caseQuantity;
        this.caseHeight = caseHeight;
        this.caseWidth = caseWidth;
        this.caseDepth = caseDepth;
        this.matchingKeyValue = matchingKeyValue;
        this.contType = contType;
        this.contMult = contMult;
        this.prdRef = prdRef;
        this.nombreArchivo = nombreArchivo;
        this.fechaStage = fechaStage;
        this.fechaPermanente = fechaPermanente;
        this.fechaBackup = fechaBackup;
        this.idJava = idJava;
    }


    @Override
    public String toString() {
        return "BbookSdiprdmsi [batchNum=" + batchNum + ", prdLvlNumber=" + prdLvlNumber + ", prdLvlId=" + prdLvlId
                + ", tranType=" + tranType + ", prdLvlParent=" + prdLvlParent + ", prdNameFull=" + prdNameFull
                + ", prdTargetgm=" + prdTargetgm + ", prdStyleInd=" + prdStyleInd + ", prdStatus=" + prdStatus
                + ", prdInhVal=" + prdInhVal + ", prdPdhName1=" + prdPdhName1 + ", prdPddCode1=" + prdPddCode1
                + ", prdPdhName2=" + prdPdhName2 + ", prdPddCode2=" + prdPddCode2 + ", prdPdhName3=" + prdPdhName3
                + ", prdPddCode3=" + prdPddCode3 + ", dateCreated=" + dateCreated + ", downloadDate1=" + downloadDate1
                + ", downloadDate2=" + downloadDate2 + ", prdUomSize=" + prdUomSize + ", prdSllUom=" + prdSllUom
                + ", prdCompUom=" + prdCompUom + ", prdConvQty=" + prdConvQty + ", errorCode=" + errorCode
                + ", prdCrossDock=" + prdCrossDock + ", impDssFlag=" + impDssFlag + ", vendorNumber=" + vendorNumber
                + ", altSllUom1=" + altSllUom1 + ", altSllUom2=" + altSllUom2 + ", varWeightItem=" + varWeightItem
                + ", varWeightType=" + varWeightType + ", prdSkuType=" + prdSkuType + ", prdShrinkRate=" + prdShrinkRate
                + ", prdWasteCode=" + prdWasteCode + ", sllUom1Rate=" + sllUom1Rate + ", sllUom2Rate=" + sllUom2Rate
                + ", prdSizeUom=" + prdSizeUom + ", mandatoryPlu=" + mandatoryPlu + ", mandatoryPrdGtin="
                + mandatoryPrdGtin + ", mandatoryCpGtin=" + mandatoryCpGtin + ", prcLinkId=" + prcLinkId
                + ", unitHeight=" + unitHeight + ", unitWidth=" + unitWidth + ", unitDepth=" + unitDepth
                + ", fillColor=" + fillColor + ", packageType=" + packageType + ", manufacturer=" + manufacturer
                + ", packageSize=" + packageSize + ", unitOfMeasure=" + unitOfMeasure + ", trayQuantity=" + trayQuantity
                + ", trayHeight=" + trayHeight + ", trayWidth=" + trayWidth + ", trayDepth=" + trayDepth
                + ", caseQuantity=" + caseQuantity + ", caseHeight=" + caseHeight + ", caseWidth=" + caseWidth
                + ", caseDepth=" + caseDepth + ", matchingKeyValue=" + matchingKeyValue + ", contType=" + contType
                + ", contMult=" + contMult + ", prdRef=" + prdRef + ", nombreArchivo=" + nombreArchivo + ", fechaStage="
                + fechaStage + ", fechaPermanente=" + fechaPermanente + ", fechaBackup=" + fechaBackup + ", idJava="
                + idJava + "]";
    }


    public Long getBatchNum() {
        return batchNum;
    }


    public void setBatchNum(Long batchNum) {
        this.batchNum = batchNum;
    }


    public String getPrdLvlNumber() {
        return prdLvlNumber;
    }


    public void setPrdLvlNumber(String prdLvlNumber) {
        this.prdLvlNumber = prdLvlNumber;
    }


    public Integer getPrdLvlId() {
        return prdLvlId;
    }


    public void setPrdLvlId(Integer prdLvlId) {
        this.prdLvlId = prdLvlId;
    }


    public String getTranType() {
        return tranType;
    }


    public void setTranType(String tranType) {
        this.tranType = tranType;
    }


    public String getPrdLvlParent() {
        return prdLvlParent;
    }


    public void setPrdLvlParent(String prdLvlParent) {
        this.prdLvlParent = prdLvlParent;
    }


    public String getPrdNameFull() {
        return prdNameFull;
    }


    public void setPrdNameFull(String prdNameFull) {
        this.prdNameFull = prdNameFull;
    }


    public Integer getPrdTargetgm() {
        return prdTargetgm;
    }


    public void setPrdTargetgm(Integer prdTargetgm) {
        this.prdTargetgm = prdTargetgm;
    }


    public String getPrdStyleInd() {
        return prdStyleInd;
    }


    public void setPrdStyleInd(String prdStyleInd) {
        this.prdStyleInd = prdStyleInd;
    }


    public Integer getPrdStatus() {
        return prdStatus;
    }


    public void setPrdStatus(Integer prdStatus) {
        this.prdStatus = prdStatus;
    }


    public Integer getPrdInhVal() {
        return prdInhVal;
    }


    public void setPrdInhVal(Integer prdInhVal) {
        this.prdInhVal = prdInhVal;
    }


    public String getPrdPdhName1() {
        return prdPdhName1;
    }


    public void setPrdPdhName1(String prdPdhName1) {
        this.prdPdhName1 = prdPdhName1;
    }


    public String getPrdPddCode1() {
        return prdPddCode1;
    }


    public void setPrdPddCode1(String prdPddCode1) {
        this.prdPddCode1 = prdPddCode1;
    }


    public String getPrdPdhName2() {
        return prdPdhName2;
    }


    public void setPrdPdhName2(String prdPdhName2) {
        this.prdPdhName2 = prdPdhName2;
    }


    public String getPrdPddCode2() {
        return prdPddCode2;
    }


    public void setPrdPddCode2(String prdPddCode2) {
        this.prdPddCode2 = prdPddCode2;
    }


    public String getPrdPdhName3() {
        return prdPdhName3;
    }


    public void setPrdPdhName3(String prdPdhName3) {
        this.prdPdhName3 = prdPdhName3;
    }


    public String getPrdPddCode3() {
        return prdPddCode3;
    }


    public void setPrdPddCode3(String prdPddCode3) {
        this.prdPddCode3 = prdPddCode3;
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


    public Integer getPrdUomSize() {
        return prdUomSize;
    }


    public void setPrdUomSize(Integer prdUomSize) {
        this.prdUomSize = prdUomSize;
    }


    public String getPrdSllUom() {
        return prdSllUom;
    }


    public void setPrdSllUom(String prdSllUom) {
        this.prdSllUom = prdSllUom;
    }


    public String getPrdCompUom() {
        return prdCompUom;
    }


    public void setPrdCompUom(String prdCompUom) {
        this.prdCompUom = prdCompUom;
    }


    public Integer getPrdConvQty() {
        return prdConvQty;
    }


    public void setPrdConvQty(Integer prdConvQty) {
        this.prdConvQty = prdConvQty;
    }


    public Integer getErrorCode() {
        return errorCode;
    }


    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }


    public String getPrdCrossDock() {
        return prdCrossDock;
    }


    public void setPrdCrossDock(String prdCrossDock) {
        this.prdCrossDock = prdCrossDock;
    }


    public String getImpDssFlag() {
        return impDssFlag;
    }


    public void setImpDssFlag(String impDssFlag) {
        this.impDssFlag = impDssFlag;
    }


    public String getVendorNumber() {
        return vendorNumber;
    }


    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }


    public String getAltSllUom1() {
        return altSllUom1;
    }


    public void setAltSllUom1(String altSllUom1) {
        this.altSllUom1 = altSllUom1;
    }


    public String getAltSllUom2() {
        return altSllUom2;
    }


    public void setAltSllUom2(String altSllUom2) {
        this.altSllUom2 = altSllUom2;
    }


    public String getVarWeightItem() {
        return varWeightItem;
    }


    public void setVarWeightItem(String varWeightItem) {
        this.varWeightItem = varWeightItem;
    }


    public String getVarWeightType() {
        return varWeightType;
    }


    public void setVarWeightType(String varWeightType) {
        this.varWeightType = varWeightType;
    }


    public String getPrdSkuType() {
        return prdSkuType;
    }


    public void setPrdSkuType(String prdSkuType) {
        this.prdSkuType = prdSkuType;
    }


    public Integer getPrdShrinkRate() {
        return prdShrinkRate;
    }


    public void setPrdShrinkRate(Integer prdShrinkRate) {
        this.prdShrinkRate = prdShrinkRate;
    }


    public String getPrdWasteCode() {
        return prdWasteCode;
    }


    public void setPrdWasteCode(String prdWasteCode) {
        this.prdWasteCode = prdWasteCode;
    }


    public Integer getSllUom1Rate() {
        return sllUom1Rate;
    }


    public void setSllUom1Rate(Integer sllUom1Rate) {
        this.sllUom1Rate = sllUom1Rate;
    }


    public Integer getSllUom2Rate() {
        return sllUom2Rate;
    }


    public void setSllUom2Rate(Integer sllUom2Rate) {
        this.sllUom2Rate = sllUom2Rate;
    }


    public String getPrdSizeUom() {
        return prdSizeUom;
    }


    public void setPrdSizeUom(String prdSizeUom) {
        this.prdSizeUom = prdSizeUom;
    }


    public String getMandatoryPlu() {
        return mandatoryPlu;
    }


    public void setMandatoryPlu(String mandatoryPlu) {
        this.mandatoryPlu = mandatoryPlu;
    }


    public String getMandatoryPrdGtin() {
        return mandatoryPrdGtin;
    }


    public void setMandatoryPrdGtin(String mandatoryPrdGtin) {
        this.mandatoryPrdGtin = mandatoryPrdGtin;
    }


    public String getMandatoryCpGtin() {
        return mandatoryCpGtin;
    }


    public void setMandatoryCpGtin(String mandatoryCpGtin) {
        this.mandatoryCpGtin = mandatoryCpGtin;
    }


    public String getPrcLinkId() {
        return prcLinkId;
    }


    public void setPrcLinkId(String prcLinkId) {
        this.prcLinkId = prcLinkId;
    }


    public Integer getUnitHeight() {
        return unitHeight;
    }


    public void setUnitHeight(Integer unitHeight) {
        this.unitHeight = unitHeight;
    }


    public Integer getUnitWidth() {
        return unitWidth;
    }


    public void setUnitWidth(Integer unitWidth) {
        this.unitWidth = unitWidth;
    }


    public Integer getUnitDepth() {
        return unitDepth;
    }


    public void setUnitDepth(Integer unitDepth) {
        this.unitDepth = unitDepth;
    }


    public String getFillColor() {
        return fillColor;
    }


    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }


    public String getPackageType() {
        return packageType;
    }


    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }


    public String getManufacturer() {
        return manufacturer;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public Integer getPackageSize() {
        return packageSize;
    }


    public void setPackageSize(Integer packageSize) {
        this.packageSize = packageSize;
    }


    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }


    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }


    public Integer getTrayQuantity() {
        return trayQuantity;
    }


    public void setTrayQuantity(Integer trayQuantity) {
        this.trayQuantity = trayQuantity;
    }


    public Integer getTrayHeight() {
        return trayHeight;
    }


    public void setTrayHeight(Integer trayHeight) {
        this.trayHeight = trayHeight;
    }


    public Integer getTrayWidth() {
        return trayWidth;
    }


    public void setTrayWidth(Integer trayWidth) {
        this.trayWidth = trayWidth;
    }


    public Integer getTrayDepth() {
        return trayDepth;
    }


    public void setTrayDepth(Integer trayDepth) {
        this.trayDepth = trayDepth;
    }


    public Integer getCaseQuantity() {
        return caseQuantity;
    }


    public void setCaseQuantity(Integer caseQuantity) {
        this.caseQuantity = caseQuantity;
    }


    public Integer getCaseHeight() {
        return caseHeight;
    }


    public void setCaseHeight(Integer caseHeight) {
        this.caseHeight = caseHeight;
    }


    public Integer getCaseWidth() {
        return caseWidth;
    }


    public void setCaseWidth(Integer caseWidth) {
        this.caseWidth = caseWidth;
    }


    public Integer getCaseDepth() {
        return caseDepth;
    }


    public void setCaseDepth(Integer caseDepth) {
        this.caseDepth = caseDepth;
    }


    public String getMatchingKeyValue() {
        return matchingKeyValue;
    }


    public void setMatchingKeyValue(String matchingKeyValue) {
        this.matchingKeyValue = matchingKeyValue;
    }


    public String getContType() {
        return contType;
    }


    public void setContType(String contType) {
        this.contType = contType;
    }


    public String getContMult() {
        return contMult;
    }


    public void setContMult(String contMult) {
        this.contMult = contMult;
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

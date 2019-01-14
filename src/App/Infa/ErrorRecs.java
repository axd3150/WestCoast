package App.Infa;

public class ErrorRecs {
    String  Shipment, BillofLading, RcvFrom, VendorName, VendorAddr1, VendorCity, VendorState,
            VendorZip, VendorTele, ShipDate, ShipPriority,
            CaseId, CaseCo, CaseDiv, CaseSku, CaseShippedQty, StdCaseQty, CaseManuDate, CaseShipment,
            CaseVendorAsn, CasePO, CaseVendor, CaseStore, CaseReqAllocNbr, CaseDateCreated, CaseTimeCreated,
            CaseDateModified, CaseTimeModified,ErrorMsg;

    int CaseShipped, UnitsShipped;

    public ErrorRecs(String shipment, String billofLading, String rcvFrom, String vendorName, String vendorAddr1, String vendorCity, String vendorState, String vendorZip, String vendorTele, String shipDate, String shipPriority, String caseId, String caseCo, String caseDiv, String caseSku, String caseShippedQty, String stdCaseQty, String caseManuDate, String caseShipment, String caseVendorAsn, String casePO, String caseVendor, String caseStore, String caseReqAllocNbr, String caseDateCreated, String caseTimeCreated, String caseDateModified, String caseTimeModified, String errorMsg, int caseShipped, int unitsShipped) {
        Shipment = shipment;
        BillofLading = billofLading;
        RcvFrom = rcvFrom;
        VendorName = vendorName;
        VendorAddr1 = vendorAddr1;
        VendorCity = vendorCity;
        VendorState = vendorState;
        VendorZip = vendorZip;
        VendorTele = vendorTele;
        ShipDate = shipDate;
        ShipPriority = shipPriority;
        CaseId = caseId;
        CaseCo = caseCo;
        CaseDiv = caseDiv;
        CaseSku = caseSku;
        CaseShippedQty = caseShippedQty;
        StdCaseQty = stdCaseQty;
        CaseManuDate = caseManuDate;
        CaseShipment = caseShipment;
        CaseVendorAsn = caseVendorAsn;
        CasePO = casePO;
        CaseVendor = caseVendor;
        CaseStore = caseStore;
        CaseReqAllocNbr = caseReqAllocNbr;
        CaseDateCreated = caseDateCreated;
        CaseTimeCreated = caseTimeCreated;
        CaseDateModified = caseDateModified;
        CaseTimeModified = caseTimeModified;
        ErrorMsg = errorMsg;
        CaseShipped = caseShipped;
        UnitsShipped = unitsShipped;
    }

    public String getShipment() {
        return Shipment;
    }

    public void setShipment(String shipment) {
        Shipment = shipment;
    }

    public String getBillofLading() {
        return BillofLading;
    }

    public void setBillofLading(String billofLading) {
        BillofLading = billofLading;
    }

    public String getRcvFrom() {
        return RcvFrom;
    }

    public void setRcvFrom(String rcvFrom) {
        RcvFrom = rcvFrom;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddr1() {
        return VendorAddr1;
    }

    public void setVendorAddr1(String vendorAddr1) {
        VendorAddr1 = vendorAddr1;
    }

    public String getVendorCity() {
        return VendorCity;
    }

    public void setVendorCity(String vendorCity) {
        VendorCity = vendorCity;
    }

    public String getVendorState() {
        return VendorState;
    }

    public void setVendorState(String vendorState) {
        VendorState = vendorState;
    }

    public String getVendorZip() {
        return VendorZip;
    }

    public void setVendorZip(String vendorZip) {
        VendorZip = vendorZip;
    }

    public String getVendorTele() {
        return VendorTele;
    }

    public void setVendorTele(String vendorTele) {
        VendorTele = vendorTele;
    }

    public String getShipDate() {
        return ShipDate;
    }

    public void setShipDate(String shipDate) {
        ShipDate = shipDate;
    }

    public String getShipPriority() {
        return ShipPriority;
    }

    public void setShipPriority(String shipPriority) {
        ShipPriority = shipPriority;
    }

    public String getCaseId() {
        return CaseId;
    }

    public void setCaseId(String caseId) {
        CaseId = caseId;
    }

    public String getCaseCo() {
        return CaseCo;
    }

    public void setCaseCo(String caseCo) {
        CaseCo = caseCo;
    }

    public String getCaseDiv() {
        return CaseDiv;
    }

    public void setCaseDiv(String caseDiv) {
        CaseDiv = caseDiv;
    }

    public String getCaseSku() {
        return CaseSku;
    }

    public void setCaseSku(String caseSku) {
        CaseSku = caseSku;
    }

    public String getCaseShippedQty() {
        return CaseShippedQty;
    }

    public void setCaseShippedQty(String caseShippedQty) {
        CaseShippedQty = caseShippedQty;
    }

    public String getStdCaseQty() {
        return StdCaseQty;
    }

    public void setStdCaseQty(String stdCaseQty) {
        StdCaseQty = stdCaseQty;
    }

    public String getCaseManuDate() {
        return CaseManuDate;
    }

    public void setCaseManuDate(String caseManuDate) {
        CaseManuDate = caseManuDate;
    }

    public String getCaseShipment() {
        return CaseShipment;
    }

    public void setCaseShipment(String caseShipment) {
        CaseShipment = caseShipment;
    }

    public String getCaseVendorAsn() {
        return CaseVendorAsn;
    }

    public void setCaseVendorAsn(String caseVendorAsn) {
        CaseVendorAsn = caseVendorAsn;
    }

    public String getCasePO() {
        return CasePO;
    }

    public void setCasePO(String casePO) {
        CasePO = casePO;
    }

    public String getCaseVendor() {
        return CaseVendor;
    }

    public void setCaseVendor(String caseVendor) {
        CaseVendor = caseVendor;
    }

    public String getCaseStore() {
        return CaseStore;
    }

    public void setCaseStore(String caseStore) {
        CaseStore = caseStore;
    }

    public String getCaseReqAllocNbr() {
        return CaseReqAllocNbr;
    }

    public void setCaseReqAllocNbr(String caseReqAllocNbr) {
        CaseReqAllocNbr = caseReqAllocNbr;
    }

    public String getCaseDateCreated() {
        return CaseDateCreated;
    }

    public void setCaseDateCreated(String caseDateCreated) {
        CaseDateCreated = caseDateCreated;
    }

    public String getCaseTimeCreated() {
        return CaseTimeCreated;
    }

    public void setCaseTimeCreated(String caseTimeCreated) {
        CaseTimeCreated = caseTimeCreated;
    }

    public String getCaseDateModified() {
        return CaseDateModified;
    }

    public void setCaseDateModified(String caseDateModified) {
        CaseDateModified = caseDateModified;
    }

    public String getCaseTimeModified() {
        return CaseTimeModified;
    }

    public void setCaseTimeModified(String caseTimeModified) {
        CaseTimeModified = caseTimeModified;
    }

    public int getCaseShipped() {
        return CaseShipped;
    }

    public void setCaseShipped(int caseShipped) {
        CaseShipped = caseShipped;
    }

    public int getUnitsShipped() {
        return UnitsShipped;
    }

    public void setUnitsShipped(int unitsShipped) {
        UnitsShipped = unitsShipped;
    }

    public String getErrorMsg() {
        return ErrorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        ErrorMsg = errorMsg;
    }
}


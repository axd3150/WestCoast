package App.Infa;

public class ShipRecs {
    String Shipment, BillofLading, RcvFrom, VendorName, VendorAddr1, VendorCity, VendorState,
    VendorZip, VendorTele, ShipDate, ShipPriority;

    int CaseShipped, UnitsShipped;

    public ShipRecs(String shipment, String billofLading, String rcvFrom, String vendorName, String vendorAddr1, String vendorCity, String vendorState, String vendorZip, String vendorTele, String shipDate, String shipPriority, int caseShipped, int unitsShipped) {
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
}

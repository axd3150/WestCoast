package App.Infa;

public class AllocRecs {
    String DistroNbr, DistroStore,DistroSku, DistrReqQty, DistrQtyRem, DistrFulfilQty, DistrShipment, DistrBatch,
    DistrProcDate, DistrProcTime;

    public AllocRecs(String distroNbr, String distroStore, String distroSku, String distrReqQty, String distrQtyRem, String distrFulfilQty, String distrShipment, String distrBatch, String distrProcDate, String distrProcTime) {
        DistroNbr = distroNbr;
        DistroStore = distroStore;
        DistroSku = distroSku;
        DistrReqQty = distrReqQty;
        DistrQtyRem = distrQtyRem;
        DistrFulfilQty = distrFulfilQty;
        DistrShipment = distrShipment;
        DistrBatch = distrBatch;
        DistrProcDate = distrProcDate;
        DistrProcTime = distrProcTime;
    }

    public String getDistroNbr() {
        return DistroNbr;
    }

    public void setDistroNbr(String distroNbr) {
        DistroNbr = distroNbr;
    }

    public String getDistroStore() {
        return DistroStore;
    }

    public void setDistroStore(String distroStore) {
        DistroStore = distroStore;
    }

    public String getDistroSku() {
        return DistroSku;
    }

    public void setDistroSku(String distroSku) {
        DistroSku = distroSku;
    }

    public String getDistrReqQty() {
        return DistrReqQty;
    }

    public void setDistrReqQty(String distrReqQty) {
        DistrReqQty = distrReqQty;
    }

    public String getDistrQtyRem() {
        return DistrQtyRem;
    }

    public void setDistrQtyRem(String distrQtyRem) {
        DistrQtyRem = distrQtyRem;
    }

    public String getDistrFulfilQty() {
        return DistrFulfilQty;
    }

    public void setDistrFulfilQty(String distrFulfilQty) {
        DistrFulfilQty = distrFulfilQty;
    }

    public String getDistrShipment() {
        return DistrShipment;
    }

    public void setDistrShipment(String distrShipment) {
        DistrShipment = distrShipment;
    }

    public String getDistrBatch() {
        return DistrBatch;
    }

    public void setDistrBatch(String distrBatch) {
        DistrBatch = distrBatch;
    }

    public String getDistrProcDate() {
        return DistrProcDate;
    }

    public void setDistrProcDate(String distrProcDate) {
        DistrProcDate = distrProcDate;
    }

    public String getDistrProcTime() {
        return DistrProcTime;
    }

    public void setDistrProcTime(String distrProcTime) {
        DistrProcTime = distrProcTime;
    }
}

package App.Infa;

public class ImportBridgeStructure{
    String Shipment, Po,Cube, Weight, Vendor, Carrier,
            ShipMode, PickupDate, DeliveryDate, LoadId, CreateDate, CartonCount;

    public ImportBridgeStructure(String shipment, String po, String cube, String weight, String vendor, String carrier, String shipMode, String pickupDate, String deliveryDate, String loadId, String createDate, String cartonCount) {
        Shipment = shipment;
        Po = po;
        Cube = cube;
        Weight = weight;
        Vendor = vendor;
        Carrier = carrier;
        ShipMode = shipMode;
        PickupDate = pickupDate;
        DeliveryDate = deliveryDate;
        LoadId = loadId;
        CreateDate = createDate;
        CartonCount = cartonCount;
    }

    public String getShipment() {
        return Shipment;
    }

    public void setShipment(String shipment) {
        Shipment = shipment;
    }

    public String getPo() {
        return Po;
    }

    public void setPo(String po) {
        Po = po;
    }

    public String getCube() {
        return Cube;
    }

    public void setCube(String cube) {
        Cube = cube;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public String getCarrier() {
        return Carrier;
    }

    public void setCarrier(String carrier) {
        Carrier = carrier;
    }

    public String getShipMode() {
        return ShipMode;
    }

    public void setShipMode(String shipMode) {
        ShipMode = shipMode;
    }

    public String getPickupDate() {
        return PickupDate;
    }

    public void setPickupDate(String pickupDate) {
        PickupDate = pickupDate;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    public String getLoadId() {
        return LoadId;
    }

    public void setLoadId(String loadId) {
        LoadId = loadId;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getCartonCount() {
        return CartonCount;
    }

    public void setCartonCount(String cartonCount) {
        CartonCount = cartonCount;
    }
}
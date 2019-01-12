package App.Infa;

//1-12-2019
/*
  Dev - JJ
  Purpose - Master Record for Shipment Data used in process.
 */
public class MasterShipment {
    String EDI, Ready, UsrReady,Reqby, Vendor, Addr, Addr2, City, State, Zip, Contact,
    Phone, Fax, Email, Pallet, Stack, Freight, ShipHrs, Appoint, Inst, Carrier, Container, Load, PickType,
    InvNbr, ShipNote, Trailer, Door, UsrTrailer, Status, UsrSaved, UsrFinal, revised, Duplicate, TMSShip;

    int Auth, PO, nbrCartons, CartonsWght, CartonsCube, ReqKey, TTLPallet, TTLCartons, TTLWght,
        TtlCube, TlrCSTot, TlrCasMS, TlrCSXd, TlrCSSp, TlrCSPa, TlrCSPh, TlrCSCd, TlrCSpo,
        TlrCSPf, TlrCSphs, TlrCSpas, TlrCShps, TlrCScds;

    public MasterShipment() {
    }

    public String getEDI() {
        return EDI;
    }

    public void setEDI(String EDI) {
        this.EDI = EDI;
    }

    public String getUsrReady() {
        return UsrReady;
    }

    public void setUsrReady(String usrReady) {
        UsrReady = usrReady;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String addr) {
        Addr = addr;
    }

    public String getAddr2() {
        return Addr2;
    }

    public void setAddr2(String addr2) {
        Addr2 = addr2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPallet() {
        return Pallet;
    }

    public void setPallet(String pallet) {
        Pallet = pallet;
    }

    public String getStack() {
        return Stack;
    }

    public void setStack(String stack) {
        Stack = stack;
    }

    public String getFreight() {
        return Freight;
    }

    public void setFreight(String freight) {
        Freight = freight;
    }

    public String getShipHrs() {
        return ShipHrs;
    }

    public void setShipHrs(String shipHrs) {
        ShipHrs = shipHrs;
    }

    public String getAppoint() {
        return Appoint;
    }

    public void setAppoint(String appoint) {
        Appoint = appoint;
    }

    public String getInst() {
        return Inst;
    }

    public void setInst(String inst) {
        Inst = inst;
    }

    public String getCarrier() {
        return Carrier;
    }

    public void setCarrier(String carrier) {
        Carrier = carrier;
    }

    public String getContainer() {
        return Container;
    }

    public void setContainer(String container) {
        Container = container;
    }

    public String getLoad() {
        return Load;
    }

    public void setLoad(String load) {
        Load = load;
    }

    public String getPickType() {
        return PickType;
    }

    public void setPickType(String pickType) {
        PickType = pickType;
    }

    public String getInvNbr() {
        return InvNbr;
    }

    public void setInvNbr(String invNbr) {
        InvNbr = invNbr;
    }

    public String getShipNote() {
        return ShipNote;
    }

    public void setShipNote(String shipNote) {
        ShipNote = shipNote;
    }

    public String getTrailer() {
        return Trailer;
    }

    public void setTrailer(String trailer) {
        Trailer = trailer;
    }

    public String getDoor() {
        return Door;
    }

    public void setDoor(String door) {
        Door = door;
    }

    public String getUsrTrailer() {
        return UsrTrailer;
    }

    public void setUsrTrailer(String usrTrailer) {
        UsrTrailer = usrTrailer;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getUsrSaved() {
        return UsrSaved;
    }

    public void setUsrSaved(String usrSaved) {
        UsrSaved = usrSaved;
    }

    public String getUsrFinal() {
        return UsrFinal;
    }

    public void setUsrFinal(String usrFinal) {
        UsrFinal = usrFinal;
    }

    public String getRevised() {
        return revised;
    }

    public void setRevised(String revised) {
        this.revised = revised;
    }

    public String getDuplicate() {
        return Duplicate;
    }

    public void setDuplicate(String duplicate) {
        Duplicate = duplicate;
    }

    public String getTMSShip() {
        return TMSShip;
    }

    public void setTMSShip(String TMSShip) {
        this.TMSShip = TMSShip;
    }

    public int getAuth() {
        return Auth;
    }

    public void setAuth(int auth) {
        Auth = auth;
    }

    public int getPO() {
        return PO;
    }

    public void setPO(int PO) {
        this.PO = PO;
    }

    public int getNbrCartons() {
        return nbrCartons;
    }

    public void setNbrCartons(int nbrCartons) {
        this.nbrCartons = nbrCartons;
    }

    public int getCartonsWght() {
        return CartonsWght;
    }

    public void setCartonsWght(int cartonsWght) {
        CartonsWght = cartonsWght;
    }

    public int getCartonsCube() {
        return CartonsCube;
    }

    public void setCartonsCube(int cartonsCube) {
        CartonsCube = cartonsCube;
    }

    public int getReqKey() {
        return ReqKey;
    }

    public void setReqKey(int reqKey) {
        ReqKey = reqKey;
    }

    public int getTTLPallet() {
        return TTLPallet;
    }

    public void setTTLPallet(int TTLPallet) {
        this.TTLPallet = TTLPallet;
    }

    public int getTTLCartons() {
        return TTLCartons;
    }

    public void setTTLCartons(int TTLCartons) {
        this.TTLCartons = TTLCartons;
    }

    public int getTTLWght() {
        return TTLWght;
    }

    public void setTTLWght(int TTLWght) {
        this.TTLWght = TTLWght;
    }

    public int getTtlCube() {
        return TtlCube;
    }

    public void setTtlCube(int ttlCube) {
        TtlCube = ttlCube;
    }

    public int getTlrCSTot() {
        return TlrCSTot;
    }

    public void setTlrCSTot(int tlrCSTot) {
        TlrCSTot = tlrCSTot;
    }

    public int getTlrCasMS() {
        return TlrCasMS;
    }

    public void setTlrCasMS(int tlrCasMS) {
        TlrCasMS = tlrCasMS;
    }

    public int getTlrCSXd() {
        return TlrCSXd;
    }

    public void setTlrCSXd(int tlrCSXd) {
        TlrCSXd = tlrCSXd;
    }

    public int getTlrCSSp() {
        return TlrCSSp;
    }

    public void setTlrCSSp(int tlrCSSp) {
        TlrCSSp = tlrCSSp;
    }

    public int getTlrCSPa() {
        return TlrCSPa;
    }

    public void setTlrCSPa(int tlrCSPa) {
        TlrCSPa = tlrCSPa;
    }

    public int getTlrCSPh() {
        return TlrCSPh;
    }

    public void setTlrCSPh(int tlrCSPh) {
        TlrCSPh = tlrCSPh;
    }

    public int getTlrCSCd() {
        return TlrCSCd;
    }

    public void setTlrCSCd(int tlrCSCd) {
        TlrCSCd = tlrCSCd;
    }

    public int getTlrCSpo() {
        return TlrCSpo;
    }

    public void setTlrCSpo(int tlrCSpo) {
        TlrCSpo = tlrCSpo;
    }

    public int getTlrCSPf() {
        return TlrCSPf;
    }

    public void setTlrCSPf(int tlrCSPf) {
        TlrCSPf = tlrCSPf;
    }

    public int getTlrCSphs() {
        return TlrCSphs;
    }

    public void setTlrCSphs(int tlrCSphs) {
        TlrCSphs = tlrCSphs;
    }

    public int getTlrCSpas() {
        return TlrCSpas;
    }

    public void setTlrCSpas(int tlrCSpas) {
        TlrCSpas = tlrCSpas;
    }

    public int getTlrCShps() {
        return TlrCShps;
    }

    public void setTlrCShps(int tlrCShps) {
        TlrCShps = tlrCShps;
    }

    public int getTlrCScds() {
        return TlrCScds;
    }

    public void setTlrCScds(int tlrCScds) {
        TlrCScds = tlrCScds;
    }
}

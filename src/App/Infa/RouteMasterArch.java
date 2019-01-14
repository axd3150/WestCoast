package App.Infa;

public class RouteMasterArch {
    String Location, RecType, Route, RouteLoad, RouteStore, RouteShipNbr, RouteState,
    RouteCarrierServ;

    public RouteMasterArch(String location, String recType, String route, String routeLoad, String routeStore, String routeShipNbr, String routeState, String routeCarrierServ) {
        Location = location;
        RecType = recType;
        Route = route;
        RouteLoad = routeLoad;
        RouteStore = routeStore;
        RouteShipNbr = routeShipNbr;
        RouteState = routeState;
        RouteCarrierServ = routeCarrierServ;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getRecType() {
        return RecType;
    }

    public void setRecType(String recType) {
        RecType = recType;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String route) {
        Route = route;
    }

    public String getRouteLoad() {
        return RouteLoad;
    }

    public void setRouteLoad(String routeLoad) {
        RouteLoad = routeLoad;
    }

    public String getRouteStore() {
        return RouteStore;
    }

    public void setRouteStore(String routeStore) {
        RouteStore = routeStore;
    }

    public String getRouteShipNbr() {
        return RouteShipNbr;
    }

    public void setRouteShipNbr(String routeShipNbr) {
        RouteShipNbr = routeShipNbr;
    }

    public String getRouteState() {
        return RouteState;
    }

    public void setRouteState(String routeState) {
        RouteState = routeState;
    }

    public String getRouteCarrierServ() {
        return RouteCarrierServ;
    }

    public void setRouteCarrierServ(String routeCarrierServ) {
        RouteCarrierServ = routeCarrierServ;
    }
}

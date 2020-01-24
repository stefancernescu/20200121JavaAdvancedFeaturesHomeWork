package warehouse.model;

import warehouse.controller.WarehouseImpl;

//Camara/Debara
public class Pentry extends WarehouseImpl{
    //Camara are borcane
    private WarehouseImpl pentryWarehouse;
    private String jamType;//tip de gen

    public Pentry(String jamType) {
        super();
        pentryWarehouse = new WarehouseImpl();
        this.jamType = jamType;
    }

    public Pentry() {
        super();
    }
}

package warehouse.controller;

import warehouse.model.Garage;
import warehouse.model.Pentry;
import warehouse.model.Warehouse;

import java.util.HashMap;
import java.util.Map;

public class WarehouseFactory {
    private Map<String, Warehouse> factoryMap;

    public WarehouseFactory() {
        factoryMap = new HashMap<>();
        factoryMap.put("Garage", new Garage());
        factoryMap.put("Pentry", new Pentry());
        factoryMap.put("Warehouse", new WarehouseImpl());
    }

    //Vechea metoda
    public Warehouse getWarehouse(String warehouseType) {
        return factoryMap.get(warehouseType);
    }
}

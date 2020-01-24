package warehouse.controller;

import warehouse.exceptions.WarehouseFactoryException;
import warehouse.model.Garage;
import warehouse.model.Pentry;
import warehouse.model.Warehouse;

public class WarehouseFactory {
    public Warehouse getWarehouse(String warehouseType) throws WarehouseFactoryException {
        if (warehouseType == null) {
            throw new WarehouseFactoryException("Object cannot be created");
        }
        if (warehouseType.equalsIgnoreCase("Garage")) {
            return new Garage();
        } else if (warehouseType.equalsIgnoreCase("Pentry")) {
            return new Pentry();
        } else if (warehouseType.equalsIgnoreCase("Warehouse")) {
            return new WarehouseImpl();
        } else {
            throw new WarehouseFactoryException("Warehouse " + warehouseType + " cannot be created.");
        }
    }
}

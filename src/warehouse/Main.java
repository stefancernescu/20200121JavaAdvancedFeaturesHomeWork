package warehouse;

public class Main {
    public static void main(String[] args) {
        WarehouseImpl warehouse = new WarehouseImpl();
        warehouse.add(new Item("Bicicleta", 478.0, 3));
        warehouse.add(new Item("Placa de snowboard", 1278.0, 1));
        warehouse.add(new Item("Sac de cartofi", 1278.0, 1));
        warehouse.displayAllItems();

        //warehouse.updateItem("Placa de snowboard", 50.0, 2);
        //warehouse.updatePrice("Placa de snowboard", 10.0);
        //warehouse.remove("Placa de snowboard");
        //warehouse.updateItem("Trotineta",21.0,1);
        //warehouse.remove("Cartofi");
        warehouse.updateNumberOfPieces("Bicicleta",100);
        System.out.println("After");
        //warehouse.getTotalItems();
        //warehouse.getTotalValue();
        //warehouse.updatePiece("Bicicleta", 3);
        warehouse.displayAllItems();
    }
}

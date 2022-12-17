package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class Maintenance<C extends Car, F extends Freight> {

    private Queue<Transport> maintenance = new LinkedList<>();

    public void addTransport(C car, F freight) {
        maintenance.offer(car);
        maintenance.offer(freight);
    }

    public void doMaintenanceC() {
        C car = (C) maintenance.poll();
        if (car != null) {
            System.out.println("Автомобиль " + car.getBrand() + car.getModel() + " проходит обслуживание" +
                    " перед участием в гонкахю");
        }
    }

    public void doMaintenanceF() {
        F freight = (F) maintenance.poll();
        if (freight != null) {
            System.out.println("Автомобиль " + freight.getBrand() + freight.getModel()
                    + " проходит обслуживание перед участием в гонкахю");
        }
    }
}

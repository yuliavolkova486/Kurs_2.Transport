package transport;

import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void addTransport(Transport transport) {
        if (transport.checkTransportNeedService()) {
            queue.offer(transport);
        }
    }

    public void carryOutATechnicalInspection(Queue<Transport> queue) {
        if (queue.isEmpty()) {
            System.out.println("У данного транспорта нет механиков");
        } else {
            for (int i = 0; i < queue.size(); i++) {
                Mechanic mechanic = (Mechanic) queue.poll().getMechanics().get(0);
                mechanic.performMaintenance(queue.element());
            }
            }
        }
}


package transport;

import java.util.*;
public class TestTransport {
    public static void main(String[] args) {
        List<Transport> transportList = new ArrayList<>();

        Mechanic mechanic1 = new Mechanic("Дилу Дмитрий", "The Best");
        Mechanic mechanic2 = new Mechanic("Замятин Андрей", "Fly car");
        Mechanic mechanic3 = new Mechanic("Рыков Константин", "Super Car");
        Mechanic mechanic4 = new Mechanic("Иванько Петр", "The Best");
        Mechanic mechanic5 = new Mechanic("Гоголь Олег", "Super Car");

        PassengerCars<DriverB> passengerCars1 = new PassengerCars<>("Volga", "2110", 1.7,
                new DriverB("Иванов Иван Иванович", true, 8),
                List.of(mechanic1, mechanic5), PassengerCars.BodyType.TYPE2);
        PassengerCars<DriverB> passengerCars2 = new PassengerCars<>("Lada", "Granta", 1.6,
                new DriverB("Лагутин Федор Афанасьевич", true, 25),
                List.of(mechanic2, mechanic5, mechanic3), PassengerCars.BodyType.TYPE3);
        PassengerCars<DriverB> passengerCars3 = new PassengerCars<>("Hyundai", "Solaris", 2.8,
                new DriverB("Моргун Артем Валерьевич", true, 3),
                List.of(mechanic1, mechanic4), PassengerCars.BodyType.TYPE7);
        PassengerCars<DriverB> passengerCars4 = new PassengerCars<>("Toyota", "Land Cruiser", 3.5,
                new DriverB("Косенко Антон Павлович", true, 12),
                List.of(mechanic5), PassengerCars.BodyType.TYPE1);

        Trucks<DriverC> trucks1 = new Trucks<>("Ford", "1931", 10.4,
                new DriverC("Матвеев Роман Искандерович", true, 10),
                List.of(mechanic4), Trucks.LoadCapacity.N1);
        Trucks<DriverC> trucks2 = new Trucks<>("Scania", "P360", 9.8,
                new DriverC("Орлов Семен Антонович", true, 5),
                List.of(mechanic3), Trucks.LoadCapacity.N3);
        Trucks<DriverC> trucks3 = new Trucks<>("Reno", "R420", 14.3,
                new DriverC("Косой Владимир Иванович", true, 22),
                List.of(mechanic2, mechanic1), Trucks.LoadCapacity.N1);
        Trucks<DriverC> trucks4 = new Trucks<>("Mersedes-Benz", "L 3500", 8.0,
                new DriverC("Васильев Василий Дамирович", true, 6),
                List.of(mechanic1, mechanic3), Trucks.LoadCapacity.N2);

        TheBuses<DriverD> theBuses4 = new TheBuses<>("Nissan", "N180", 5.0,
                new DriverD("Сидоров Илья Петрович", true, 15),
                List.of(mechanic5), TheBuses.Capacity.EXTRA_LARGE);
        TheBuses<DriverD> theBuses1 = new TheBuses<>("Mersedes-Benz", "O 6600", 4.5,
                new DriverD("Кондратенко Святослав Савельевич", true, 28),
                List.of(mechanic2, mechanic5), TheBuses.Capacity.EXTRA_SMALL);
        TheBuses<DriverD> theBuses2 = new TheBuses<>("San", "H-100A", 5.6,
                new DriverD("Новый Олег Андреевич", true, 11),
                List.of(mechanic1), TheBuses.Capacity.SMALL);
        TheBuses<DriverD> theBuses3 = new TheBuses<>("Volkswagen", "Samba", 4.8,
                new DriverD("Фуниз Владлен Иванович", true, 16),
                List.of(mechanic4), TheBuses.Capacity.MIDDLE);

        transportList.add(0, passengerCars1);
        transportList.add(1, passengerCars2);
        transportList.add(2, passengerCars3);
        transportList.add(3, passengerCars4);
        transportList.add(4, trucks1);
        transportList.add(5, trucks2);
        transportList.add(6, trucks3);
        transportList.add(7, trucks4);
        transportList.add(8, theBuses1);
        transportList.add(9, theBuses2);
        transportList.add(10, theBuses3);
        transportList.add(11, theBuses4);

//        Mechanic.fixTheCar(theBuses1);
//        Mechanic.performMaintenance(passengerCars4);
//        Transport.printFullNameDriver(passengerCars1,passengerCars1.getDriver());

        Queue<Transport> transports = new ArrayDeque<>();
        ServiceStation station = new ServiceStation(transports);
//        station.addTransport(trucks3);
//        station.addTransport(theBuses3);
//        station.addTransport(passengerCars2);

//        station.carryOutATechnicalInspection(transports);

        Map<Transport, List<Mechanic>> listMap = new HashMap<>();
        listMap.put(theBuses3, theBuses3.getMechanics());
        listMap.put(trucks3, trucks3.getMechanics());
        listMap.put(passengerCars2, passengerCars2.getMechanics());
        listMap.put(trucks1, trucks1.getMechanics());
        for (Map.Entry<Transport, List<Mechanic>> transportMechanicEntry : listMap.entrySet()) {
            System.out.println("Транспорт - " + transportMechanicEntry.getKey() + ": " + transportMechanicEntry.getValue());
        }
    }
    public void checkTransport(Transport transport)  {
        try {
            transport.passDiagnostics();
        } catch (TransportTypeException e) {
            System.err.println("Ошибка: " + e);
        }
    }
}






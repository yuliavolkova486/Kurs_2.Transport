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

        Driver driver1 = new DriverB("Иванов Иван Иванович", true, 8);
        Driver driver2 = new DriverB("Лагутин Федор Афанасьевич", true, 25);
        Driver driver3 = new DriverB("Моргун Артем Валерьевич", true, 3);
        Driver driver4 = new DriverB("Косенко Антон Павлович", true, 12);
        Driver driver5 = new DriverC("Матвеев Роман Искандерович", true, 10);
        Driver driver6 = new DriverC("Орлов Семен Антонович", true, 5);
        Driver driver7 = new DriverC("Косой Владимир Иванович", true, 22);
        Driver driver8 = new DriverC("Васильев Василий Дамирович", true, 6);
        Driver driver9 = new DriverD("Сидоров Илья Петрович", true, 15);
        Driver driver10 = new DriverD("Кондратенко Святослав Савельевич", true, 28);
        Driver driver11 = new DriverD("Новый Олег Андреевич", true, 11);
        Driver driver12 = new DriverD("Фуниз Владлен Иванович", true, 16);


        PassengerCars<DriverB> passengerCars1 = new PassengerCars<>("Volga", "2110", 1.7,
                driver1, List.of(mechanic1, mechanic5), PassengerCars.BodyType.TYPE2);
        PassengerCars<DriverB> passengerCars2 = new PassengerCars<>("Lada", "Granta", 1.6,
                driver2, List.of(mechanic2, mechanic5, mechanic3), PassengerCars.BodyType.TYPE3);
        PassengerCars<DriverB> passengerCars3 = new PassengerCars<>("Hyundai", "Solaris", 2.8,
                driver3, List.of(mechanic1, mechanic4), PassengerCars.BodyType.TYPE7);
        PassengerCars<DriverB> passengerCars4 = new PassengerCars<>("Toyota", "Land Cruiser", 3.5,
                driver4, List.of(mechanic5), PassengerCars.BodyType.TYPE1);

        Trucks<DriverC> trucks1 = new Trucks<>("Ford", "1931", 10.4,
                driver5, List.of(mechanic4), Trucks.LoadCapacity.N1);
        Trucks<DriverC> trucks2 = new Trucks<>("Scania", "P360", 9.8,
                driver6, List.of(mechanic3), Trucks.LoadCapacity.N3);
        Trucks<DriverC> trucks3 = new Trucks<>("Reno", "R420", 14.3,
                driver7, List.of(mechanic2, mechanic1), Trucks.LoadCapacity.N1);
        Trucks<DriverC> trucks4 = new Trucks<>("Mersedes-Benz", "L 3500", 8.0,
                driver8, List.of(mechanic1, mechanic3), Trucks.LoadCapacity.N2);

        TheBuses<DriverD> theBuses4 = new TheBuses<>("Nissan", "N180", 5.0,
                driver9, List.of(mechanic5), TheBuses.Capacity.EXTRA_LARGE);
        TheBuses<DriverD> theBuses1 = new TheBuses<>("Mersedes-Benz", "O 6600", 4.5,
                driver10, List.of(mechanic2, mechanic5), TheBuses.Capacity.EXTRA_SMALL);
        TheBuses<DriverD> theBuses2 = new TheBuses<>("San", "H-100A", 5.6,
                driver11, List.of(mechanic1), TheBuses.Capacity.SMALL);
        TheBuses<DriverD> theBuses3 = new TheBuses<>("Volkswagen", "Samba", 4.8,
                driver12, List.of(mechanic4), TheBuses.Capacity.MIDDLE);

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
//
//        Queue<Transport> transports = new ArrayDeque<>();
//        ServiceStation station = new ServiceStation(transports);
//
//        station.addTransport(trucks3);
//        station.addTransport(theBuses3);
//        station.addTransport(passengerCars2);
//
//        station.carryOutATechnicalInspection(transports);
//
//        Map<Transport, List<Mechanic>> listMap = new HashMap<>();
//        listMap.put(theBuses3, theBuses3.getMechanics());
//        listMap.put(trucks3, trucks3.getMechanics());
//        listMap.put(passengerCars2, passengerCars2.getMechanics());
//        listMap.put(trucks1, trucks1.getMechanics());
//        for (Map.Entry<Transport, List<Mechanic>> transportMechanicEntry : listMap.entrySet()) {
//            System.out.println("Транспорт - " + transportMechanicEntry.getKey() + ": " + transportMechanicEntry.getValue());
//        }
        System.out.println("--------------------task1---------------------------");
        Set<Driver> drivers = new HashSet<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);
        drivers.add(driver5);
        drivers.add(driver6);
        drivers.add(driver7);
        drivers.add(driver8);
        drivers.add(driver9);
        drivers.add(driver10);
        drivers.add(driver11);
        drivers.add(driver12);
//        if (drivers.contains(driver1) || drivers.contains(driver2) || drivers.contains(driver4)
//                || drivers.contains(driver5) || drivers.contains(driver6) || drivers.contains(driver7)
//                || drivers.contains(driver8) || drivers.contains(driver9) || drivers.contains(driver10)
//                || drivers.contains(driver11) || drivers.contains(driver12)) {
//            System.out.println("Такой водитель уже добавлен!");
//        }
        drivers.add(driver4);
        printSet(drivers);
        System.out.println("--------------------task2---------------------------");
        Iterator<Driver> driverIterator = drivers.iterator();
        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }
    }

    public static void printSet(Set<Driver> drivers) {
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }
//    public void checkTransport(Transport transport)  {
//        try {
//            transport.passDiagnostics();
//        } catch (TransportTypeException e) {
//            System.err.println("Ошибка: " + e);
//        }
//    }
}






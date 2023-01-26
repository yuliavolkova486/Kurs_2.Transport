package transport;
public class TestTransport {
    public static void main(String[] args) {
        PassengerCars<DriverB> passengerCars1 = new PassengerCars<>("Volga", "2110", 1.7,
                new DriverB("Иванов Иван Иванович", true, 8));
        PassengerCars<DriverB> passengerCars2 = new PassengerCars<>("Lada", "Granta", 1.6,
                new DriverB("Лагутин Федор Афанасьевич", true, 25));
        PassengerCars<DriverB> passengerCars3 = new PassengerCars<>("Hyundai", "Solaris", 2.8,
                new DriverB("Моргун Артем Валерьевич", true, 3));
        PassengerCars<DriverB> passengerCars4 = new PassengerCars<>("Toyota", "Land Cruiser", 3.5,
                new DriverB("Косенко Антон Павлович", true, 12));

        Trucks<DriverC> trucks1 = new Trucks<>("Ford", "1931", 10.4,
                new DriverC("Матвеев Роман Искандерович", true, 10));
        Trucks<DriverC> trucks2 = new Trucks<>("Scania", "P360", 9.8,
                new DriverC("Орлов Семен Антонович", true, 5));
        Trucks<DriverC> trucks3 = new Trucks<>("Reno", "R420", 14.3,
                new DriverC("Косой Владимир Иванович", true, 22));
        Trucks<DriverC> trucks4 = new Trucks<>("Mersedes-Benz", "L 3500", 8.0,
                new DriverC("Васильев Василий Дамирович", true, 6));

        TheBuses<DriverD> theBuses1 = new TheBuses<>("Mersedes-Benz", "O 6600", 4.5,
                new DriverD("Кондратенко Святослав Савельевич", true, 28));
        TheBuses<DriverD> theBuses2 = new TheBuses<>("San", "H-100A", 5.6,
                new DriverD("Новый Олег Андреевич", true, 11));
        TheBuses<DriverD> theBuses3 = new TheBuses<>("Volkswagen", "Samba", 4.8,
                new DriverD("Фуниз Владлен Иванович", true, 16));
        TheBuses<DriverD> theBuses4 = new TheBuses<>("Nissan", "N180", 5.0,
                new DriverD("Сидоров Илья Петрович", true, 15));

        theBuses4.startMoving();
        theBuses3.startMoving();
        trucks1.finishTheMovement();
        trucks3.finishTheMovement();
        passengerCars1.pitStop();
        trucks4.pitStop();
        trucks2.bestLapTime();
        theBuses1.bestLapTime();
        theBuses2.maximumSpeed();
        Trucks.getTransportInfo(trucks3);
        PassengerCars.getTransportInfo(passengerCars2);
        PassengerCars.getTransportInfo(passengerCars3);
        PassengerCars.getTransportInfo(passengerCars4);
        TheBuses.getTransportInfo(theBuses2);
    }
}

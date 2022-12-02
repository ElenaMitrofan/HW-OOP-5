public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("BMW", "Z8", 3.2, BodyType.SEDAN);
        System.out.println(bmw);
        bmw.pitStop();
        bmw.bestLapTime();
        bmw.maxSpeed();
        bmw.printType();
        System.out.println();

        Truck gazelle = new Truck("ГАЗель", "Next", 2.9, Weight.N2);
        System.out.println(gazelle);
        gazelle.pitStop();
        gazelle.bestLapTime();
        gazelle.printType();
        gazelle.maxSpeed();

        System.out.println();

        Bus zis = new Bus("ЗИС", "154", 4.5, Capacity.LARGE);
        System.out.println(zis);
        zis.pitStop();
        zis.bestLapTime();
        zis.maxSpeed();
        zis.printType();
        System.out.println();

    }
}
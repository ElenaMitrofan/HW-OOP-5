public class Truck extends Transport implements Competing {
    private Weight weight;
    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }
    public Truck() {
        this ("default",
                "default",
                1.1,
                Weight.N1);
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void startMoving(){
        return;
    }
    public void finishMoving(){
        return;
    }
    public void printType(){
        if (weight == null) {
            System.out.println("Данных по авто недостаточно! ");
        }else{
            String from = weight.getFrom() == null ? "" : "от" + weight.getFrom()+"";
            String to = weight.getTo() == null ? "" : "до" + weight.getTo();
            System.out.println("Грузоподъёмность: " + from + "т " + to + "т ");
        }
    }
    @Override
    public String toString() {
        return "Грузовой автомобиль: " + getBrand()+
                ", модель: " + getModel()+
                ", объём двигателя: " + getEngineVolume();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль заезжает на обслуживание %s %s.\n", getBrand(), getModel());
        System.out.printf("Автомобиль %s %s прошел обслуживание, выезжает на трассу.\n", getBrand(), getModel());

    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время автомобиля %s %s составляет: %.0f мин.\n", getBrand(), getModel(), (1+Math.random() * (5)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автомобиля %s %s составила: %.1f км/ч.\n", getBrand(), getModel(), (100+Math.random() * (200)));
    }
}

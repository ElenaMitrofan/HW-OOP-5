public class Bus extends Transport implements Competing {
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }
    public Bus() {
        this ("default",
                "default",
                1.1,
                Capacity.EXTRA_LARGE);
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void startMoving(){
        return;
    }
    public void finishMoving(){
        return;
    }
    public void printType(){
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно! ");
        }else{
            System.out.println("Вместимость от: " + capacity.getFrom() + " чел. до " + capacity.getTo()+" чел.");
        }
    }
    @Override
    public String toString() {
        return "Автобус: " + getBrand()+
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

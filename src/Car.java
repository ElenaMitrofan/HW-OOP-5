

public class Car extends Transport implements Competing {
private BodyType bodyType;
    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public Car() {
        this ("default",
                "default",
                1.1,
                BodyType.SEDAN);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void startMoving(){
        return;
    }
    public void finishMoving(){
        return;
    }

    public void printType(){
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно! ");
        }else{
            System.out.println("Тип авто: " + bodyType);
        }
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + getBrand()+
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

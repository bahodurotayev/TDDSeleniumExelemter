package day07;

public abstract class Cars {
    String fuelType;

    public Cars(String fuelType) {
        this.fuelType = fuelType;
    }
    abstract void setFuelType();
}
class Toyota extends Cars{
    public Toyota(String fuelType) {
        super(fuelType);

    }
    @Override
    void setFuelType() {
        System.out.println("Toyota consume : " + fuelType);
    }


}
class Honda extends Cars{
    public Honda(String fuelType) {
        super(fuelType);
    }

    @Override
    void setFuelType() {
        System.out.println("Honda consume : " + fuelType);
    }
}
class Tesla extends Cars{
    public Tesla(String fuelType) {
        super(fuelType);
    }

    @Override
    void setFuelType() {
        System.out.println("Tesla consume : " + fuelType);
    }
}

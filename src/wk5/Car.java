package wk5;

public class Car {


    /*
    attributes
            Color
            weight
            numbersOfDoors
            wheelSize
            engineSize
            mileage

   actions
        isBigCar
            if wheelSize is a certain value
        isOldCar
            if mileage is at a certain value
        isExpensiveCar
            if color is certain value and.... you be creative
     */

    private String color = "red";
    public static final int MIN_WEIGHT = 1000; // constant value
    public static final int MIN_WHEEL_SIZE = 13; // constant value
    private double weight = MIN_WEIGHT;
    private byte numDoors = 2;
    private float wheelSize = MIN_WHEEL_SIZE;
    public enum EngineSizes {V3, V4, V6, V8, V10, V12}
    private EngineSizes engineSize = EngineSizes.V4;
    private double mileage;

    public boolean isBigCar(){
        return wheelSize > 30 && weight > MIN_WEIGHT * 2;
    }
    public boolean isOldCar(){
        return mileage > 300000;
    }
    public boolean isExpensiveCar(){
        return isOldCar() && isBigCar() && (engineSize == EngineSizes.V10 || engineSize == EngineSizes.V12);
    }
    public Car(){}
    public Car(String color, double weight, byte numDoors){
        setColor(color);
        setWeight(weight);
        setNumDoors(numDoors);
    }
    public Car(String color, double weight, byte numDoors, float wheelSize, EngineSizes engineSize, double mileage) {
//        this.color = color;
//        this.weight = weight;
//        this.numDoors = numDoors;
//        this.wheelSize = wheelSize;
//        this.engineSize = engineSize;
//        this.mileage = mileage;
        setColor(color);
        setWeight(weight);
        setNumDoors(numDoors);
        setWheelSize(wheelSize);
        setEngineSize(engineSize);
        setMileage(mileage);

    }
    public Car(String color, double weight, byte numDoors, float wheelSize,
               String engineSize, double mileage) {
//        this.color = color;
//        this.weight = weight;
//        this.numDoors = numDoors;
//        this.wheelSize = wheelSize;
//        this.engineSize = engineSize;
//        this.mileage = mileage;
        setColor(color);
        setWeight(weight);
        setNumDoors(numDoors);
        setWheelSize(wheelSize);
        setEngineSize(engineSize);
        setMileage(mileage);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.length()>=3)
            this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight >= MIN_WEIGHT)
            this.weight = weight;
    }

    public byte getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(byte numDoors) {
        if(numDoors == 2 || numDoors == 3 || numDoors == 4 || numDoors == 5)
            this.numDoors = numDoors;
    }

    public float getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(float wheelSize) {
        if(wheelSize >= MIN_WHEEL_SIZE)
            this.wheelSize = wheelSize;
    }

    public EngineSizes getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(EngineSizes engineSize) {
        this.engineSize = engineSize;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        if(mileage >= 0)
            this.mileage = mileage;
    }

    public void setEngineSize(String engineSize){

        switch (engineSize.toLowerCase()){

            case "v3":
                this.engineSize = EngineSizes.V3;
                break;

            case "v4":
                this.engineSize = EngineSizes.V4;
                break;
            case "v6":
                this.engineSize = EngineSizes.V6;
                break;
            case "v8":
                this.engineSize = EngineSizes.V8;
                break;
            case "v10":
                this.engineSize = EngineSizes.V10;
                break;
            case "v12":
                this.engineSize = EngineSizes.V12;
                break;

        }

    }

    public void setEngineSizev2(String engineSize){

        for(EngineSizes size : EngineSizes.values()){

            if(size.toString().equals(engineSize.toUpperCase())){
                this.engineSize = size;
                return;
            }
        }
        this.engineSize = EngineSizes.V4;
    }

    public void setEngineSizev3(String engineSize){

        System.out.println(Enum.valueOf(Car.EngineSizes.class, engineSize));

    }

}

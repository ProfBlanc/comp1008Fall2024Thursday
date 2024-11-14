package wk10;

public class Laptop extends Rectangle implements Button{


    @Override
    public double clicked() {
        return 0;
    }

    @Override
    public boolean isPressed() {
        return false;
    }
}

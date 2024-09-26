package wk4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Person {

    //attributes

    /*
        height,
        name,
        weight,
        age,
        eyeColor,
        hairColor
        iq
     */
    //<accessLevel> <modifiers> dataType name; or = value;
    public double height;
    public String name;
    protected float weight;
    private byte age;
    public String hairColor;
    private String eyeColor;
    //black, brown, hazel, blue, green, yellow, lavender, grey

    public String getEyeColor(){
        return eyeColor;
    }
    public void setEyeColor(String eyeColor){
        ArrayList<String> allowableEyeColors = new ArrayList<>();
        allowableEyeColors.add("black");
        allowableEyeColors.add("brown");
        allowableEyeColors.add("green");
        allowableEyeColors.add("blue");
        allowableEyeColors.add("yellow");
        allowableEyeColors.add("lavender");
        allowableEyeColors.add("hazel");
        allowableEyeColors.add("grey");
        //ternary operator
        //condesed if statement
        // boolean_expression ? value_if_true : value_if_false
        this.eyeColor = allowableEyeColors.contains(eyeColor)
                ? eyeColor : allowableEyeColors.get(0);
    }

    //accessLevel returnDataType name([arguments]){}
    public byte getAge(){
        return age;
    }
    public void setAge(byte age){
        //only accept ages 0-100
        if(age >= 0 && age <= 100)
            this.age = age;
    }

}

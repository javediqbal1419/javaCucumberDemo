package testDemo;

public class WrapperClass {

    public static void main(String[] args) {
        convertDecimalToInt();

    }
    public static void convertDecimalToInt(){
        double [] numbers = {1.5, 3.5,6.25, 5.36, 10.1};

                for (Double number: numbers){
                    System.out.println("This is Int Number: "+number.intValue());
                }
    }
}

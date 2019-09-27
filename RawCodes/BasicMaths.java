public class BasicMaths{
    public static float square(float number) {
        return multiply(number, number);
    }
    public static float multiply(float number1, float number2){
        return number1*number2;
    }
    public static float add(float number1, float number2) {
        return number1 + number2;
    }
    public static float cube(float number){
        return number * square(number);
    }
}
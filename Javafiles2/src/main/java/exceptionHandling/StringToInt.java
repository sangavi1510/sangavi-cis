package exceptionHandling;

public class StringToInt {

    public static Integer convertStringToInt(String str) throws NumberFormatException {

        return Integer.parseInt(str);

    }

    public static void main(String[] args) {
        System.out.println( StringToInt.convertStringToInt("abc"));
    }
}

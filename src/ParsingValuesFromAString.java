public class ParsingValuesFromAString {
    public static void main(String[] args){
        String numberAsString = "2018";
        System.out.println("Number as String " + numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println(number+1);
        double double_value = Double.parseDouble(numberAsString);
        System.out.println(double_value);
    }
}

package exercise_3_roman_number;

public class NumberConvert {

    public NumberConvert() {
        System.out.println("Roman Numbers");
    }

    public String toRoman(int number) {
        if (number >= 5000)
            return "ERROR";
        String roman = "";
        int[] numKeys = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanKeys = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < numKeys.length; i++) {
            if (number >= numKeys[i]) {
                number -= numKeys[i];
                roman = romanKeys[i] + this.toRoman(number);
                break;
            }
        }
        return roman;
    }
}
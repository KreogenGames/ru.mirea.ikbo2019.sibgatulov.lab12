public class Telephone {
    private final String number;
    private String numb_of_index;

    public Telephone(String number) {
        this.number = parseNumber(number);
    }

    public String parseNumber(String number) {
        boolean isPlus = number.charAt(0) == '+';

        numb_of_index= number.substring(0, number.length() - 10);

        if (!isPlus) {
            this.numb_of_index = "+" + numb_of_index;
        }


        number = number.substring(number.length() - 10, number.length());
        return this.numb_of_index + "-" + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
    }

    @Override
    public String toString() {
        return "number = " + number;
    }

    public static void main(String[] args) {
        Telephone telephone1 = new Telephone("+104289652211");
        Telephone telephone2 = new Telephone("89175655655");
        System.out.println(telephone1);
        System.out.println(telephone2);
    }
}
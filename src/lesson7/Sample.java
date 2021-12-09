package lesson7;

public class Sample {
    static String regex = "[^0-9]";

    public static void validatePhone(String num1, String num2) {
        final int length = 10;
        class PhoneNumber {

            String formatNum = null;

            public PhoneNumber (String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regex, "");
                if (currentNumber.length() == length) {
                    formatNum = currentNumber;
                }
            }
            public String getFormatNum() {
                return formatNum;
            }
        }

        PhoneNumber phoneNumber1 = new PhoneNumber(num1);
        PhoneNumber phoneNumber2 = new PhoneNumber(num2);

        if (phoneNumber1.getFormatNum() == null) {
            System.out.println("Invalid " + phoneNumber1.getFormatNum());
        } else {
            System.out.println("Valid " + phoneNumber1.getFormatNum());
        }

        if (phoneNumber2.getFormatNum() == null) {
            System.out.println("Invalid " + phoneNumber2.getFormatNum());
        } else {
            System.out.println("Valid " + phoneNumber2.getFormatNum());
        }
    }

    public static void main(String[] args) {
        validatePhone("921-333-33-33", "33434");
    }
}

import java.util.Scanner;
public class NumericalConversions1 {

    public int binaryToDecimal(String binary) {
        int decimal = 0, power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') * Math.pow(2, power++);
        }
        return decimal;
    }

    public String decimalToBinary(int number) {
        String binary = "";
        while (number > 0) {
            binary = (number % 2) + binary;
            number /= 2;
        }
        return binary.isEmpty() ? "0" : binary;
    }

    public int octalToDecimal(String octal) {
        int decimal = 0, power = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * Math.pow(8, power++);
        }
        return decimal;
    }

    public String decimalToOctal(int number) {
        String octal = "";
        while (number > 0) {
            octal = (number % 8) + octal;
            number /= 8;
        }
        return octal.isEmpty() ? "0" : octal;
    }

    public int hexToDecimal(String hex) {
        hex = hex.toUpperCase();
        String digits = "0123456789ABCDEF";
        int decimal = 0, power = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            int digit = digits.indexOf(hex.charAt(i));
            decimal += digit * Math.pow(16, power++);
        }
        return decimal;
    }

    public String decimalToHex(int number) {
        String hex = "";
        String digits = "0123456789ABCDEF";
        while (number > 0) {
            hex = digits.charAt(number % 16) + hex;
            number /= 16;
        }
        return hex.isEmpty() ? "0" : hex;
    }
}


public class NumberConvertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumericalConversions1 nc = new NumericalConversions1();

        int ch;
        do {
            System.out.println("\n====== Numerical Conversion Menu ======");
            System.out.println(" 1.  Decimal       → Binary");
            System.out.println(" 2.  Decimal       → Octal");
            System.out.println(" 3.  Decimal       → Hexadecimal");
            System.out.println(" 4.  Binary        → Decimal");
            System.out.println(" 5.  Octal         → Decimal");
            System.out.println(" 6.  Hexadecimal   → Decimal");
            System.out.println(" 7.  Binary        → Octal");
            System.out.println(" 8.  Binary        → Hexadecimal");
            System.out.println(" 9.  Octal         → Binary");
            System.out.println("10.  Hexadecimal   → Binary");
            System.out.println("11.  Octal         → Hexadecimal");
            System.out.println("12.  Hexadecimal   → Octal");
            System.out.println("13.  Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter Decimal: ");
                    int d = sc.nextInt();
                    System.out.println("Binary: " + nc.decimalToBinary(d));
                }
                case 2 -> {
                    System.out.print("Enter Decimal: ");
                    int d = sc.nextInt();
                    System.out.println("Octal: " + nc.decimalToOctal(d));
                }
                case 3 -> {
                    System.out.print("Enter Decimal: ");
                    int d = sc.nextInt();
                    System.out.println("Hexadecimal: " + nc.decimalToHex(d));
                }
                case 4 -> {
                    System.out.print("Enter Binary: ");
                    String b = sc.next();
                    System.out.println("Decimal: " + nc.binaryToDecimal(b));
                }
                case 5 -> {
                    System.out.print("Enter Octal: ");
                    String o = sc.next();
                    System.out.println("Decimal: " + nc.octalToDecimal(o));
                }
                case 6 -> {
                    System.out.print("Enter Hexadecimal: ");
                    String h = sc.next();
                    System.out.println("Decimal: " + nc.hexToDecimal(h));
                }
                case 7 -> {
                    System.out.print("Enter Binary: ");
                    String b = sc.next();
                    int dec = nc.binaryToDecimal(b);
                    System.out.println("Octal: " + nc.decimalToOctal(dec));
                }
                case 8 -> {
                    System.out.print("Enter Binary: ");
                    String b = sc.next();
                    int dec = nc.binaryToDecimal(b);
                    System.out.println("Hexadecimal: " + nc.decimalToHex(dec));
                }
                case 9 -> {
                    System.out.print("Enter Octal: ");
                    String o = sc.next();
                    int dec = nc.octalToDecimal(o);
                    System.out.println("Binary: " + nc.decimalToBinary(dec));
                }
                case 10 -> {
                    System.out.print("Enter Hexadecimal: ");
                    String h = sc.next();
                    int dec = nc.hexToDecimal(h);
                    System.out.println("Binary: " + nc.decimalToBinary(dec));
                }
                case 11 -> {
                    System.out.print("Enter Octal: ");
                    String o = sc.next();
                    int dec = nc.octalToDecimal(o);
                    System.out.println("Hexadecimal: " + nc.decimalToHex(dec));
                }
                case 12 -> {
                    System.out.print("Enter Hexadecimal: ");
                    String h = sc.next();
                    int dec = nc.hexToDecimal(h);
                    System.out.println("Octal: " + nc.decimalToOctal(dec));
                }
                case 13 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("❌ Invalid choice. Try again!");
            }

        } while (ch != 13);
        sc.close();
    }
}

package Java;

public class CastingDemo {
    public static void main(String[] args) {


        // convert double to int
        double theDoubleGradeAvg = 89.70;
        int theIntGradeAvg = (int) theDoubleGradeAvg;

        System.out.println("the double grade average = " + theDoubleGradeAvg);
        System.out.println("the int grade average = " + theIntGradeAvg);

        // convert float to byte
        float theFloatDistance = 123.60f;
        byte theByteDistance = (byte) theFloatDistance;

        System.out.println("the float distance = " + theFloatDistance);
        System.out.println("the byte distance = " + theByteDistance);

        // convert int to char
        int theCharacterCode = 68;
        char theChar = (char) theCharacterCode;

        System.out.println("the character code = " + theCharacterCode);
        System.out.println("the char = " + theChar);

        // convert string to int
        String stringVal = "49";
        int count = Integer.parseInt(stringVal);
        System.out.println("The String is = " + count);
    }
}

public class Hello {
    public static void main(String[] args) {
        int luckyNumber = 50;
        int found = 0;
        int[] luckyNumbers = new int[] { 27, 100, 10, 27, 50, 5, 27 };
        for (int i = 0; i < luckyNumbers.length; i++) {
            if (luckyNumber == luckyNumbers[i]) {
                found++;
            }
        }
        System.out.println("Lucky number found " + found + " time(s).");
    }
}

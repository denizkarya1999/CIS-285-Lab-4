public class Hello {
  public static void main(String[] args) {
    int[] luckyNumbers = new int[]{27, 100, 10, 50, 5};
    System.out.println("My lucky numbers are: ");
    for(int i=1; i<luckyNumbers.length; i++) {
      System.out.println(luckyNumbers[i]);
    }
  }
}

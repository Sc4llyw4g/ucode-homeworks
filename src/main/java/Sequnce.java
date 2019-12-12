public class Sequnce {
    /**
     * 6. Create a class called Sequence. Read from the keyboard a number
     * (long) and print "yes" or "no" if the number has its digits in sequential
     * order (both increasing or decreasing).
     *
     * Example:
     * read -> 12345
     * print -> yes
     *
     * read-> 432
     * print -> yes
     *
     * read-> 123451
     * print -> no
     */

    public class homework6 {
        public static void main(String[] args) {

            long firstNumber = 12345
            long secondNumber = 432
            long thirdNumber = 123451

            String firstNumberAsString = Long.toString(firstNumber);

            firstNumberAsString.length()
                    for (int i = 1; i<firstNumberAsString.length() - 1; i++) {
                        char currentCharacter = firstNumberAsString.charAt(1);
                        char nextCharacter = firstNumberAsString.charAt(i+1);
                       System.out.println("current" + currentCharacter);
                       System.out.println("Next" + nextCharacter);

                    }
        }
    }


}

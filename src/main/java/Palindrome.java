public class Palindrome {

    public static void main(String[] args) {

        //Ex: 12345, mom, car, 12321

        String original = "car";

        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrom = true;
        for(int i = 0; i < original.length(); i++) {
            if(original.charAt(i) != reverse.charAt(i)) {
                palindrom = false;
            }
        }
        if (palindrom) {
            System.out.println("This is a palindrom!");
        } else {
            System.out.println("This is not a palindrom");
        }
    }
}

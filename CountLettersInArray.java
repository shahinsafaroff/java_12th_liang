/*
public class CountLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("The Lowercase letters are: ");
        displayArrays(chars);
        int[] counts = countLetters(chars);
        System.out.println();
        System.out.println("The occurences of each letter are: ");
        displayArrays(counts);
    }

    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = randomCharacter.getRandomLowerCaseLetter();
            return chars;
        }
    }
    public static char randomCharacter(char ch1, char c2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 +1))
    }
    public static char randomCharacter() {
        return randomCharacter('\u0000', '\uFFFF');
    }
    public static void displayArrays(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.println(chars[i] + " ");
        }
    }
    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
    }
    public static void displayCounts(int[] counts){
        for (int i = 0; i < counts.length; i++) {
             if ((i + 1) % 10 == 0) {
               System.out.println(counts[i] + " " + (char) (i + 'a'));
               } else
               System.out.println(counts[i] + " " + (char) (i + 'a') + " ");
            }
        }
    }
}
*/

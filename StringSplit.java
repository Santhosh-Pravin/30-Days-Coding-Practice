import java.util.Scanner;
public class StringSplit {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[] customSplit(String str) {
        int len = findLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ')
                wordCount++;
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        int wordIdx = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            words[wordIdx++] = str.substring(start, end);
            start = end + 1;
        }
        words[wordIdx] = str.substring(start, len);
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] builtInSplit = input.split(" ");
        String[] customSplit = customSplit(input);
        boolean same = compareArrays(builtInSplit, customSplit);
        System.out.println("\nWords (built-in split):");
        for (String w : builtInSplit) {
            System.out.println(w);
        }
        System.out.println("\nWords (custom split):");
        for (String w : customSplit) {
            System.out.println(w);
        }
        System.out.println("\nComparison result: " + (same ? "Arrays match" : "Arrays differ"));
        sc.close();
    }
}

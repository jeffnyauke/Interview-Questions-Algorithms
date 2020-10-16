package Strings.cropWords;

public class Solution {

    public static void main(String[] args) {
        System.out.println(cropWords("Codility Me text coders", 14));
        System.out.println(cropWords("Codility Me text coders", 5));
        System.out.println(cropWords("Code Me text coders", 5));
        System.out.println(cropWords("a b c d", 3));
        System.out.println(cropWords("", 5));
        System.out.println(cropWords("spaceship", 10));
        System.out.println(cropWords("codility We test coders", 14).equals("codility We"));
        System.out.println(cropWords(" co de my", 5).equals(" co"));
        System.out.println(cropWords(" co de my", 7).equals(" co de"));
        System.out.println(cropWords("   ", 2).equals(""));
        System.out.println(cropWords("   re", 2).equals("")); //3 spaces before
        System.out.println(cropWords(" c ", 3).equals(" c"));
        System.out.println(cropWords(" c d  ", 5).equals(" c d"));
        System.out.println(cropWords("co de my", 5).equals("co de"));
        System.out.println(cropWords("Word", 4).equals("Word"));
        System.out.println(cropWords("codility We test coders", 23).equals("codility We test coders"));
        System.out.println(cropWords("withOutSpaces", 14).equals("withOutSpaces"));
        System.out.println(cropWords("", 14).equals(""));
        System.out.println(cropWords("Separatedby hyphens", 14).equals("Separatedby"));
        System.out.println(cropWords("      Codility We test coders     ", 14).equals("      Codility")); //6 leading spaces
        System.out.println(cropWords("      Codility We test coders     ", 10).equals("")); //6 leading spaces
    }

    private static String cropWords(String s, int k) {
        if (k >= s.length()) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.substring(0, k));
        if (s.charAt(k) != ' ') {
            while (sb.length() > 0 && sb.charAt(--k) != ' ') {
                sb.deleteCharAt(k);
            }
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}

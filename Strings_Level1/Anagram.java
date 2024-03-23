package Strings_Level1;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));

	}

	public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            int[] char1 = new int[128];
            int[] char2 = new int[128];
            for (int i = 0; i < s1.length(); i++) {
                char1[s1.charAt(i)]++;
                char2[s2.charAt(i)]++;
            }
            for (int i = 0; i < 128; i++) {
                if (char1[i] != char2[i]) {
                    return false;
                }
            }
            return true;
        }
	}

}

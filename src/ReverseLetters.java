public class ReverseLetters {

    public static String reverseLetters(String s) {
        if (s == null) return null;

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(reverseLetters("ASCA@aef#sv*"));
    }
}
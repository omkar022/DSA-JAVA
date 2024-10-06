package strings;

class CompressedStringII {
    public static String compressedString(String word) {
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            char currentChar = word.charAt(i);
            int count = 0;
            while (i < n && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }
            sb.append(count).append(currentChar);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaabb";
        System.out.println(compressedString(s));

    }
}
public class Q1 {
    public String compress(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (j < str.length()) {
            if (str.charAt(i) != str.charAt(j)) {
                sb.append(str.charAt(i));
                sb.append(j - i);
                i = j;
            }
            j++;
        }
        sb.append(str.charAt(i));
        sb.append(j - i);

        if (sb.length() >= str.length()) {
            return str;
        }
        return sb.toString();
    }
}















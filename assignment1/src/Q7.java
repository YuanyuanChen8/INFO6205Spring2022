import java.util.HashSet;

public class Q7 {
    public String customSortString(String S, String T) {
        char[] Sc = S.toCharArray();
        char[] Tc = T.toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (int f:freq) f=0;
        for (char tc:Tc) freq[tc-'a']++;
        HashSet<Character> aset = new HashSet<>();
        for (char sc:Sc) {
            for(int i=0;i<freq[sc-'a'];i++) {
                sb.append(sc);
            }
            aset.add(sc);
        }
        for (int i=0;i<freq.length;i++) {
            if(!aset.contains((char)('a'+i))) {
                for(int j=0;j<freq[i];j++) sb.append((char)('a'+i));
            }
        }
        return sb.toString();
    }
}

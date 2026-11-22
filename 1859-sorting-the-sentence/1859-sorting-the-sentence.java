class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for (String w : words) {
            int pos = w.charAt(w.length() - 1) - '0';
            res[pos - 1] = w.substring(0, w.length() - 1);
        }
        return String.join(" ", res);
    }
}
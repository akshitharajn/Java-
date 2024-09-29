public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy Dog.";
        if (isPangram(sentence)) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26]; 
        int index;
        
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                index = c - 'a'; 
                alphabet[index] = true; 
            }
        }

        for (boolean found : alphabet) {
            if (!found) {
                return false; 
            }
        }
        
        return true;     }
}
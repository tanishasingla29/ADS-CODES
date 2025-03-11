//Find the Longest Word in a Sentence

public class Tanisha893classtest11Mar2025 {
        public static void main(String[] args) {
            String str = "question in solved";
            System.out.println(findLongestWord(str));
        }
        
        public static String findLongestWord(String str) {
            String[] words = str.split(" ");  // Split the sentence into words
            String longestWord = "";
            
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;  // Update the longest word
                }
            }
            
            return longestWord;  // Return the longest word
        }
    }
    

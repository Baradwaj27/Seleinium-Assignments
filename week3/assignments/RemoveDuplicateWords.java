 package week3.assignments;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		// Split the text into words using space as the delimiter
        String[] words = text.split(" ");
        
		// Initialize count to track duplicates
        int count = 0;
        
     // Compare each word with every other word using two nested for loops
        for (int i = 0; i < words.length; i++) 
        {
            for (int j = i + 1; j < words.length; j++) 
            {
                // Check if the words are the same, case-sensitive comparison
                if (words[i].equals(words[j])) 
                {
                    // Replace the duplicate word with an empty string
                    words[j] = "";
                    
                    // Increment count for each duplicate found
                    count++;
                }
            }
        }

        // Print the modified string with duplicates removed
        String result = "";
        for (String word : words) 
        {
            // Append non-empty words to the result string
            if (!word.isEmpty()) 
            {
                result += word + " ";
            }
        }

        // Remove the last extra space and print the result
        System.out.println(result.trim());
	}

}

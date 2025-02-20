package week3.assignments;

public class ReverseOddWordinString {
	
	public static void main(String[] args) 
	{
		
		String test = "I am a software tester";
		
		// Step 1: Split the string into words
        String[] words = test.split(" ");
        
        // Step 2: Initialize an empty result string
        String result = "";
        
        // Step 3: Traverse through each word
        for (int i = 0; i < words.length; i++) 
        {
            // Step 4: Check if the index is odd
            if (i % 2 != 0) 
            {
                // Reverse the word if the index is odd
                char[] wordArray = words[i].toCharArray();
                int left = 0;
                int right = wordArray.length - 1;
                
                // Reverse the word by swapping characters
                while (left < right) 
                {
                    char temp = wordArray[left];
                    wordArray[left] = wordArray[right];
                    wordArray[right] = temp;
                    left++;
                    right--;
                }
                
                // Replace the original word with the reversed word
                words[i] = new String(wordArray);
            }
            
            // Concatenate the word to the result string, followed by a space
            result += words[i] + " ";
        }
        
        // Print the final output (trim the extra space at the end)
        System.out.println(result.trim());
	}
}

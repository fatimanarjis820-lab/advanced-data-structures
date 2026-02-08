package logicalPrograms;

public class FetchDuplicatesLettersFromWord {
	
public static void main(String[] args) {
	String word = "Programming";
	
	for(int i = 0; i < word.length(); i++) {	
		int count = 1; 
		boolean alreadyPrinted = false;
		
		for(int k = 0; k < i; k++) {
			if(word.charAt(i) == word.charAt(k)) {
				alreadyPrinted = true; 
				break;
			}
		}
		if(alreadyPrinted) continue;
		
		
		for(int j = i + 1; j < word.length(); j ++) {
			if(word.charAt(i) == word.charAt(j)) {
				System.out.println("Duplicate is "+word.charAt(i));
				count++;
			}
			
		}
		if(count>1) {
			System.out.println(word.charAt(i) +" is "+count);
		}
	}
 }
}


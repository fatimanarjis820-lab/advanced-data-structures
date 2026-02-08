package logicalPrograms;

public class Practice {
	
	public static void main(String[] args) {
		
		
		String word = "Programming";
		 String lowerWord = word.toLowerCase();
		
		 //Logic 
//		 P > check r o g r a m m i n g 
//		 r > check o g r a m m i n g 
//		 o > check g r a m m i n g 
//		 g > check r a m m i n g 
//		 r > check a m m i n g 
//		 a > check m m i n g 
//		 m > check m i n g 
//		 m > check i n g 
//		 i > check n g 
//		 n > check g 
		 
		 for(int i = 0; i < lowerWord.length(); i++) {
			 boolean alreadyPrinted = false; 
			 for(int k = 0; k < i; k++) {
				 if(lowerWord.charAt(i) == lowerWord.charAt(k)) {
					 alreadyPrinted = true;
				 }
			 }
			 if(alreadyPrinted) continue;
			 int count = 1; 
			for(int j = i + 1; j < lowerWord.length(); j ++) {
				if(lowerWord.charAt(i) == lowerWord.charAt(j)) {
//					System.out.println("Letter is "+ lowerWord.charAt(i));
					count++;
				}
			}
			if(count>1) {
				System.out.println("Count of "+lowerWord.charAt(i)+"->"+count);
			}
			
			
		 }
	}

}

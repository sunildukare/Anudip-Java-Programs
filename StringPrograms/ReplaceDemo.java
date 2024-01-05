package StringPrograms;

public class ReplaceDemo {
	public static void main(String[] args) {
		String word = "Cook Book";
		String word2 = word.replace('o', 'e');
		String word3 = word.replace("Cook", "Computer");
		System.out.println("Word = "+word);
		System.out.println("Word2 = "+word2);
		System.out.println("Word3 = "+word3);
		
		String message = "The boy is standing on the road. The dog is sitting near the boy.";
		String message2 = message.replace("boy","girl");
		String message3 = message.replaceFirst("boy", "girl");
		
		System.out.println("Original message: "+message);
		System.out.println("New message: "+message2);
		System.out.println("With ReplaceFirst: "+message3);
	}
}

package StringPrograms;

public class SplitDemo {
	public static void main(String[] args) {
		String team = "Indian Hockey Team";
		String[] s = team.split(" ");
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("Original team= "+team);
	}
}

package JavaProgramDesign.Chapter5;

public class MultiplicationTable {
	
	String question = "        Create a multiplication table";
	
	public void printTable() {
		for (int i =1; i<=10; i++) {
			for (int j = 1; j<=10;j++) {
				 System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
		
	}
	

}

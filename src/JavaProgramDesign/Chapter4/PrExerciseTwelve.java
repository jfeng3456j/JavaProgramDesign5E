package JavaProgramDesign.Chapter4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrExerciseTwelve {
	String question = "Question 12: "
			+ "A bank in your town updates its customers’ accounts at the end of each month. The bank offers two types of accounts: savings and checking. Every customer must maintain a minimum balance. If a customer’s balance falls below the minimum balance, there is a service charge of $10.00 for savings accounts and $25.00 for checking accounts. If the balance at the end of the month is at least the minimum balance, the account receives interest as follows:\n"
			+ "a. Savings accounts receive 4% interest.\n"
			+ "b. Checking accounts with balances of up to $5000 more than the minimum balance receive 3% interest; otherwise, the interest is 5%.\n"
			+ "Write a program that reads a customer’s account number (int type), account type (char type; s or S for savings, c or C for checking), minimum balance that the account should maintain, and current balance. The program should then output the account number, account type, current\n"
			+ "EditCoroipaylriegvhitew20h1a1sCdenegmaegdetLheaatraniyngs.uAppllreRsisgehdtscoRnetseenrtvdeode.sMnaoytmnoattebreiaclolypiaefdfe,cstcathneneodv,eorarldlulepalricnaintegde,xinpewriheonlceeo.rCiennpgargte.DLueaertnoineglercetsreornviecsritghhetrsi,gshotmtoertehmirdovpearatdydcitoinotneanltcmonatyenbteastuapnpyretsimseedifrosumbstehqeueeBnotorikghantsdr/eosrteriCcthiaopntsere(sq)u.ireit.\n"
			+ "balance, and new balance or an appropriate error message. Test your program by running it five times, using the following data:\n"
			+ "    46728 S 1000 2700\n" + "    87324 C 1500 7689\n" + "    79873 S 1000 800\n"
			+ "    89832 C 2000 3000\n" + "    98322 C 1000 750\n" + "write junit tests";

	public String readFile(String acct, String ch) {
		boolean found = false;
		try {
			Scanner sc = new Scanner(new File("src/Chapter4/PrExerciseFile/BankData.txt"));

			while (!found) {
					String line = sc.nextLine();
					if (line.contains(acct) && line.contains(ch.toUpperCase())) {
						System.out.println(checkBalance(line));
						found =true;
					}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

		return "";
	}

	public String checkBalance(String data) {
		int minSavingBalance = 2000;
		int minCheckBalance = 1000;
		int savingServiceFee = 10;
		int checkServiceFee = 25;
		String msg ="";
		
		String[] balance= data.split("\\s+");
		
		if (balance[1].equals("S")) {
			 if (Integer.parseInt(balance[3]) > minSavingBalance) {
				  msg = "new monthly balance of $"+ balance[3] +" with 4% interest is : $"+ Integer.parseInt(balance[3]) * (1+0.04);
			 }
			 else {
				 msg = "new balance with service fee is:" + Integer.parseInt(balance[3]) + savingServiceFee;
			 }
		}
		
		else {
			if (Integer.parseInt(balance[3]) > minCheckBalance) {
				 msg = "new monthly of balance $"+ balance[3] +"  with 3% interest is : $"+ Integer.parseInt(balance[3]) * (1+0.03);
			} 
			else {
				 msg = "new balance with service fee is:" + Integer.parseInt(balance[3]) + checkServiceFee;
			}
		}
		
		return msg;
	}

}

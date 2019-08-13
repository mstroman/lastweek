package week6;

import java.util.Scanner;

public class basketball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner reader = new Scanner (System.in);
	String player1 ,player2;
	int num0fBasketballs;
	
	System.out.println("enter player 1 name:");
	player1=reader.next();
	System.out.println("enter player 2 name");
	player2 = reader.next();
	
	System.out.println(" how many shots will each player take ");
	num0fBasketballs= reader.nextInt();
	
	int player1score = player1(num0fBasketballs);
	int player2score = player2(num0fBasketballs);
}
public static int player1(int num0fBasketballs){
	int counter = 1;
	int shotsmade =  0;
	while(counter <= num0fBasketballs) {
		int shot = shootTheBasketBall();
		if (shot>=50) {
			shotsmade++; 
}
}
	return shotsmade;
}
public static int shootTheBasketball() {
	return (int)(Math.random() * 100);
}

}





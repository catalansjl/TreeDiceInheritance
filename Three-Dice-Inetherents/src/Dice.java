
public class Dice {	

public int Throw(int dices) {	
	int total = 0;
	for (int j = dices; j >0; j--){
		int d = (int) (1 + (Math.random() * 6));
		System.out.printf("Dice %d is % d\n", j , d);
		total += d;		
	}
		System.out.printf("%s\n", total);
				return total;
	}
}


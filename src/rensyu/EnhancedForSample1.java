package rensyu;

public class EnhancedForSample1 {

	public static void main(String[] args) {
		int[]scores= {1020,53};
		int sum = 0;
		double average = 0.0;
		
		for(int i=0;i<scores.length;i++) {
			sum = sum+scores[i];
		}

		average =(double) sum/scores.length;
		
		System.out.println("合計点は、"+sum+"点、平均点は、"+average+"点です。");
	}

}

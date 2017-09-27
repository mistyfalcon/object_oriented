import java.util.Scanner;
import java.util.Random;

public class Lord_ba_is_lucky
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		double sum = 0.00;
		int num = 0;
		double min = 0.01;
		System.out.println("please input the number of money");
		sum = scan.nextDouble();
		while(1==1)
		{
			if(sum<0.01) {
				System.out.println("the number should be positive");
				sum = scan.nextDouble();
			}
			else if(sum>1000.00) {
				System.out.println("the number should be less than 1000");
				sum = scan.nextDouble();
			}
			else break;
		}
		//System.out.printf("%.2f\n",sum);
		System.out.println("please input the number of people");
		num = scan.nextInt();
		while(1==1)
		{
			if(num<=0) {
				System.out.println("the number should be positive");
				num = scan.nextInt();
			}
			else if(num>100) {
				System.out.println("the number should be less than 100");
				num = scan.nextInt();
			}
			else if(min*num>sum){
				System.out.println("single red packet should be 0.01 yuan at least");
				num = scan.nextInt();
			}
			else break;
		}
		//System.out.println(num);
		int i;
		double temp;
		Random random = new Random();
		for(i=1;i<=num-1;i++)
		{
			double max = (sum-min*(num-i))*100.00;
			int maxi = (int)max;
			temp = (double)random.nextInt(maxi)/100.00+0.01;
			System.out.printf("red packet %d  %.2f yuan\n",i,temp);
			sum-=temp;
		}
		System.out.printf("red packet %d  %.2f yuan\n",i,sum);
	}
}
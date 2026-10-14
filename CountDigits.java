import java.util.*;
class Solution{

public static int answer(int num){
	int count=0;
	if (num==0){
	return 1;
	}
	num=Math.abs(num);
	while(num> 0){
	num= num/10;
	count++;
	}
	return count;
	}

}

class DailyPractice{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int num= sc.nextInt();
	
	int result =Solution.answer(num);
	System.out.println("Total digits in number is: "+result);



	}
}

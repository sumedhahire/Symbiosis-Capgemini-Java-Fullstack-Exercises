import java.lang.Math;

class armstrong{

	public static void main(String... args){
		
		int length=args[0].length();
		
		int num=Integer.parseInt(args[0]);
		
		int sum=0,temp=num;
		while(num>0){
			sum+=Math.pow(num%10,length);
			num/=10;
		}
		
		if(temp==sum)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}
}

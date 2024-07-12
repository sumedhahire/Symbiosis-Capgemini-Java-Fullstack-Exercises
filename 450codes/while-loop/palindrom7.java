public class Main {
    
        public static void main(String[] args) {
            int num=123;
            int sum=0;
            int temp=0;
            int hello=num;
            while(num>0){
                sum=sum*10;
                temp=num%10;
                sum=sum+temp;
                num/=10;
            }
            if(num==sum)
                System.out.println("palindrom");
            else
                System.out.println("not palindrom");
            
            
        }
}

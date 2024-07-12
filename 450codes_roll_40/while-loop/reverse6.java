public class reverse6 {
    
        public static void main(String[] args) {
            int num=123;
            int sum=0;
            int temp=num;
            int hello=0;
            while(num>0){
                sum=sum*10;
                temp=num%10;
                sum=sum+temp;
                num/=10;
            }
            System.out.println(sum);
            
            
        }
}

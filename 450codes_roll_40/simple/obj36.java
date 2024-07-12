//How to Create Objects in Java

public class obj36 {
    int a;
    String str;

    public void getData(){
        System.out.println("a:"+a+" "+"str:"+str);
    }
    
    public static void main(String[] args) {
        Main obj=new Main();
        obj.a=53;
        obj.str="sumedh";
        obj.getData();
    }
}

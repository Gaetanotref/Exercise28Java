public class Main {
    public static void main(String[] args) {
        int a=15;
        a+=5;
        a-=4;
        int b=a;
        b++;

        if((b%2==0)&&((b*(b=+1))%3==0)){
            System.out.println("Both are true");
        }else{
            System.out.println("One or both aren't true");
        }
    }
}
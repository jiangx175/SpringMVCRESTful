import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个正整数a,b(1<=a,b<=10000)：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r,x;
        if((a>=1 && a<=10000) && (b>=1 && b<=10000)){
            if(a<b){
                x=a;
                a=b;
                b=x;
            }
            r = a%b;
            while (r != 0){
                a = b;
                b = r;
                r = a%b;
            }
            System.out.println("a和b的最大公约数是:" + b);
        }else{
            System.out.println("输入不合法.");
        }
    }
}
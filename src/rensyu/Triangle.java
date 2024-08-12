package rensyu;

public class Triangle {

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;

    if(a==b&&b==c&&c==a) {
        System.out.println("正三角形です");
    }else if(a==b||b==c||c==a) {
        System.out.println("二等辺三角形です");
    }else {
        System.out.println("不等辺三角形です");
    }

    }

}

package Exercicio9_2;

public class Test {

    public static void main(String[] args) {
        Handler h9 = new Handler("h9");
        Handler h8 = new Handler(h9, "8");
        Handler h7 = new Handler(h8, "7");
        Handler h6 = new Handler(h7, "6");
        Handler h5 = new Handler(h6, "5");
        Handler h4 = new Handler(h5, "4");
        Handler h3 = new Handler(h4, "3");
        Handler h2 = new Handler(h3, "2");
        Handler h1 = new Handler(h2, "1");

        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
        h1.doing();
    }

}
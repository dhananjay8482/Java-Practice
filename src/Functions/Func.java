package Functions;

//Functions and Modules

public class Func {

    public static void main(String[] args) {
        greet();
        int ans =  sum(5,10);
        System.out.println("Answer: "+ans);
        ans =  sum(5,10,12);
        System.out.println("Answer: "+ans);
    }
    static void greet() {
        System.out.println("Hello World!");
    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }



}

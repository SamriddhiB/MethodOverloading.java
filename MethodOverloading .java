/*Develop a Program that illustrate method overloading concept. */

class MethodOverloading {
    private static void show(int a){
        System.out.println(a);
    }

    private static void show(int a, int b){
        System.out.println(a + " and " + b);
    }
    private static void show(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        show(1);
        show("seven");
        show(1, 2);
    }
}
public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String a = "asdfgh";
        int mid = a.length()/2;
        String a1 = a.substring(0, mid);
        String a2 = a.substring(mid);
        System.out.println(a1);
        System.out.println(a2);
    }
}
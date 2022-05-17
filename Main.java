public class Main {
    public static void main(String[] args) {
        
        Time1 t1 = new Time1();
        Time1 t2 = new Time1();
        
        t1.setTime(18, 28,37);
        t2.setTime(7, 31, 57);

        System.out.println("Primeiro relógio:");
        System.out.println(t1.toUniversalString());
        System.out.println(t1.toString());
        System.out.println("Segundo relógio:");
        System.out.println(t2.toUniversalString());
        System.out.println(t2.toString());

    }
}

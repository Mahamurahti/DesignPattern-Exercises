package prototype;

public class Main {
    public static void main(String[] args){
        Clock clock1 = new Clock("Clock 1", 0, 0, 0);

        for (int i = 0; i <= Math.round(Math.random() * 1000); i++)
            clock1.time();

        Clock clock2 = (Clock) clock1.deepCopy();
        clock2.setName("Clock 2 (deep)");

        System.out.println("\nA deep copy of Clock 1 has been made as Clock 2\n");

        for (int i = 0; i <= Math.round(Math.random() * 1000); i++)
            clock2.time();
        for (int i = 0; i <= Math.round(Math.random() * 1000); i++)
            clock1.time();
        for (int i = 0; i <= Math.round(Math.random() * 1000); i++)
            clock2.time();

        Clock clock3 = (Clock) clock1.shallowCopy();
        clock3.setName("Clock 3 (shallow)");

        System.out.println("\nA shallow copy of Clock 1 has been made as Clock 3\n");

        for (int i = 0; i <= Math.round(Math.random() * 1000); i++)
            clock3.time();
        for (int i = 0; i <= Math.round(Math.random() * 1000); i++)
            clock1.time();
        for (int i = 0; i <= Math.round(Math.random() * 1000); i++)
            clock3.time();

        System.out.println("\nCheck time of all clocks:\n");

        System.out.println(clock1.displayTime());
        System.out.println(clock2.displayTime());
        System.out.println(clock3.displayTime());
    }
}

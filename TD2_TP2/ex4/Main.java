package TD2_TP2.ex4;

public class Main {
    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Chronometer chrono=new Chronometer();
        System.out.println(chrono.getTime());
        chrono.start();
        delay(100);
        System.out.println(chrono.getTime ());
        delay(100);
        delay(100);
        chrono.stop();
        System.out.println(chrono.getTime ());
        delay(100);
        try	{
            chrono.throwExecption();
        } catch (Exception e)	{
            System.out.println("there was an exception : " + e.getMessage());
        }
        chrono.start();
        delay(100);
        chrono.stop();
        System.out.println(chrono.getTime ());
        chrono.raz();
        System.out.println(chrono.getTime ());
    }
}

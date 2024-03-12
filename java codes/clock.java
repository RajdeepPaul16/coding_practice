import java.time.Clock;

public class clock {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        Clock cl = Clock.systemUTC();
        System.out.println(c.getZone());
        System.out.println(cl.instant());
    }    
}

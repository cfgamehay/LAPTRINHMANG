import java.net.InetAddress;

public class ViDu {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("www.facebook.com");
            System.out.println(ia.getAddress());
            //tra ve doi tuong
            System.out.println(ia.getHostAddress());
            //tra ve ip
            System.out.println(ia.getCanonicalHostName());
            //tra ve ip
            System.out.println(ia.getHostName());
            //tra ve domain
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

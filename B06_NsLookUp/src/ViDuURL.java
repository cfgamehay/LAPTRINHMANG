import java.net.URL;

public class ViDuURL {
    public static void main(String[] args) {
        try{
            URL u = new URL("https://youtu.be/OLWHhxjU2aE");
            System.out.println("Prototol"+u.getProtocol());
            System.out.println("Protocol: "+u.getHost());
            System.out.println("Port: "+u.getPort());
            System.out.println("File: "+u.getFile());
            System.out.println("Ref: "+u.getRef());

        }catch (Exception e)
        {
            System.out.println("error");
        }
    }
}

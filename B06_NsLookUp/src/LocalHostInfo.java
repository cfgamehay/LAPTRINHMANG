import java.net.InetAddress;
import java.util.Scanner;

public class LocalHostInfo {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        do{



                try{
                    InetAddress ia = InetAddress.getLocalHost();
                    System.out.println("ip: "+ia.getHostAddress());
                    System.out.println("domain: "+ia.getHostName());
                    System.out.println("Reachable: "+ia.isReachable(120));
                    System.out.println("MulticastAddress: "+ia.isMulticastAddress());
                    System.out.println("SiteLocalAddress: "+ia.isSiteLocalAddress());

                    byte[] address = ia.getAddress();
                    for (int i = 0; i < address.length; i++) {
                        System.out.println(address[i]);
                    }
                }catch (Exception e)
                {
                    System.out.println("có lỗi đã xảy ra! vui lòng nhập lại.");
                }

                System.out.println("Nhập 'exit' để thoát:");
                input = sc.nextLine();
        if(input.equals("exit") )
        {  break;          }

        }while(true);
    }
}

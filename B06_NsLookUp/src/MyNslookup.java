import java.net.InetAddress;
import java.util.Scanner;

public class MyNslookup {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập domain name hoặc ip để tìm kiếm ");
            System.out.println("Nhập 'exit' để thoát:");

            input = sc.nextLine();

            if(!input.equals("exit") )
            {
                try{
                    InetAddress ia = InetAddress.getByName(input);
                    System.out.println("ip: "+ia.getHostAddress());
                    System.out.println("domain: "+ia.getHostName());
                    System.out.println("Reachable: "+ia.isReachable(120));
                    System.out.println("MulticastAddress: "+ia.isMulticastAddress());
                    System.out.println("SiteLocalAddress: "+ia.isSiteLocalAddress());


                }catch (Exception e)
                {
                    System.out.println("có lỗi đã xảy ra! vui lòng nhập lại.");
                }
            }else
            {
                break;
            }

        }while(true);
    }
}

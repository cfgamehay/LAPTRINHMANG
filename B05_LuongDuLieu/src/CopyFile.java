import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(String src, String dest){
        Scanner sc = new Scanner(System.in);
        //tao file o vi tri moi
        File fileSrc = new File(src);
        File fileDest = new File(dest);

        try {
            if (!fileSrc.exists()) {
                System.out.println("File muốn copy không tồn tại");
            } else {
                if (fileDest.exists()) {
                    System.out.println("File đã tồn tại! Bạn có muốn ghi đè?(y/n)");
                    String c = sc.nextLine();
                    if (c.equals("n")) {
                        return;
                    }
                }else{
                    fileDest.createNewFile();
                }
//doc du lieu file cu qua file moi

                // Tao stream de doc du lieu
                FileInputStream fis = new FileInputStream(fileSrc);
                // Tao stream ghi du lieu
                FileOutputStream fos = new FileOutputStream(fileDest);
                // Copy tung byte
                int b = 0;

                while (true) {
                    b = fis.read();
                    if (b == -1) {
                        break;
                    }
                    fos.write(b);
                    fos.flush();
                }
                fis.close();
                fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

public static void copyFileArr(String src, String dest) {
    Scanner sc = new Scanner(System.in);
    File fileSrc = new File(src);
    File fileDest = new File(dest);

    try {
        if (!fileSrc.exists()) {
            System.out.println("File muốn copy không tồn tại");
        } else {
            if (fileDest.exists()) {
                System.out.println("File đã tồn tại! Bạn có muốn ghi đè?(y/n)");
                String c = sc.nextLine();
                if (c.equals("n")) {
                    return;
                }
            } else {
                fileDest.createNewFile();
            }

            FileInputStream fis = new FileInputStream(fileSrc);
            FileOutputStream fos = new FileOutputStream(fileDest);

            byte[] arr = new byte[1024*1024];
            while (true)
            {
                int n = fis.read(arr); // Doc mot mang 1MB
                if(n==-1) break; // =-1 khi khong co du lieu de doc
                fos.write(arr,0,n);// Doc duoc bao nhieu thi ghi dung bay nhieu du lieu
                fos.flush();
            }
            fis.close();
            fos.close();

        }
    }catch (IOException e)
    {
        e.printStackTrace();
}
}
    public static void main(String[] args) {
        String src = "C:\\Users\\pc\\Videos\\video.mp4";
        String dest ="E:\\okok\\video.mp4";
        //copyFile(src,dest);
        copyFileArr(src, dest);
    }
}

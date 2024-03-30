import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        try {
            String dest = "E:\\okok\\output.txt";
            // Tạo file
            File file = new File(dest);
            if (!file.exists())
                file.createNewFile();

            // PrintWriter
            PrintWriter pw = new PrintWriter(file, "UTF-8");

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập dữ liệu thành từng dòng để ghi ra file: ");
            System.out.println("Nhập exit để thoát");
            while(true){
                String line = sc.nextLine();
                if (line.equals("exit")) break;
                pw.println(line);
                pw.flush();
            }
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

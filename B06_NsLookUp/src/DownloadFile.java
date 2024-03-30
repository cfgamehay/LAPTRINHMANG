import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFile {
    public static void main(String[] args) {
        String fileURL = "https://vcdn-giaitri.vnecdn.net/2024/03/30/tai-xuong-11-8170-1711780755.png";
        String saveDir = "E:\\download";

        try
        {
            URL url = new URL(fileURL);
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            String fileName = fileURL.substring(fileURL.lastIndexOf("/")+1);
            File directory = new File(saveDir);
            if(!directory.exists()){
                directory.mkdirs();
            }

            FileOutputStream fos = new FileOutputStream(saveDir + File.separator +fileName);
            int bytesRead;
            byte[] buffer = new byte[4096];
            while((bytesRead=is.read(buffer))!=-1){
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File download successfully!");
            fos.close();
            is.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

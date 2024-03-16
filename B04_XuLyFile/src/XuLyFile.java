import java.io.File;

public class XuLyFile {


    public static void taoThuMuc(String path)
    {
        //khai bao thu muc
        File file = new File(path);


        if(file.exists())
        {
            System.out.println("thư mục đã tồn tại");
        }else
        {
            //make a directory
            //file.mkdir();
            //make directorys
            file.mkdirs();
        }
    }
    public static void taoTapTin(String path)
    {
        File file = new File(path);

        if(file.exists())
        {
            System.out.println("tâp tin đã tồn tại");
        }else{
            try{
                file.createNewFile();
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void  xoaFile(String path)
    {
        xoaTatCa(path);
    }

    public static void xoaTatCa(String path)
    {
        File file= new File(path);
        File[] mangCon = file.listFiles();
        if(file.isDirectory() && file.exists())
        {

            for(File f: mangCon)
            {
                xoaTatCa(f.getAbsolutePath());
            }

        }
            file.delete();
    }

    public static void hienThiCayThuMuc(String path, int level)
    {
        for(int i =0; i<level;i++)
        {
            System.out.print("--");
        }
        level++;
        File file = new File(path);
        if(file.isFile())
        {
            System.out.println(file.getName());
        }
        else if(file.isDirectory()) {
            System.out.println(file.getName());
            File[] mangCon = file.listFiles();
            for (File f : mangCon) {
                hienThiCayThuMuc(f.getAbsolutePath(), level+1);
            }
        }

    }

    public static void kiemTraThongTin(String path)
    {
        File file = new File(path);
        if(!file.exists())
        {
            System.out.println("thư mục không tồn tại");
            return;
        }

        System.out.println("Thông tin");
        System.out.println("Tên file: "+file.getName());
        System.out.println("Loại: "+ ((file.isFile())?"tệp tin": "thư mục"));
        System.out.println("File đang ẩn: "+ file.isHidden());
    }
}

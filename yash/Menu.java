// 1 file name
// 2 file path
// 3 file can read
// 4 file can writw
// 5 file write
// 6 file read
// 7 file rename
// 8 file delete
// 9 exit

import java.util.*;
import java.io.*;

class First
{
    Scanner sc = new Scanner(System.in);
    String f_nm,f_path;

    void File_create() throws Exception
    {
        System.out.print("Enter File Name : " );
        f_nm = sc.nextLine();
         // System.out.println(f_nm);
        f_path = "D:\\Yash\\java\\";
        try
        {
            // File f = new File("D:\\Yash\\java"+f_nm);
            File myObj = new File(f_path+f_nm);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    void File_name()
    {
        System.out.println("File Name => "+f_nm);
    }
    void File_path()
    {
        System.out.println("File Path => "+f_path);
    }
    void File_canread()
    {
        // Boolean f_c_read;
        if(myObj.canRead())
            System.out.println("File can Read..");
        else
            System.out.println("File Can Not Read..");
    }
    void File_canwrite()
    {
        // Boolean f_c_write;
        if(myObj.canWrite())
            System.out.println("File can Write..");
        else
            System.out.println("File Can Not Write..");
    }
    void File_write()
    {
        System.out.println("File write");
    }
    void File_read()
    {
        System.out.println("File Read");
    }
    void File_rename()
    {
        System.out.println("File rename");
    }
    void File_delete()
    {
        System.out.println("File delete");
    }
}


class Menu
{
    public static void main(String[] args) throws Exception
    {
        First f_obj = new First();
        Scanner sc = new Scanner(System.in);
        // fir.File_create();

        while(true) 
        {
            System.out.println(" 1. Create a New File");
            System.out.println("2. File Name");
            System.out.println("3. File Path");
            System.out.println("4. File Can Read");
            System.out.println("5. File Can Write");
            System.out.println("6. File Write");
            System.out.println("7. File Read");
            System.out.println("8. File Raname");
            System.out.println("9. File Delete");
            System.out.println("10. Exit");
            
            int a;
            System.out.print("Enter Choice : ");
            a = sc.nextInt();
            // sc.nextLine();

            
            switch(a)
            {
                case 1:
                    f_obj.File_create();
                    break;
            case 2 :
                f_obj.File_name();
                break;
            case 3 :
                f_obj.File_path();
                break;
            case 4 :
                f_obj.File_canread();
                break;
            case 5 :
                f_obj.File_canwrite();
                break;
            case 6 :
                f_obj.File_write();
                break;
            case 7 :
                f_obj.File_read();
                break;
            case 8 :
                f_obj.File_rename();
                break;
            case 9 :
                f_obj.File_delete();
                break;
            case 10 :
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter 1 to 10 ..");
            }
        }
    }

}
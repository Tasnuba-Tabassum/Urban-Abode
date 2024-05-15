import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Account {
    private String fullName;
    private String nID;
    private String userEmail;
    private String MobileNum;
    private String userPassword;
    private File file;
    private FileWriter writer;
    private Scanner sc;

    //Empty Constructor
    public Account()
    {
        this.fullName="";
    }

    public Account(String fullName,String nID,String userEmail,String MobileNum,String userPassword)
    {
        this.fullName=fullName;
        this.nID=nID;
        this.userEmail=userEmail;
        this.MobileNum=MobileNum;
        this.userPassword=userPassword;
    }

    //setter & getter
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setnID(String nID) {
        this.nID = nID;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public void setMobileNum(String MobileNum) {
        this.MobileNum = MobileNum;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getFullName() {
        return fullName;
    }
    public String getnID() {
        return nID;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public String getMobileNum() {
        return MobileNum;
    }
    public String getUserPassword() {
        return userPassword;
    }

    public void addAccount()
    {
        try
        {
            file = new File("bin\\files\\Users.txt.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getUserEmail()+"\t");
            //writer.write(getUserName()+"\t");
            writer.write(getUserPassword()+"\t");
            writer.write(getnID()+"\t");
            writer.write(getMobileNum()+"\t");
            writer.write(getFullName()+"\t");
            writer.write("0\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public boolean getAccount(String userEmail,String userPassword)
    {
        boolean isAuth = false;
        String path ="bin\\files\\Users.txt.txt";
        file = new File(path);
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if(value[0].equals(userEmail) && value[1].equals(userPassword))
                {
                    isAuth=true;
                }
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return isAuth;
    }

}


import java.net.*;
import java.util.*;
import java.io.*;
class echoserver1
{
 public static void main(String arg[])throws Exception
{
 ServerSocket ss=new ServerSocket(1024);
 Socket s=ss.accept();
 if(s.isConnected()==true)
   System.out.println("clientsis succesfuly");
InputStream IS=s.getInputStream();
Scanner sc=new Scanner(IS);
String str=" ";
OutputStream os=s.getOutputStream();
PrintStream pc=new PrintStream(os);
Scanner sci=new Scanner(System.in);
while(!str.equals("stop"))
{
 str=sc.next();
 System.out.println(str);
  pc.println(str);
}
}
}
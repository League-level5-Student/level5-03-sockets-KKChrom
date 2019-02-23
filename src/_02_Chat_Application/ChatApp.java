package _02_Chat_Application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ChatApp {
public static void main(String[] args) {
	{
		new ChatApp();
	}
	public ChatApp()
	{
		String ip = "127.00.0.1";
		int p = 8080;
		Socket s = new Socket(ip,p);
		DataOutputStream d =  (DataOutputStream) s.getOutputStream();
 d.writeUTF("yes");
 DataInputStream i = (DataInputStream) s.getInputStream();
 i.readUTF();
 s.close();
	}
}
}


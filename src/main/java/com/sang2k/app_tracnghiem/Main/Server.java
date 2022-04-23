/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang2k.app_tracnghiem.Main;

import com.sang2k.app_tracnghiem.Dao.BoDeDao;
import com.sang2k.app_tracnghiem.entity.BoDe;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 *
 * @author Yahiko
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        ServerSocket  server = new ServerSocket(9999);
        System.out.println("Server is running ") ;
        while (true)
        {
            Socket sclient = server.accept();
            DataInputStream DTT=new DataInputStream(sclient.getInputStream());
            DataOutputStream OTT=new DataOutputStream(sclient.getOutputStream());
            ObjectInputStream OIS = new ObjectInputStream(sclient.getInputStream()) ;
            ObjectOutputStream OOS = new ObjectOutputStream(sclient.getOutputStream());
            int flag=DTT.readInt();
            if (flag==1)
            {
                List<BoDe> stu =(List<BoDe>) OIS.readObject();
                for (BoDe bd:stu)
                {
                    System.out.println(bd.getChoose());   
            }
        }
        }
}
}

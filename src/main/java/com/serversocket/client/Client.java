package com.serversocket.client;

import com.serversocket.entity.Message;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName Client
 * @Description
 * @Author wcx
 * @Date 2019/04/29 15:18
 * @Version
 **/
@Component
public class Client {

    /**
     * 客户端账号
     */
    private Long account =1192274716L;

    /**
     * 客户端对象
     */
    private Socket socket;

    /**
     * 获取服务器转发过来消息的流
     */
    private ObjectInputStream ois;

    /**
     * 连接服务器时，用来传递客户端名到服务器的流
     */
    private ObjectOutputStream os;

    /**
     * 发送消息的流
     */
    private ObjectOutputStream oos;

    /*public Client(Long account){
        this.account = account;
    }*/

    public Long getAccount() {
        return account;
    }

    public Socket getSocket(long account) throws IOException {
        socket = new Socket("127.1.1.0", 8888);
        os = new ObjectOutputStream(socket.getOutputStream());
        os.writeObject(account);
        return socket;
    }

    public void receiveMsg(Socket socket){
        //接收返回数据
        new Thread(){
            @Override
            public void run(){
                try{
                    while(true){
                        //获取服务器转发过来的消息
                        ois = new ObjectInputStream(socket.getInputStream());
                        Message msg = (Message) ois.readObject();
                        System.out.println(msg.getSendMsgTime() + "  " +msg.getSendMsgUserName() + "说：" + msg.getSendMsgContent());

                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }.start();

    }

    public void scoketStart(){
        try{
            socket = new Socket("127.1.1.0", 8888);
            os = new ObjectOutputStream(socket.getOutputStream());
            os.writeObject(account);

            //接收返回数据
            new Thread(){
                @Override
                public void run(){
                    try{
                        while(true){
                            //获取服务器转发过来的消息
                            ois = new ObjectInputStream(socket.getInputStream());
                            Message msg = (Message) ois.readObject();
                            System.out.println(msg.getSendMsgTime() + "  " +msg.getSendMsgUserName() + "说：" + msg.getSendMsgContent());

                        }
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();

            //发送消息
            oos = new ObjectOutputStream(socket.getOutputStream());
            while(true){
                String msg = new Scanner(System.in).nextLine();
                Message message = new Message();
                message.setSendMsgUserPort(socket.getLocalPort());
                System.out.print("输入接收消息的客户端账号：");
                //int id = new Scanner(System.in).nextInt();
                long targetAccount = new Scanner(System.in).nextLong();
                //message.setTargetPort(id);
                message.setSendMsgUserAccount(account);
                message.setReceiveMsgUserAccount(targetAccount);
                message.setSendMsgContent(msg);
                message.setSendMsgTime(new Date());
                oos.writeObject(message);
                System.out.println("已发送");
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //关闭流和连接
            try {
                os.close();
                ois.close();
                oos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

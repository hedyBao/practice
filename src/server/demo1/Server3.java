package server.demo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    private ServerSocket server;
    public static final String CRLF="\r\n";
    public static final String BLANK=" ";

    public static void main(String[] args) {
        Server3 server= new Server3();
        server.start();
        server.recieve();

    }


    //启动方法
    public  void start(){
        try{
            server= new ServerSocket(8888);
            this.recieve();
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
    //接收客户端
    private void recieve(){
        try {
            Socket client= server.accept();
            //针对post请求方式的表单
            byte[] data= new byte[20480];
            int len= client.getInputStream().read(data);
            //接收客户端的请求信息
            String requestInfo= new String(data, 0 ,len).trim();
            System.out.println(requestInfo);

            //响应
            StringBuilder responseContext= new StringBuilder();
            responseContext.append("<html></html>");

            StringBuilder response= new StringBuilder();
            //1) 协议版本、状态码、描述
            response.append("协议版本").append(BLANK).append("200").append(BLANK).append("描述").append(CRLF);
            //2) 响应头
            response.append("...");
            response.append("...");
            //字节长度：
            response.append("Context-len").append(responseContext.toString().getBytes().length).append(CRLF);
            // 3) 正文之前
            response.append(CRLF);

            // 4) 正文
            response.append(responseContext);

            // 4) 输出流
            BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            bw.write(response.toString());
            bw.flush();
            bw.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //停止服务器
    public void stop(){

    }
}


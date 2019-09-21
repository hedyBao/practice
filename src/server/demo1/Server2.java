//package server.demo1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class Server2 {
//    private ServerSocket server;
//
//    public static void main(String[] args) {
//        Server server= new Server();
//        server.start();
//        server.recieve();
//
//
//    }
//
//
//    //启动方法
//    public  void start(){
//        try{
//            server= new ServerSocket(8888);
//            this.recieve();
//        }catch (IOException e ){
//            e.printStackTrace();
//        }
//    }
//    //接收客户端
//    private void recieve(){
//        try {
//            Socket client= server.accept();
//            //针对post请求方式的表单
//            byte[] data= new byte[20480];
//            int len= client.getInputStream().read(data);
//            //接收客户端的请求信息
//            String requestInfo= new String(data, 0 ,len).trim();
//            System.out.println(requestInfo);
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//    //停止服务器
//    public void stop(){
//
//    }
//}

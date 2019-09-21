package server.demo1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Response {
    //两个常量
    public static final String CRLF="\r\n";
    public static final String BLANK=" ";
    //正文
    private StringBuilder content;
    //流
    private BufferedWriter bw;

    //存储头信息
    private StringBuilder headInfo ;
    //存储正文长度
    private int len=0;
    public Response(){
        headInfo= new StringBuilder();
        content = new StringBuilder();
        int len=0;
    }

    public Response(OutputStream os){
        this();
        bw= new BufferedWriter(new OutputStreamWriter(os));

    }

    //构建响应头
    private void createHeadInfo(int  code){
        //1) 协议版本、状态码、描述
        headInfo.append("协议版本").append(BLANK).append(code).append(BLANK);
        switch (code){
            case 200:
                headInfo.append("Ok");
                break;
            case 404:
                headInfo.append("Not found");
                break;
        }
        headInfo.append(CRLF);
        //2) 响应头
        headInfo.append("...").append(CRLF);
        headInfo.append("...").append(CRLF);
        //字节长度：
        headInfo.append("Context-len").append(len).append(CRLF);
        // 3) 正文之前
        headInfo.append(CRLF);

        // 4) 正文
        headInfo.append("Context-length:").append(len).append(CRLF);
        headInfo.append(CRLF);

    }
    // 构建正文+enter
    public Response println(String info){
        content.append(info).append(CRLF);
        len+=(info+CRLF).getBytes().length;
        return this;
    }
    // 推送到客户端
    void pushToClient(int code) throws IOException {

        createHeadInfo(code);
        // 头信息+分隔符
        bw.append(headInfo.toString());
        // 正文
        bw.append(content.toString());
        bw.flush();
    }

    public void close(){

    }





}

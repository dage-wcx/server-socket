package com.serversocket.util;

import com.serversocket.util.WebContext;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * @Auther: creep
 * @Date: 2019/4/9 10:54
 * @Description:
 */
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class JsonResponse implements Serializable {

    private static final long serialVersionUID = 9024462031856060619L;

    private int code;

    private String msg;

    private Object data;
    
    public JsonResponse() {
		super();
	}

	public JsonResponse(int code, String msg){
        super();
        this.code = code;
        this.msg = msg;
    }

    public JsonResponse(int code, String msg, Object data){
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonResponse(int code){
        super();
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}

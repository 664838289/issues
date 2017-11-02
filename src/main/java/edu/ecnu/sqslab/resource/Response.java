package edu.ecnu.sqslab.resource;

/**
 * @author Mr.Yuan
 * @since 2017/8/20
 */
public class Response<T> {
    public static final int CODE_OK = 200;
    public static final int CODE_FAILED = 0;
    private int code;
    private String msg;
    private T data;

    private Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Response(int code, T data) {
        this.code = code;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Response<T> code(int code) {
        this.code = code;
        return this;
    }

    public Response<T> msg(String msg) {
        this.msg = msg;
        return this;
    }

    public Response<T> data(T data) {
        this.data = data;
        return this;
    }

    public static <T> Response<T> ok(T t) {
        return ok(CODE_OK, t);
    }

    public static <T> Response<T> ok() {
        return ok(CODE_OK, null);
    }

    public static <T> Response<T> ok(int code, T t) {
        return new Response(code, t).msg("ok");
    }

    public static <T> Response<T> failed(String msg) {
        return new Response(CODE_FAILED, msg);
    }

    public static Response failed(String msg, int result) {
        return new Response(result, msg);
    }
}

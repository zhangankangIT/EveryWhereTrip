package com.example.zhangshaohang.net;

public interface ResultCallBack<T> {
    void onSuccess(T bean);
    void onFail(String msg);
}

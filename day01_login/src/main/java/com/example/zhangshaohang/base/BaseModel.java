package com.example.zhangshaohang.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;



public class BaseModel {
    protected CompositeDisposable mCompositeDisposable;

    public void onDestory() {
        //切换所有的Disposable对象
        mCompositeDisposable.clear();
    }

    public void addDisposable(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }
}

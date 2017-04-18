package com.test.firstlinecode;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.test.firstlinecode.utils.BindView;

/**
 * Created by asdf on 2017/4/18.
 */

public abstract class BaseActivity extends Activity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutID());
        BindView.load(this);
        tv = (TextView) findViewById(R.id.titbar_tv);
        if(setTitle() == null){
            tv.setVisibility(View.GONE);
        }else{
            tv.setText(setTitle());
        }
        this.doSomething();
    }
    public abstract int setLayoutID();
    public abstract String setTitle();
    public abstract void doSomething();

}

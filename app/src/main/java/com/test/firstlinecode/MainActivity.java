package com.test.firstlinecode;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.test.firstlinecode.utils.InitID;

public class MainActivity extends BaseActivity {
    @InitID(R.id.main_lv)
    private ListView lv;
    @Override
    public int setLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public String setTitle() {
        return "第一行代码";
    }

    @Override
    public void doSomething() {
        final String[] strs = {"第12章 最佳的UI体验---Material Design实战"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.textview,strs);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                switch (i){
                    case 0:
                        intent = new Intent(MainActivity.this,Chapter12_Activity.class);
                        intent.putExtra("title",strs[i]);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

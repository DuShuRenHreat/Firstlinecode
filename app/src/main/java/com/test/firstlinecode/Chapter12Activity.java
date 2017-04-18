package com.test.firstlinecode;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.test.firstlinecode.utils.InitID;

public class Chapter12Activity extends BaseActivity {
    @InitID(R.id.chapter12_lv)
    private ListView lv;
    @Override
    public int setLayoutID() {
        return R.layout.activity_chapter12;
    }

    @Override
    public String setTitle() {
        String title = getIntent().getStringExtra("title");
        return title;
    }

    @Override
    public void doSomething() {
        final String[] strs = {"12.2 Toolbar"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.textview,strs);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                }
            }
        });
    }

}

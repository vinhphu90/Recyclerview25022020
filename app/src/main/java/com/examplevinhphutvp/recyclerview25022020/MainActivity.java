package com.examplevinhphutvp.recyclerview25022020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerviewUser;
    UserAdapter mUserAdapter;
    ArrayList<User> mUserArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerviewUser = findViewById(R.id.Recyclerview);
        mUserArrayList = new ArrayList<>();
        mUserAdapter = new UserAdapter();
        mRecyclerviewUser.setItemViewCacheSize(20);
        mRecyclerviewUser.setHasFixedSize(true);
        mRecyclerviewUser.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mRecyclerviewUser.setAdapter(mUserAdapter);



        //cập nhật dữ liệu
        mUserArrayList.add(new User("Nguyen van A",10,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van B",11,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van C",12,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van D",13,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van E",14,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van F",15,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van G",16,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van H",17,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van E",18,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van K",19,R.mipmap.ic_launcher));
        mUserArrayList.add(new User("Nguyen van M",20,R.mipmap.ic_launcher));

        mUserAdapter.submitData(mUserArrayList);

        mUserAdapter.addItem(new User("Nguyen Van N",21,R.mipmap.ic_launcher));

    }

}

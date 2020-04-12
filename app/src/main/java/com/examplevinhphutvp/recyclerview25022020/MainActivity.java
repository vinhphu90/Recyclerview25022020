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
       mUserArrayList.add(new User("Bánh Mì","Bate", R.drawable .hinh_banh_mi, "20.000VND"));
       mUserArrayList.add(new User("Bánh Khọt","Tôm Đậu", R.drawable .hinh_mon_banh_khot, "50.000VND"));
       mUserArrayList.add(new User("Bìg Ngói Chiên","Giòn Giòn", R.drawable.hinh_mon_bi_ngoi_chien_xu, "100.000VND"));
       mUserArrayList.add(new User("Bún Mắm", "Miền Tây", R.drawable.hinh_mon_bun_mam, "30.000VND"));
       mUserArrayList.add(new User("Bún Rêu", "Cua Đồng", R.drawable.hinh_mon_bun_reu, "40.000VND"));
       mUserArrayList.add(new User("Cua Biển", "Rang Me", R.drawable.hinh_mon_cua,"900.000VND"));

        mUserAdapter.submitData(mUserArrayList);



    }

}

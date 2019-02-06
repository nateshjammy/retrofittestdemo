package com.example.admin.retrofittestdemo;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.admin.retrofittestdemo.Adapter.NotificationAdapter;
import com.example.admin.retrofittestdemo.Pojo.NotificationListpojo;
import com.example.admin.retrofittestdemo.Retrofit.ApiClient;
import com.example.admin.retrofittestdemo.Retrofit.ApiInterface;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private NotificationAdapter notificationAdapter;
    private ApiInterface apiInterface;
    private NotificationListpojo notificationListpojo;


    @BindView(R.id.recyclerview_Notification)
    RecyclerView recyclerview_Notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(MainActivity.this);

        getpaserr();
    }


    private void getpaserr() {

        Map<String, String> requestBody = new HashMap<>();
         requestBody.put("login_key", "S");
         requestBody.put("branch_id", "1");
         requestBody.put("search_str", "");
         requestBody.put("from_date", "14-02-2018");

        apiInterface = ApiClient.getClient().create(ApiInterface.class);


        apiInterface.getNotificationList(requestBody).enqueue(new Callback<NotificationListpojo>() {

            @Override
            public void onResponse(Call<NotificationListpojo> call, Response<NotificationListpojo> response) {
                try {


                    notificationListpojo =  response.body();

                    notificationAdapter = new NotificationAdapter(notificationListpojo);
                    LinearLayoutManager llm = new LinearLayoutManager(MainActivity.this);
                    llm.setOrientation(LinearLayoutManager.VERTICAL);
                    recyclerview_Notification.setLayoutManager(llm);
                    recyclerview_Notification.setAdapter(notificationAdapter);


                } catch (Throwable e) {

                    Toast.makeText(MainActivity.this,"Unable to connect server"+ e.getLocalizedMessage(),Toast.LENGTH_LONG).show();

                }
            }


            @Override
            public void onFailure(Call<NotificationListpojo> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Unable to connect server"+ t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
            }


        });



    }
}

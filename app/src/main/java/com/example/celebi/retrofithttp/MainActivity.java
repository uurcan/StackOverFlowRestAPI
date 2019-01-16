package com.example.celebi.retrofithttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private CustomAdapter adapter;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiUtils.getBaseUrl();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new CustomAdapter(getApplicationContext(), new ArrayList<Items>(0), new CustomAdapter.CustomClickListener() {
            @Override
            public void postOnClick(long id) {
                Toast.makeText(MainActivity.this, "Post id is" + id, Toast.LENGTH_SHORT).show();
            }
        });
        RecyclerView.LayoutManager layoutManager  = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        RecyclerView.ItemDecoration itemDecoration= new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        loadAnswers();

    }

    private void loadAnswers() {
        apiInterface.getData().enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                if(response.isSuccessful()){
                    adapter.updateItems(response.body().getItems());
                    Log.d("MainActivity","posts loaded from API");
                }
                else {
                    int statuscode = response.code();
                }
            }
            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                Log.d("MainActivity","error loading from API");
            }
        });
    }
}

package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private APIService apiService;
    private List<Product> listProduct;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        final RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        Log.d("ak","aaaa");
        apiService = APIUtils.getAPIService();
        apiService.getProduct().enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                listProduct = response.body();
                productAdapter = new ProductAdapter(listProduct,MainActivity.this);
                recyclerView.setAdapter(productAdapter);
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {

            }
        });

        /*listProduct.add(new Product("12","Laptop Macbook Air","19000000","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdNdLIFblDtLaIPJ8AA7_2XMWxGEH-fm_Do54UKghj4irQsKXDdw","Công nghệ CPU:BroadwellLoại CPU:1.8GHz","2"));
        listProduct.add(new Product("12","Laptop Macbook Air","19000000","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrUYQMEsYxZIClN-VlKS4AN6WCHFooU9jj2XU1x9OjITSg7BDVNw","Công nghệ CPU:BroadwellLoại CPU:1.8GHz","2"));
        listProduct.add(new Product("12","Laptop Macbook Air","19000000","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrUYQMEsYxZIClN-VlKS4AN6WCHFooU9jj2XU1x9OjITSg7BDVNw","Công nghệ CPU:BroadwellLoại CPU:1.8GHz","2"));
        listProduct.add(new Product("12","Laptop Macbook Air","19000000","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrUYQMEsYxZIClN-VlKS4AN6WCHFooU9jj2XU1x9OjITSg7BDVNw","Công nghệ CPU:BroadwellLoại CPU:1.8GHz","2"));
        listProduct.add(new Product("12","Laptop Macbook Air","19000000","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrUYQMEsYxZIClN-VlKS4AN6WCHFooU9jj2XU1x9OjITSg7BDVNw","Công nghệ CPU:BroadwellLoại CPU:1.8GHz","2"));
        listProduct.add(new Product("12","Laptop Macbook Air","19000000","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrUYQMEsYxZIClN-VlKS4AN6WCHFooU9jj2XU1x9OjITSg7BDVNw","Công nghệ CPU:BroadwellLoại CPU:1.8GHz","2"));*/



    }

}

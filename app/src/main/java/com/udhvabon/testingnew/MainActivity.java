package com.udhvabon.testingnew;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.Toast;

import com.udhvabon.testingnew.network.ApiClient;
import com.udhvabon.testingnew.network.ApiInterface;
import com.udhvabon.testingnew.pojo.Deals;
import com.udhvabon.testingnew.pojo.DealsResponse;
import com.udhvabon.testingnew.pojo.Meta;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private DealsAdapter dealsAdapter;
    private List<Deals> deals = new ArrayList<>();
    private RecyclerView.LayoutManager mLayoutManager;
    private int previousTotalItemCount = 0;
    private int visibleThrisold = 0;
    private Meta meta;
    private boolean loading = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        dealsAdapter = new DealsAdapter(deals, getApplicationContext());
        mLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(dealsAdapter);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<DealsResponse> call = apiService.getAllDeals(1);

        call.enqueue(new Callback<DealsResponse>() {
            @Override
            public void onResponse(@NonNull Call<DealsResponse> call, @NonNull Response<DealsResponse> response) {

                deals.addAll(response.body().getDeals());
                dealsAdapter.notifyItemRangeInserted(dealsAdapter.getItemCount(), deals.size());
                meta = response.body().getMeta();
                visibleThrisold = deals.size();
            }

            @Override
            public void onFailure(@NonNull Call<DealsResponse> call, @NonNull Throwable t) {
                Log.i("arif", "hhhh"+ t.toString());
            }
        });


        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                int lastVisibleItemPosition = 0;
                final StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) mRecyclerView.getLayoutManager();
                int totalItemCont  = staggeredGridLayoutManager.getItemCount();
                int[] lastVisibleItemPositions = ((StaggeredGridLayoutManager) mLayoutManager).findLastVisibleItemPositions(null);
                // get maximum element within the list
                lastVisibleItemPosition = getLastVisibleItem(lastVisibleItemPositions);

                if (loading && (totalItemCont > previousTotalItemCount)) {
                    loading = false;
                    previousTotalItemCount = totalItemCont;
                }

                if(!loading && (lastVisibleItemPosition + visibleThrisold) > totalItemCont){
                    loadMore();
                    Log.i("arif","I am loaded");
                }

                Log.i("arif", "last visible item positoin: " + lastVisibleItemPosition);
                super.onScrolled(recyclerView, dx, dy);
            }
        });


    }

    public int getLastVisibleItem(int[] lastVisibleItemPositions) {
        int maxSize = 0;
        for (int i = 0; i < lastVisibleItemPositions.length; i++) {
            if (i == 0) {
                maxSize = lastVisibleItemPositions[i];
            } else if (lastVisibleItemPositions[i] > maxSize) {
                maxSize = lastVisibleItemPositions[i];
            }
        }
        return maxSize;
    }

    public void loadMore(){
        loading = true;
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<DealsResponse> call = apiService.getAllDeals(meta.getNext_page());

        call.enqueue(new Callback<DealsResponse>() {
            @Override
            public void onResponse(@NonNull Call<DealsResponse> call, @NonNull Response<DealsResponse> response) {
                Log.i("arif","Loaded More");
                deals.addAll(response.body().getDeals());
                dealsAdapter.notifyItemRangeInserted(dealsAdapter.getItemCount(), deals.size());
                meta = response.body().getMeta();
                visibleThrisold = meta.getPer_page();
                Log.i("arif","Visible Therisold: " + visibleThrisold);
                Toast.makeText(getApplicationContext(), "Loaded More", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<DealsResponse> call, @NonNull Throwable t) {
                Log.i("arif", "hhhh"+ t.toString());
            }
        });
    }
}

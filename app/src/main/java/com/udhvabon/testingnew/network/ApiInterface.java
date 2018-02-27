package com.udhvabon.testingnew.network;


import com.udhvabon.testingnew.pojo.CategoryResponse;
import com.udhvabon.testingnew.pojo.DealsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("categories")
    Call<CategoryResponse> getCategories();

    @GET("all_deals.json")
    Call<DealsResponse> getAllDeals(@Query("page") int page);

    @GET("online_deals.json")
    Call<DealsResponse> getOnlineDeals();

    @GET("store_deals.json")
    Call<DealsResponse> getStoreDeals();

    @GET("ending_today.json")
    Call<DealsResponse> getDealEndingToday();

    @GET("ending_in_week.json")
    Call<DealsResponse> getDealEndingInAWeek();

    @GET("ending_in_ten.json")
    Call<DealsResponse> getDealEndingIn10Days();

    @GET("{id}/category_search.json")
    Call<DealsResponse> getCategorySearchDeals(@Path("id") int id);

    @GET("locations")
    Call<List<String>> getLocations();

    @GET("search_deal.json")
    Call<DealsResponse> getSearchedLocationDeals(@Query("deal_location") String location);

    @GET("search_deal.json")
    Call<DealsResponse> getSearchedDeals(@Query("deal_name") String name);
   /* @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);*/
}
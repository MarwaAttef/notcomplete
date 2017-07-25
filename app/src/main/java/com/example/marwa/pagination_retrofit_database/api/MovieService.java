package com.example.marwa.pagination_retrofit_database.api;

import com.example.marwa.pagination_retrofit_database.model.TopRatedMovies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Marwa on 7/25/2017.
 */

public interface MovieService {
    @GET("movie/top_rated")
    Call<TopRatedMovies> getTopRatedMovies(
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int pageIndex
    );
}

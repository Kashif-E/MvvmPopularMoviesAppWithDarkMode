package com.infinity.movieapp.api


import com.infinity.movieapp.models.netwrokmodels.PopularMoviesResponse

import com.infinity.movieapp.util.Constants.Companion.API_KEY
import kotlinx.coroutines.Deferred
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

   @GET("/3/movie/popular")
   suspend fun getPopularMoviesAsync(
       @Query("api_key")
       api_key: String = API_KEY
   ) : Response<PopularMoviesResponse>

    @GET("/3/movie/top_rated")
    suspend fun getLatestMoviesAsync(
        @Query("api_key")
        api_key: String = API_KEY
    ) :  Response<PopularMoviesResponse>
}
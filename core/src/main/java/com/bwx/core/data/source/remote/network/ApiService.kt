package com.bwx.core.data.source.remote.network

import com.bwx.core.data.source.remote.response.*
import retrofit2.http.*

interface ApiService {
    @GET("3/movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") api_key: String,
        @Query("language") language: String,
        @Query("page") page: Int?
    ): MovieResponse

    @GET("3/movie/{movie_id}")
    suspend fun getDetailMovie(
        @Path("movie_id") movie_id: Int,
        @Query("api_key") api_key: String,
        @Query("language") language: String
    ): DetailMovieResponse

    @GET("3/movie/{movie_id}/credits")
    suspend fun getCreditsMovie(
        @Path("movie_id") movie_id: Int,
        @Query("api_key") api_key: String,
        @Query("language") language: String
    ): CreditsResponse

    @GET("3/movie/{movie_id}/reviews")
    suspend fun getReviewsMovie(
        @Path("movie_id") movie_id: Int,
        @Query("page") page: Int?,
        @Query("api_key") api_key: String
    ): ReviewsResponse

    @GET("3/movie/{movie_id}/videos")
    suspend fun getMovieVideos(
        @Path("movie_id") movie_id: Int,
        @Query("api_key") api_key: String
    ): VideoResponse

    @GET("3/genre/movie/list")
    suspend fun getGenresType(@Query("api_key") api_key: String): GenresResponse

    @GET("3/tv/popular")
    suspend fun getPopularTv(
        @Query("api_key") api_key: String,
        @Query("language") language: String,
        @Query("page") page: Int?
    ): TvResponse


    @GET("3/tv/{tv_id}")
    suspend fun getDetailTV(
        @Path("tv_id") tv_id: Int,
        @Query("api_key") api_key: String,
        @Query("language") language: String
    ): DetailTVResponse

}
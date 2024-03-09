package io.sandalika.buyer.config

import io.sandalika.buyer.models.Game
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL="http://www.freetogame.com/api/"

interface ApiService {
    @GET("games")
    suspend fun getGames():List<Game>

    companion object{
        private var apiService:ApiService? = null

        fun getInstance(): ApiService{
            if(apiService==null) {
                apiService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ApiService::class.java)

            }
            return apiService!!;
        }
    }



}
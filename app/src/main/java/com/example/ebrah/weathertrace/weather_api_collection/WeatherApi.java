package com.example.ebrah.weathertrace.weather_api_collection;

import com.example.ebrah.weathertrace.models_for_current_weather.CurrentWeather;
import com.example.ebrah.weathertrace.models_for_forecast_weather.ForecastWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Shipon on 9/5/2018.
 */

public interface WeatherApi {

   // @GET("forecast?q=dhaka,bangladesh&appid=b2ed8cc71534bb766df35dbf3bbc0056")
    @GET("weather")
    Call<CurrentWeather> getCurrentWeather(@Query("q") String location, @Query("appid") String key);
    @GET("forecast")
    Call<ForecastWeather> getForcastWeather(@Query("q") String location, @Query("appid") String key);
}

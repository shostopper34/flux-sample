package com.ss.flux.data.api;

import retrofit2.http.GET;

public interface QiitaService {

    @GET("items")
    void items();
}

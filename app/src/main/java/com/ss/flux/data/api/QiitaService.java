package com.ss.flux.data.api;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface QiitaService {

    @GET("items")
    void items(@Query("page") int page,
               @Query("per_page") int perPage);

    @GET("tags")
    void tags(@Query("page") int page,
              @Query("per_page") int perPage);

    @GET("tags/{tag_name}/items")
    void tagItems(
            @Path("tag_name") String tag,
            @Query("page") int page,
            @Query("per_page") int perPage);

}

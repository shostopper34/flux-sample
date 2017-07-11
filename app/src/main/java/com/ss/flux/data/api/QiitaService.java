package com.ss.flux.data.api;

import com.ss.flux.data.api.dto.Article;
import com.ss.flux.data.api.dto.Tag;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface QiitaService {

    @GET("items")
    Observable<List<Article>> items(@Query("page") int page,
                                    @Query("per_page") int perPage);

    @GET("tags")
    Observable<List<Tag>> tags(@Query("page") int page,
                               @Query("per_page") int perPage);

    @GET("tags/{tag_name}/items")
    Observable<List<Article>> tagItems(
            @Path("tag_name") String tag,
            @Query("page") int page,
            @Query("per_page") int perPage);

}

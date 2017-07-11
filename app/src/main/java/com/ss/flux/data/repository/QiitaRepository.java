package com.ss.flux.data.repository;

import com.ss.flux.data.api.QiitaService;
import com.ss.flux.data.api.dto.Article;

import java.util.List;

import io.reactivex.Observable;

public class QiitaRepository {

    private QiitaService qiitaService;

    QiitaRepository(QiitaService qiitaService) {
        this.qiitaService = qiitaService;
    }

    public Observable<List<Article>> getArticles() {
        return qiitaService.items(1, 20);
    }
}

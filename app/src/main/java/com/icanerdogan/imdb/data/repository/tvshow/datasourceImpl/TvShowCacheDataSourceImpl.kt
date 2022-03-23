package com.icanerdogan.imdb.data.repository.tvshow.datasourceImpl


import com.icanerdogan.imdb.data.model.tvshow.TVShow
import com.icanerdogan.imdb.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl :
    TvShowCacheDataSource {
    private var tvShowList = ArrayList<TVShow>()

    override suspend fun getTvShowsFromCache(): List<TVShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TVShow>) {
       tvShowList.clear()
       tvShowList = ArrayList(tvShows)
    }
}
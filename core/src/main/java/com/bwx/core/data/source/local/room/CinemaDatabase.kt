package com.bwx.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bwx.core.data.source.local.entity.*

@Database(
    entities = [MovieEntity::class, TvEntity::class, SeasonEntity::class,
        CastEntity::class, RemoteKeyEntity::class, ReviewEntity::class, VideoEntity::class,
        GenreMovieEntity::class, GenreTypeEntity::class, FavoriteMovieEntity::class, FavoriteTvEntity::class],
    version = 1,
    exportSchema = false
)
abstract class CinemaDatabase : RoomDatabase() {
    abstract fun cinemaDao(): CinemaDao
    abstract fun tvDao(): TvDao
    abstract fun remoteKeyDao(): RemoteKeyDao
}
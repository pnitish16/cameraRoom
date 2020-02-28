package com.inthecheesefactory.lab.intent_fileprovider.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ImageObject.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ImageDao imageDao();
}

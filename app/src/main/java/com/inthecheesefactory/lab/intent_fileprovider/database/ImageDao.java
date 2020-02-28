package com.inthecheesefactory.lab.intent_fileprovider.database;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ImageDao {
    @Query("SELECT * FROM imageobject")
    List<ImageObject> getAll();

    @Query("SELECT * FROM imageobject WHERE uid IN (:uids)")
    List<ImageObject> loadAllByIds(int[] uids);

    @Query("SELECT * FROM imageobject WHERE image_name LIKE :image_name")
    ImageObject findByName(String image_name);

    @Insert
    void insertAll(ImageObject... users);

    @Insert
    void insertSingle(ImageObject imageObject);

    @Delete
    void delete(ImageObject user);
}

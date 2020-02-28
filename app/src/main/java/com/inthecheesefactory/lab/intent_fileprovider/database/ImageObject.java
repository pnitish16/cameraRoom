package com.inthecheesefactory.lab.intent_fileprovider.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ImageObject {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "image_name")
    public String imageName;

    public ImageObject(String imageName) {
        this.imageName = imageName;
    }
}

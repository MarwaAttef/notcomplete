package com.example.marwa.pagination_retrofit_database.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marwa on 7/25/2017.
 */

public class SqlHelper extends SQLiteOpenHelper {

    static String DATABASE_NAME = "alex1";
    public static final String TABLE_NAME = "FavouriteTable";
    public static final String History_TABLE_NAME = "HistoryTable";
    private static final int DATABASE_VERSION = 1;
    Context context;
    
    public SqlHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}


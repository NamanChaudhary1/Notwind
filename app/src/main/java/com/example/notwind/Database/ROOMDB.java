package com.example.notwind.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.notwind.Models.Notes;

@Database(entities = Notes.class, version = 1, exportSchema = false)
public abstract class ROOMDB extends RoomDatabase{
    private  static  ROOMDB database;
    private static  String DATABASE_NAME = "NoteApp";

    public  synchronized  static  ROOMDB getInstance(Context context){
        if (database == null){
           database = Room.databaseBuilder(context.getApplicationContext(),
                   ROOMDB.class,DATABASE_NAME)
                   .allowMainThreadQueries()
                   .fallbackToDestructiveMigration()
                   .build();
        }
        return database;
    }
public abstract MainDAO mainDAO();
}


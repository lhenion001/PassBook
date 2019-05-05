package com.leona.passbook.db;

import android.content.Context;
import com.leona.passbook.db.dao.StoredPasswordDao;
import androidx.room.Room;
import androidx.room.RoomDatabase;

//@Database(entities ={StoredPassword.class}, version = 1)
public abstract class StoredPasswordDatabase extends RoomDatabase {

    public abstract StoredPasswordDao storedPasswordDao();

    private static volatile StoredPasswordDatabase INSTANCE;

    static StoredPasswordDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (StoredPasswordDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            StoredPasswordDatabase.class, "StoredPassword_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
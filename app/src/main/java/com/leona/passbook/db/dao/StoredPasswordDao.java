package com.leona.passbook.db.dao;

import com.leona.passbook.db.StoredPasswordDatabase;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface StoredPasswordDao {

    @Insert
    void insert(StoredPasswordDao storedPasswordDao);

    @Query("DELETE FROM password_table")
    void deleteAll();

    @Query("SELECT * from password_table ORDER BY password ASC")
    List<StoredPasswordDao> getAllPasswords();

}

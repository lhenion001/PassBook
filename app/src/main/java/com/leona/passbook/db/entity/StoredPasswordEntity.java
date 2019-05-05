package com.leona.passbook.db.entity;

// PassBook Android Application Database: Class called "StoredPasswordEntity"
// for

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;


@Entity(tableName = "password_table")
public class StoredPasswordEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    // Private field for the users password called password.
    @NonNull
    private String password;

    // Private field for the users username called userName.
    @ColumnInfo(name="users_username")
    private String userName;

    // Private field for website address called websiteId.
    @ColumnInfo(name="website_name_address")
    private String websiteId;


}

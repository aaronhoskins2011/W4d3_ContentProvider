package com.example.aaron.w4d3_contentprovider.model.ContentProvider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 8/23/17.
 */

public class DatabaseProvider extends ContentProvider {
    public static final String PROVIDER_NAME = "";
    public static final Uri CONTENT_URI = Uri.parse("" + PROVIDER_NAME);
    public static final int ITEM_NAME = 1;
    public static final int ITEM_DESCRIPTION = 2;
    public static final int ITEM_MANUFACTURE = 3;
    public static final int ITEM_RATING = 4;
    public static final int ITEM_COST = 5;
    FirebaseDatabase database;
    DatabaseReference myRef;
    DatabaseReference movieReference;
    FirebaseHelper firebaseHelper;
    List<SellItem> sellItemList = new ArrayList<>();

    @Override
    public boolean onCreate() {
        Context context = getContext();
        firebaseHelper = new FirebaseHelper();
        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }
}

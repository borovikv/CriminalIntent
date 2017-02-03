package com.vborovic.android.criminalintent;

import java.util.UUID;

/**
 * Created by vborovic on 2/3/17.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}

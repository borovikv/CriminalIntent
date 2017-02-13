package com.vborovic.android.criminalintent;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by vborovic on 2/6/17.
 */
class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes = new ArrayList<>();
    private Context mContext;


    static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mContext = context;
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0); // Для каждого второго объекта
            mCrimes.add(crime);
        }

    }

    List<Crime> getCrimes() {
        return mCrimes;
    }

    Crime getCrime(UUID uuid) {
        for (Crime c: mCrimes) {
            Log.d("getCrime", uuid + " == " + c.getId() + ": " + (c.getId() == uuid));
            if (c.getId().equals(uuid)) {
                return c;
            }
        }
        return null;
    }
}

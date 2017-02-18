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


    static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
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
    public void addCrime(Crime c) {
        mCrimes.add(c);
    }
}

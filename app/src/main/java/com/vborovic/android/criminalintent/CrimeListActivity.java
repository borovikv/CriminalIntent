package com.vborovic.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by vborovic on 2/6/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

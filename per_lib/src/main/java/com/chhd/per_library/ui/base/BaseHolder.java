package com.chhd.per_library.ui.base;

import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by CWQ on 2017/3/26.
 */

public class BaseHolder {

    public BaseHolder(View itemView) {
        ButterKnife.bind(this, itemView);
    }

}
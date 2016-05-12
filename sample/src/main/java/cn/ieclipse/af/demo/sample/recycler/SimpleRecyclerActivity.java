/*
 * Copyright (C) 2015-2016 QuickAF
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.af.demo.sample.recycler;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import cn.ieclipse.af.demo.R;
import cn.ieclipse.af.demo.common.ui.BaseActivity;

/**
 * Description
 *
 * @author Jamling
 */
public class SimpleRecyclerActivity extends BaseActivity {

    ImageView mClear;

    @Override
    protected int getContentLayout() {
        return R.layout.main_content;
    }

    @Override
    protected void initHeaderView() {
        super.initHeaderView();
        setTitle("Simple RefreshRecyclerView");
        mClear = createRightIcon(android.R.drawable.ic_menu_close_clear_cancel);
        mTitleBar.addRight(mClear);
        setOnClickListener(mClear);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        if (v == mClear){
            fragment.clear();
        }
    }

    SimpleRecyclerFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null){
            fragment = new SimpleRecyclerFragment();
            pushFragments(fragment, false, false, null);
        }
    }
}

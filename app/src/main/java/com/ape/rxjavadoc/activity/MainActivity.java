package com.ape.rxjavadoc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.ape.rxjavadoc.R;
import com.ape.rxjavadoc.adapter.BaseHeaderAdapter;
import com.ape.rxjavadoc.entitiy.Operator;
import com.ape.rxjavadoc.entitiy.PinnedHeaderEntity;
import com.ape.rxjavadoc.util.DataUtils;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.gjiazhe.wavesidebar.WaveSideBar;
import com.oushangfeng.pinnedsectionitemdecoration.PinnedHeaderItemDecoration;
import com.oushangfeng.pinnedsectionitemdecoration.callback.OnHeaderClickListener;
import com.thefinestartist.finestwebview.FinestWebView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView mRecyclerView;
    private WaveSideBar mWaveSideBar;
    private BaseHeaderAdapter<PinnedHeaderEntity<Operator>> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView = findViewById(R.id.recycler_view);
        mWaveSideBar = findViewById(R.id.side_bar);
        mWaveSideBar.setIndexItems(DataUtils.HEAD_NAME_INDEX);
        mWaveSideBar.setOnSelectIndexItemListener(new WaveSideBar.OnSelectIndexItemListener() {
            @Override
            public void onSelectIndexItem(String index) {
                final int position = DataUtils.HEAD_INDEX_MAP.get(index);
                Log.d(TAG, "onSelectIndexItem index = " + index + ", position = " + position);
                // Do something here ....
                //layoutManager.smoothScrollToPosition(mRecyclerView, RecyclerView.State., position);
                mRecyclerView.scrollToPosition(position);
            }
        });

        List<PinnedHeaderEntity<Operator>> data = DataUtils.getData();
        mAdapter = new BaseHeaderAdapter<PinnedHeaderEntity<Operator>>(data) {

            @Override
            protected void addItemTypes() {
                addItemType(BaseHeaderAdapter.TYPE_HEADER, R.layout.item_pinned_header);
                addItemType(BaseHeaderAdapter.TYPE_DATA, R.layout.item_index_content);
            }

            @Override
            protected void convert(BaseViewHolder holder, PinnedHeaderEntity<Operator> item) {
                switch (holder.getItemViewType()) {
                    case BaseHeaderAdapter.TYPE_HEADER:
                        holder.setText(R.id.tv_animal, item.getPinnedHeaderName());
                        break;
                    case BaseHeaderAdapter.TYPE_DATA:
                        //int position = holder.getLayoutPosition();
                        Operator operator = item.getData();

                        holder.setText(R.id.item_content_title, operator.getName());
                        holder.setText(R.id.item_content_thread, operator.getThread());
                        holder.setText(R.id.item_content_desc, operator.getDesc());
                        Glide.with(MainActivity.this).load(operator.getImg()).into((ImageView) holder.getView(R.id.item_content_iv));
                        break;
                }
            }

        };

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (mAdapter.getItemViewType(position)) {
                    case BaseHeaderAdapter.TYPE_DATA:
                        PinnedHeaderEntity<Operator> entity = mAdapter.getData().get(position);
                        new FinestWebView.Builder(MainActivity.this)
                                .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                                .titleDefault(entity.getData().getName())
                                .show(entity.getData().getUrl());
                        //Toast.makeText(MainActivity.this, entity.getPinnedHeaderName() + ", position " + position + ", id " + entity.getData(), Toast.LENGTH_SHORT).show();
                        break;
                    case BaseHeaderAdapter.TYPE_HEADER:
                        //entity = mAdapter.getData().get(position);
                        //Toast.makeText(MainActivity.this, "click, tag: " + entity.getPinnedHeaderName(), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

//        OnHeaderClickListener headerClickListener = new OnHeaderClickListener() {
//            @Override
//            public void onHeaderClick(View view, int id, int position) {
//                Toast.makeText(MainActivity.this, "click, tag: " + mAdapter.getData().get(position).getPinnedHeaderName(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onHeaderLongClick(View view, int id, int position) {
//                Toast.makeText(MainActivity.this, "long click, tag: " + mAdapter.getData().get(position).getPinnedHeaderName(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onHeaderDoubleClick(View view, int id, int position) {
//                Toast.makeText(MainActivity.this, "double click, tag: " + mAdapter.getData().get(position).getPinnedHeaderName(), Toast.LENGTH_SHORT).show();
//            }
//        };
        mRecyclerView.addItemDecoration(new PinnedHeaderItemDecoration.Builder(BaseHeaderAdapter.TYPE_HEADER).setDividerId(R.drawable.simple_divider).enableDivider(true)
                /*.setHeaderClickListener(headerClickListener)*/.create());

        mRecyclerView.setAdapter(mAdapter);
    }
}

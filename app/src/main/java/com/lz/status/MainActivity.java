package com.lz.status;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lz.statusview.StatusConfigBuild;
import com.lz.statusview.StatusView;
import com.lz.statusview.WaterRippleAnim;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusView statusView5 = (StatusView) findViewById(R.id.statusview);
        statusView5.showEmptyView();

        StatusView statusView6 = StatusView.init(findViewById(R.id.tv6));
        statusView6.showErrorView();


        final StatusView init = StatusView.init(this);
        WaterRippleAnim animView = new WaterRippleAnim(this);
        animView.setText("loading");
        animView.setTextSize(50);
        init.config(new StatusConfigBuild()
                .setShowloadTitle(false)
                .setErrorTitle("加载失败")
                .setTitleColor(R.color.colorAccent)
                .setEmptyTitle("没有数据")
                .addLoadAnim(animView)
                .setRetryBackGroundRes(R.drawable.shape_red_board_corner)
                .setEmptyRetryListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        init.showContentView();
                    }
                })
                .setErrorRetryListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        init.showEmptyView();

                    }
                }));
        init.showLoadingView();
        statusView5.postDelayed(new Runnable() {
            @Override
            public void run() {
                init.showErrorView();
            }
        }, 3500);


        StatusView statusView1 = StatusView.init(this, R.id.tv1);
        statusView1.config(new StatusConfigBuild().setLoadTitle("加载中")
                .setTitleColor(R.color.colorAccent));
        statusView1.showLoadingView();
        statusView1.setLoadtitle("");
        statusView1.setErrortitle("");
        statusView1.setEmptytitle("");


        final StatusView statusView2 = StatusView.init(this, R.id.tv2);
        statusView2.config(new StatusConfigBuild()
                .setErrorTitle("加载失败")
                .setTitleColor(R.color.colorAccent)
                .setEmptyTitle("没有数据")
                .setRetryBackGroundRes(R.drawable.shape_red_board_corner)
                .setEmptyRetryListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        statusView2.showContentView();
                    }
                })
                .setErrorRetryListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        statusView2.showEmptyView();
                    }
                })
        );
        statusView2.showErrorView();


        final StatusView statusView3 = StatusView.init(this, R.id.tv3);
        statusView3.config(new StatusConfigBuild()
                .setTitleColor(R.color.colorAccent)
                .setEmptyTitle("没数据")
                .setRetryBackGroundRes(R.drawable.shape_red_board_corner)
                .setRetryTextColor(R.color.colorAccent)
                .setEmptyRetryListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        statusView3.showContentView();
                    }
                })
                .setErrorRetryListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        statusView3.showEmptyView();
                    }
                })
        );
        statusView3.showEmptyView();


        final StatusView statusView4 = StatusView.init(this, R.id.tv4);
        statusView4.showContentView();


        findViewById(R.id.tv5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusView4.showContentView();
            }
        });


        StatusView statusView7 = StatusView.init(findViewById(R.id.tv7));
        WaterRippleAnim animView2 = new WaterRippleAnim(this);
        animView2.setText("loading");
        animView2.setTextSize(30);
        statusView7.config(new StatusConfigBuild()
                .setLoadTitle("加载中")
                .addLoadAnim(animView2))
                .showLoadingView();






    }
}

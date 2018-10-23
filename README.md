# StatusView
公共加载状态控件
![image](https://github.com/liuzeze/status/blob/master/GIF.gif)  


## 使用方式
``` 

statusView7.config(new StatusConfigBuild()
                .setLoadTitle("加载中")  //加载标题
                .setShowloadTitle(true)  //是否显示加载标题
                .setShowloadImage(true)   //是否显示加载图片

                .setErrorImage(0)  //错误图
                .setErrorTitle("")//错误提示
                .setShowErrorImage(true)//是否显示错误图
                .setShowErrorTitle(true)//是否显示错误信息
                .setErrorRetryListener(null)//错误点击重试监听

                .setEmptyTitle("")   //空数据标题
                .setEmptyImage(0)  //空数据图标
                .setEmptyRetryListener(null)  //空数据点击加载重试监听
                .setShowEmptyImage(true)//是否显示空数据图片
                .setShowEmptyTitle(true)//是否显示空数据标题
                .setRetryBackGroundRes(0)//点击重试的背景
                .setRetryTextColor(0)//点击重试按钮的字体颜色
                .setRetryTitle("")//重试按钮的文字
                .setRetrySize(15)//重试按钮文字大小
                .setShowRetryButton(true)//是否显示重试按钮

                .setTitleColor()  //l标题的颜色
                .setTitleSize()   //标题的大小
                
                //传入自定义view
                l.setLoadingView(null)  
                .setEmptyView(null)
                .setErrorView(null)
                
                .addLoadAnim(animView2)) //加载动画传入
                .showLoadingView();//显示架子啊动画


        statusView7.showEmptyView();  //显示空数据ui
        statusView7.showErrorView();//显示错误数据ui
        statusView7.showContentView();//显示原始内容

        
        ```

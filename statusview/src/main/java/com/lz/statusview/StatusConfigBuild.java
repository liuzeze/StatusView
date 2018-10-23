package com.lz.statusview;

import android.support.annotation.ColorRes;
import android.view.View;

/**
 * -----------作者----------日期----------变更内容-----
 * -          刘泽      2018-10-22       创建class
 */
public class StatusConfigBuild {


    private boolean showloadImage = true;
    private String loadTitle = "正在加载...";
    private boolean showloadTitle = true;

    private int errorImage = R.mipmap.load_error;
    private boolean showErrorImage = true;
    private String errorTitle = "加载失败,点击重新加载";
    private boolean showErrorTitle = true;


    private int emptyImage = R.mipmap.no_data;
    private boolean showEmptyImage = true;
    private String emptyTitle = "暂无数据";
    private boolean showEmptyTitle = true;
    private String retryTitle = "点我重试";
    private boolean showRetryButton = true;


    private int titleSize = -1;
    private int titleColor = -1;

    private int retrySize = -1;
    private int retryColor = -1;
    private int retryBackGround = -1;

    private View.OnClickListener errorRetryListener;
    private View.OnClickListener emptyRetryListener;

    private View animView;

    public View.OnClickListener getErrorRetryListener() {
        return errorRetryListener;
    }

    public View.OnClickListener getEmptyRetryListener() {
        return emptyRetryListener;
    }

    public int getTitleSize() {
        return titleSize;
    }

    public View getAnimView() {
        return animView;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public int getRetrySize() {
        return retrySize;
    }

    public int getRetryColor() {
        return retryColor;
    }

    public int getRetryBackGround() {
        return retryBackGround;
    }

    public boolean isShowloadImage() {
        return showloadImage;
    }

    public String getLoadTitle() {
        return loadTitle;
    }

    public boolean isShowloadTitle() {
        return showloadTitle;
    }

    public int getErrorImage() {
        return errorImage;
    }

    public boolean isShowErrorImage() {
        return showErrorImage;
    }

    public String getErrorTitle() {
        return errorTitle;
    }

    public boolean isShowErrorTitle() {
        return showErrorTitle;
    }

    public int getEmptyImage() {
        return emptyImage;
    }

    public boolean isShowEmptyImage() {
        return showEmptyImage;
    }

    public String getEmptyTitle() {
        return emptyTitle;
    }

    public boolean isShowEmptyTitle() {
        return showEmptyTitle;
    }

    public String getRetryTitle() {
        return retryTitle;
    }

    public boolean isShowRetryButton() {
        return showRetryButton;
    }


    public StatusConfigBuild setErrorRetryListener(View.OnClickListener errorRetryListener) {
        this.errorRetryListener = errorRetryListener;
        return this;
    }

    public StatusConfigBuild setEmptyRetryListener(View.OnClickListener emptyRetryListener) {
        this.emptyRetryListener = emptyRetryListener;
        return this;
    }

    public StatusConfigBuild setTitleSize(int titleSize) {
        this.titleSize = titleSize;
        return this;
    }

    public StatusConfigBuild setTitleColor(@ColorRes int titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    public StatusConfigBuild setRetrySize(int retrySize) {
        this.retrySize = retrySize;
        return this;
    }

    public StatusConfigBuild setRetryTextColor(@ColorRes int retryColor) {
        this.retryColor = retryColor;
        return this;
    }

    public StatusConfigBuild setRetryBackGroundRes(int retryBackGround) {
        this.retryBackGround = retryBackGround;
        return this;
    }

    public StatusConfigBuild setShowloadImage(boolean showloadImage) {
        this.showloadImage = showloadImage;
        return this;
    }

    public StatusConfigBuild setLoadTitle(String loadTitle) {
        this.loadTitle = loadTitle;
        return this;
    }

    public StatusConfigBuild setShowloadTitle(boolean showloadTitle) {
        this.showloadTitle = showloadTitle;
        return this;
    }

    public StatusConfigBuild setErrorImage(int errorImage) {
        this.errorImage = errorImage;
        return this;
    }

    public StatusConfigBuild setShowErrorImage(boolean showErrorImage) {
        this.showErrorImage = showErrorImage;
        return this;
    }

    public StatusConfigBuild setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
        return this;
    }

    public StatusConfigBuild setShowErrorTitle(boolean showErrorTitle) {
        this.showErrorTitle = showErrorTitle;
        return this;
    }

    public StatusConfigBuild setEmptyImage(int emptyImage) {
        this.emptyImage = emptyImage;
        return this;
    }

    public StatusConfigBuild setShowEmptyImage(boolean showEmptyImage) {
        this.showEmptyImage = showEmptyImage;
        return this;
    }

    public StatusConfigBuild setEmptyTitle(String emptyTitle) {
        this.emptyTitle = emptyTitle;
        return this;
    }

    public StatusConfigBuild setShowEmptyTitle(boolean showEmptyTitle) {
        this.showEmptyTitle = showEmptyTitle;
        return this;
    }

    public StatusConfigBuild setRetryTitle(String retryTitle) {
        this.retryTitle = retryTitle;
        return this;
    }

    public StatusConfigBuild setShowRetryButton(boolean showRetryButton) {
        this.showRetryButton = showRetryButton;
        return this;
    }


    public StatusConfigBuild addLoadAnim(View animView) {
        this.animView = animView;
        return this;
    }
}

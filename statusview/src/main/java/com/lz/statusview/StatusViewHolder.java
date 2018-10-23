package com.lz.statusview;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class StatusViewHolder {

    private SparseArray<View> views;
    private View convertView;

    private StatusViewHolder(View view) {
        convertView = view;
        views = new SparseArray<>();
    }

    public static StatusViewHolder create(View view) {
        return new StatusViewHolder(view);
    }

    public <T extends View> T getView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = convertView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }

    public View getConvertView() {
        return convertView;
    }

    public void setText(int viewId, String text) {
        if (text != null) {
            TextView textView = getView(viewId);
            textView.setText(text);
        }
    }

    public void setText(int viewId, int textId) {
        TextView textView = getView(viewId);
        textView.setText(textId);
    }

    public void setTextColor(int viewId, int colorId) {
        if (colorId > 0) {
            TextView textView = getView(viewId);
            textView.setTextColor(colorId);
        }
    }

    public void setTextSize(int viewId, int size) {
        if (size > 0) {
            TextView textView = getView(viewId);
            textView.setTextSize(size);
        }
    }

    public void setOnClickListener(int viewId, View.OnClickListener clickListener) {
        if (clickListener != null) {
            View view = getView(viewId);
            view.setOnClickListener(clickListener);
        }
    }

    public void setImageResource(int viewId, int resId) {
        if (resId > 0) {
            ImageView imageView = (ImageView) getView(viewId);
            imageView.setImageResource(resId);
        }
    }

    public void setBackgroundResource(int viewId, int resId) {
        if (resId > 0) {
            View view = getView(viewId);
            view.setBackgroundResource(resId);
        }
    }

    public void setBackgroundColor(int viewId, int colorId) {
        if (colorId > 0) {
            View view = getView(viewId);
            view.setBackgroundColor(colorId);
        }
    }

    public void setBackgroundDrawable(int viewId, Drawable drawable) {
        if (drawable != null) {
            View view = getView(viewId);
            view.setBackgroundDrawable(drawable);
        }
    }

    public void setVisibility(int viewId, boolean visible) {
        View view = getView(viewId);
        view.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    public void setLoadanimStyle(int viewId, View animStyle) {
        View view = getView(viewId);
        ViewGroup parent = (ViewGroup) view.getParent();
        int index = parent.indexOfChild(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        parent.removeView(view);
        ViewGroup parent1 = (ViewGroup) animStyle.getParent();
        if (parent1 != null) {
            parent1.removeView(animStyle);
        }
        parent.addView(animStyle, index, layoutParams);

    }
}

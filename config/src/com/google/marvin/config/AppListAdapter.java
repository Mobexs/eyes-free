package com.google.marvin.config;

import java.util.ArrayList;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.TwoLineListItem;

public class AppListAdapter implements ListAdapter {
  ArrayList<AppDesc> apps;
  Context ctx;
  
  public AppListAdapter(Context context, ArrayList<AppDesc> appDescs){
    ctx = context;
    apps = appDescs;
  }
  

  public boolean areAllItemsEnabled() {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean isEnabled(int arg0) {
    // There are no separators
    return true;
  }

  public int getCount() {
    return apps.size();
  }

  public Object getItem(int arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  public long getItemId(int arg0) {
    // TODO Auto-generated method stub
    return 0;
  }

  public int getItemViewType(int arg0) {
    // TODO Auto-generated method stub
    return 0;
  }
  
  public String getPackageName(int arg0) {
    AppDesc currentApp = apps.get(arg0);
    return currentApp.getPackageName();
  }

  public View getView(int arg0, View arg1, ViewGroup arg2) {
    AppDesc currentApp = apps.get(arg0);
    
    LinearLayout baseView = new LinearLayout(ctx);
    
    TextView title = new TextView(ctx);
    title.setText(currentApp.getTitle());
    title.setTextSize(32);
    TextView desc = new TextView(ctx);
    desc.setText(currentApp.getDescription());
    desc.setTextSize(18);

    baseView.setOrientation(LinearLayout.VERTICAL);
    baseView.addView(title);
    baseView.addView(desc);

    return baseView;
  }

  public int getViewTypeCount() {
    // Return a 1 because there is only one view type
    return 1;
  }

  public boolean hasStableIds() {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  public void registerDataSetObserver(DataSetObserver arg0) {
    // TODO Auto-generated method stub
    
  }

  public void unregisterDataSetObserver(DataSetObserver arg0) {
    // TODO Auto-generated method stub
    
  }

}
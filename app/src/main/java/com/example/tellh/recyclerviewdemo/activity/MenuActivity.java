package com.example.tellh.recyclerviewdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tellh.recyclerviewdemo.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void AdapterTest(View v) {
        Intent intent = new Intent(this, AdapterTestActivity.class);
        startActivity(intent);
    }

    public void DiffUtil(View v) {
        Intent intent = new Intent(this, DiffUtilActivity.class);
        startActivity(intent);
    }

    public void ItemSwipeAndDrag(View v) {
        Intent intent = new Intent(this, ItemSwipeAndDragActivity.class);
        startActivity(intent);
    }

    public void Main(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void NewWayToAddHeader(View v) {
        Intent intent = new Intent(this, NewWayToAddHeaderActivity.class);
        startActivity(intent);
    }

    public void PopupMenu(View v) {
        Intent intent = new Intent(this, PopupMenuActivity.class);
        startActivity(intent);
    }

    public void RecyclerRefresh(View v) {
        Intent intent = new Intent(this, RecyclerRefreshActivity.class);
        startActivity(intent);
    }

    public void RvEmptyView(View v) {
        Intent intent = new Intent(this, RvEmptyViewActivity.class);
        startActivity(intent);
    }

    public void Staggered(View v) {
        Intent intent = new Intent(this, StaggeredActivity.class);
        startActivity(intent);
    }

    public void StickyHeader(View v) {
        Intent intent = new Intent(this, StickyHeaderActivity.class);
        startActivity(intent);
    }

    public void ToolbarAnimated(View v) {
        Intent intent = new Intent(this, ToolbarAnimatedActivity.class);
        startActivity(intent);
    }


}

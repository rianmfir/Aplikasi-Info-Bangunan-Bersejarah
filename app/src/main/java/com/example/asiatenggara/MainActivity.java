package com.example.asiatenggara;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.asiatenggara.Adapter.CardViewBangunanAdapter;
import com.example.asiatenggara.Model.Bangunan;

import java.util.ArrayList;

import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    RecyclerView rvCategory;
    private ArrayList<Bangunan> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        setActionBarTitle("List");
        list.addAll(BangunanData.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewBangunanAdapter listBangunanAdapter = new CardViewBangunanAdapter(this, new CardViewBangunanAdapter.OnClick() {
            @Override
            public void onClick(Object bangunan) {
                Bangunan b = (Bangunan) bangunan;
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("kunci", b);
                startActivity(intent);
            }
        }) {
            @Override
            public void onClick(Object bangunan) {

            }
        };
        listBangunanAdapter.setListBangunan(list);
        rvCategory.setAdapter(listBangunanAdapter);

    }

    private void setActionBarTitle(String tittle) {
        getSupportActionBar().setTitle(tittle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        setMode(item.getItemId());

        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                break;
            case R.id.action_grid:
                break;
            case R.id.action_cardview:
                break;
        }

    }


}
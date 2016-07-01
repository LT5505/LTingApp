package com.liuting.ltingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mBtnPopularMovies;//popular movies
    private Button mBtnStockHawk;//stock_hawk
    private Button mBtnBuild;//build
    private Button mBtnMaterial;//material
    private Button mBtnGoUbiquitous;//go ubiquitous
    private Button mBtnCapstone;//capstone

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        mBtnPopularMovies=(Button)findViewById(R.id.main_btn_popular_movies);
        mBtnStockHawk=(Button)findViewById(R.id.main_btn_stock_hawk);
        mBtnBuild=(Button)findViewById(R.id.main_btn_build);
        mBtnMaterial=(Button)findViewById(R.id.main_btn_material);
        mBtnGoUbiquitous=(Button)findViewById(R.id.main_btn_go_ubiquitous);
        mBtnCapstone=(Button)findViewById(R.id.main_btn_capstone);

        mBtnPopularMovies.setOnClickListener(this);
        mBtnStockHawk.setOnClickListener(this);
        mBtnBuild.setOnClickListener(this);
        mBtnMaterial.setOnClickListener(this);
        mBtnGoUbiquitous.setOnClickListener(this);
        mBtnCapstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.main_btn_popular_movies:
                Toast.makeText(MainActivity.this,"This button will launch popular movies",Toast.LENGTH_SHORT);
                break;
            case R.id.main_btn_stock_hawk:
                Toast.makeText(MainActivity.this,"This button will launch stock hawk",Toast.LENGTH_SHORT);
                break;
            case R.id.main_btn_build:
                Toast.makeText(MainActivity.this,"This button will launch build it bigger",Toast.LENGTH_SHORT);
                break;
            case R.id.main_btn_material:
                Toast.makeText(MainActivity.this,"This button will launch material",Toast.LENGTH_SHORT);
                break;
            case R.id.main_btn_go_ubiquitous:
                Toast.makeText(MainActivity.this,"This button will launch go ubiquitous",Toast.LENGTH_SHORT);
                break;
            case R.id.main_btn_capstone:
                Toast.makeText(MainActivity.this,"This button will launch my captone app",Toast.LENGTH_SHORT);
                break;

        }
    }
}

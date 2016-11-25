package com.example.xuyonghong.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMovies = (Button) findViewById(R.id.btn_hot_movies);
        Button btnStocks = (Button) findViewById(R.id.btn_stocks);
        Button btnReader = (Button) findViewById(R.id.btn_reader);
        Button btnNews = (Button) findViewById(R.id.btn_news);
        Button btnGDesign = (Button) findViewById(R.id.btn_graduate_design);

        btnMovies.setOnClickListener(this);
        btnStocks.setOnClickListener(this);
        btnReader.setOnClickListener(this);
        btnNews.setOnClickListener(this);
        btnGDesign.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_hot_movies:
                Toast.makeText(this, "打开热门电影", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_stocks:
                Toast.makeText(this, "打开股票雄鹰", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btn_reader:
                Toast.makeText(this, "打开XYZ阅读器", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btn_news:
                Toast.makeText(this, "打开最新闻", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btn_graduate_design:
                Toast.makeText(this, "打开毕业设计", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}

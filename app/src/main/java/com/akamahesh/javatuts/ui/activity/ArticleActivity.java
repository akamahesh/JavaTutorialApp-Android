package com.akamahesh.javatuts.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.akamahesh.javatuts.R;

public class ArticleActivity extends AppCompatActivity {

    private ListView articles;
    private String contants[] = {"Object and Class in Java", "Constructor in Java", "Java static keyword", "this keyword in java", "super keyword in java",
            "Final Keyword In Java", "Java Array", "Hibernate Framework", "Struts 2 Framework", "Spring Framework"};

    public static Intent getIntent(Context context){
        Intent intent = new Intent(context,ArticleActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        articles = (ListView) findViewById(R.id.listView1);
        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("Articles");
        ImageView ivBack = findViewById(R.id.iv_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, contants);

        articles.setAdapter(adapter);
        registerForContextMenu(articles);

        articles.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles1.html",contants[position]));
                        break;
                    case 1:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles2.html",contants[position]));
                        break;
                    case 2:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles3.html",contants[position]));
                        break;
                    case 3:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles4.html",contants[position]));
                        break;
                    case 4:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles5.html",contants[position]));
                        break;
                    case 5:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles6.html",contants[position]));
                        break;
                    case 6:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles7.html",contants[position]));
                        break;
                    case 7:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles8.html",contants[position]));
                        break;
                    case 8:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles9.html",contants[position]));
                        break;
                    case 9:
                        startActivity(SubActivity.getIntent(ArticleActivity.this, "file:///android_asset/html/Articles10.html",contants[position]));
                        break;

                }
            }

        });


    }
}

package com.akamahesh.javatuts.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.akamahesh.javatuts.R;

import static com.akamahesh.javatuts.helper.Constants.kTitle;
import static com.akamahesh.javatuts.helper.Constants.kURI;

public class SubActivity extends AppCompatActivity {

    public static Intent getIntent(Context context, String uri,String title){
        Intent intent = new Intent(context,SubActivity.class);
        intent.putExtra(kURI,uri);
        intent.putExtra(kTitle,title);
        return intent;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent intent = getIntent();
        String title = "";
        String uri = "";
        if(intent!=null){
            title = intent.getStringExtra(kTitle);
            uri = intent.getStringExtra(kURI);
        }

        findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText(title);
        WebView webView=findViewById(R.id.webView);
        webView.loadUrl(uri);
    }
}

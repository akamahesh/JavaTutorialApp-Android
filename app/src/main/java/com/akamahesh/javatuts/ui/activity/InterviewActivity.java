package com.akamahesh.javatuts.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.akamahesh.javatuts.R;

import static com.akamahesh.javatuts.helper.Constants.kTitle;

public class InterviewActivity extends AppCompatActivity {

    public static Intent getIntent(Context context,String title){
        Intent intent = new Intent(context,InterviewActivity.class);
        intent.putExtra(kTitle,title);
        return intent;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);
        Intent intent = getIntent();
        String title = "";
        if(intent!=null){
            title = intent.getStringExtra(kTitle);
        }

        findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText(title);
    }
}

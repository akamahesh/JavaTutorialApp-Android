package com.akamahesh.javatuts.ui.activity.programming;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.akamahesh.javatuts.R;
import com.akamahesh.javatuts.ui.activity.SubActivity;

import static com.akamahesh.javatuts.helper.Constants.kContent;
import static com.akamahesh.javatuts.helper.Constants.kContentURI;
import static com.akamahesh.javatuts.helper.Constants.kTitle;

public class SubProgrammingActivity extends AppCompatActivity {

    private String[] contents;
    private String[] contentsURI;

    public static Intent getIntent(Context context, String title, String[] content,String[] contentURI) {
        Intent intent = new Intent(context, SubProgrammingActivity.class);
        intent.putExtra(kTitle, title);
        intent.putExtra(kContent,content);
        intent.putExtra(kContentURI,contentURI);
        return intent;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_programming);
        Intent intent = getIntent();
        String title = "";
        contents = new String[0];
        contentsURI = new String[0];
        if (intent != null) {
            title = intent.getStringExtra(kTitle);
            contents = intent.getStringArrayExtra(kContent);
            contentsURI = intent.getStringArrayExtra(kContentURI);
        }

        findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        TextView tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText(title);

        ListView listView1 = findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, contents);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                startActivity(SubActivity.getIntent(SubProgrammingActivity.this, contentsURI[position], contents[position]));
            }

        });

    }
}

package com.akamahesh.javatuts.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.akamahesh.javatuts.R;
import com.akamahesh.javatuts.helper.MockData;
import com.akamahesh.javatuts.ui.activity.programming.SubProgrammingActivity;

import static com.akamahesh.javatuts.helper.Constants.kTitle;

public class ProgrammingActivity extends AppCompatActivity {

    public static Intent getIntent(Context context, String title) {
        Intent intent = new Intent(context, ProgrammingActivity.class);
        intent.putExtra(kTitle, title);
        return intent;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);
        Intent intent = getIntent();
        String title = "";
        if (intent != null) {
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


    public void onSimplePrograms(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"Simple Programs", MockData.getSimplePrograms(),MockData.getSimpleProgramsURI()));

    }

    public void onPatternProgramming(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"Pattern Programs", MockData.getPatternProgrammingList(),MockData.getPatternProgrammingURIList()));
    }

    public void onArrayAndString(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"Array and String Programs", MockData.getArrayProgrammingList(),MockData.getArrayProgrammingURIList()));
    }

    public void onOOPs(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"OOPS Programs", MockData.getOOPProgrammingList(),MockData.getOOPProgrammingURIList()));
    }

    public void onSort(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"Sort Programs", MockData.getSortProgrammingList(),MockData.getPatternProgrammingURIList()));
    }

    public void onJDBC(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"JDBC Programs", MockData.getJDBCProgrammingList(),MockData.getPatternProgrammingURIList()));
    }

    public void onExceptionHandling(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"Exceptional Programs", MockData.getExceptionHandlingProgrammingList(),MockData.getPatternProgrammingURIList()));
    }

    public void onServlet(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"Servlet Programs", MockData.getServletProgrammingList(),MockData.getPatternProgrammingURIList()));
    }


    public void onStruts(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"Struts Programs", MockData.getStrutsProgrammingList(),MockData.getPatternProgrammingURIList()));

    }

    public void onHibernate(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"Hibernate Programs", MockData.getHibernateProgrammingList(),MockData.getPatternProgrammingURIList()));

    }

    public void onJSP(View view) {
        startActivity(SubProgrammingActivity.getIntent(this,"JSP Programs", MockData.getJSPProgrammingList(),MockData.getPatternProgrammingURIList()));

    }













}

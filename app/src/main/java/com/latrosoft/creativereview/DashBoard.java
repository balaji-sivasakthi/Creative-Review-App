package com.latrosoft.creativereview;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.latrosoft.creativereview.Adapter.SubjectAdapter;
import com.latrosoft.creativereview.Adapter.TipsAdapter;
import com.latrosoft.creativereview.Model.SubjectModel;
import com.latrosoft.creativereview.Model.TipsModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DashBoard extends AppCompatActivity {
    private BottomNavigationView mBottomNavigationView;
    private RecyclerView mRecyclerView;
    private RecyclerView subjects;
    ArrayList<SubjectModel> models1 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_board);
        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNv);
        mBottomNavigationView.setItemIconTintList(null);
        mRecyclerView = findViewById(R.id.recycler);
        subjects = findViewById(R.id.subjets);

        // Tips Recycler View
        ArrayList<TipsModel>  models = new ArrayList<>();

        models.add(new TipsModel(R.drawable.undraw_dash,getString(R.string.tipone)));
        models.add(new TipsModel(R.drawable.ic_nav,getString(R.string.tiptwo)));
        models.add(new TipsModel(R.drawable.ic_nav,getString(R.string.tipthree)));
        mRecyclerView.setAdapter(new  TipsAdapter(models));
        updateTips();

        // Subjects RecyclerView

        models1.add(new SubjectModel(R.drawable.undraw_dash,"Maths"));
        models1.add(new SubjectModel(R.drawable.undraw_dash,"PPS"));
        models1.add(new SubjectModel(R.drawable.undraw_dash,"EVS"));
        models1.add(new SubjectModel(R.drawable.undraw_dash,"DT"));
        models1.add(new SubjectModel(R.drawable.undraw_dash,"English"));
        models1.add(new SubjectModel(R.drawable.undraw_dash,"BCM"));

        subjects.setAdapter(new SubjectAdapter(models1));
        updateSubjects();
    }

    void updateTips(){


        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
    void updateSubjects(){
        subjects.setHasFixedSize(true);
        subjects.setLayoutManager(new GridLayoutManager(this,3));
    }
}
package com.example.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        //Data to be displayed into gridview
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("The Complete Android 14 Course", R.drawable.course1));
        courseModelArrayList.add(new CourseModel("The Complete Java Developer Course", R.drawable.course2));
        courseModelArrayList.add(new CourseModel("The Complete Kotlin Course", R.drawable.course3));
        courseModelArrayList.add(new CourseModel("The Complete Data Structure and Algorithms Course ", R.drawable.course4));


        //Attach the adapter
        MyAdapter myAdapter = new MyAdapter(this,courseModelArrayList);
        gridView.setAdapter(myAdapter);






    }
}
package com.example.admin.retrofittestdemo.Activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.admin.retrofittestdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import lecho.lib.hellocharts.listener.DummyPieChartOnValueSelectListener;
import lecho.lib.hellocharts.listener.PieChartOnValueSelectListener;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

import static android.graphics.Color.rgb;

public class TaskActivity extends AppCompatActivity {


    PieChartView pieChartView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        pieChartView = findViewById(R.id.chart);

        final List pieData = new ArrayList<>();



        pieData.add(new SliceValue(15, Color.GREEN).setLabel("Booked"));
        pieData.add(new SliceValue(25, Color.GRAY).setLabel("Reschedule"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("Relocated"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("Wrong Number"));
        pieData.add(new SliceValue(60, Color.RED).setLabel("Vehicle Sold"));
        pieData.add(new SliceValue(60, rgb(255,165,0)
        ).setLabel("Not Interested"));
        pieData.add(new SliceValue(60, Color.RED).setLabel("Other Service Station"));
        pieData.add(new SliceValue(15, Color.BLUE).setLabel("Not Response"));
        pieData.add(new SliceValue(25, Color.LTGRAY).setLabel("Already Service Done"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("Ringing Not response"));
        pieData.add(new SliceValue(60, Color.BLACK).setLabel("Switch Off"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("Not Reachable"));


        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(13);
        pieChartData.setHasCenterCircle(true).setCenterText1("Remindor Call Details").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView.setPieChartData(pieChartData);



        pieChartView.setOnValueTouchListener(new PieChartOnValueSelectListener() {
            @Override
            public void onValueSelected(int arcIndex, SliceValue value) {

               // Toast.makeText(TaskActivity.this, ""+value.getValue(), Toast.LENGTH_SHORT).show();


                Toast.makeText(TaskActivity.this, new StringBuilder().append("").append(value.getLabel()).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onValueDeselected() {

            }
        });

    }

}

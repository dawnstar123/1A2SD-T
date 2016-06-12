package com.woof.cuhacks_dawnstar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class WaterGraph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int xfs = Water.getMyInt();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_graph);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(1, xfs),
                new DataPoint(2, 0),
                new DataPoint(3, 0),
                new DataPoint(4, 0)
        });
        graph.addSeries(series);
    }
}

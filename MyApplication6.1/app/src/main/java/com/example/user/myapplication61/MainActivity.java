package com.example.user.myapplication61;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);
        getFragmentManager().findFragmentById(R.id.frame1);
    }

    public static class SimpleAddtion extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.activity_main, container, false);

            Button b = (Button) v.findViewById(R.id.btn1);
            final EditText et1 = (EditText) v.findViewById(R.id.et1);
            final TextView tv1 = (TextView) v.findViewById(R.id.tv1);

            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    tv1.setText(et1.getText().toString());
                }
            });
            return v;
        }
    }

}
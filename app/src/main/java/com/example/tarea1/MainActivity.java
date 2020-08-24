package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      TextView textnombre;
      TextView textapellido;
      TextView textci;
      Button btnrojo;
      Button btnamarillo;
      Button btnverde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          textnombre=(TextView)this.findViewById(R.id.textView);
          textapellido=(TextView)this.findViewById(R.id.textView2);
          textci=(TextView)this.findViewById(R.id.textView3);
          btnrojo=(Button)this.findViewById(R.id.button);
          btnamarillo=(Button)this.findViewById(R.id.button1);
          btnverde=(Button)this.findViewById(R.id.button2);
          btnrojo.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  textnombre.setTextColor(Color.RED);
                  textapellido.setTextColor(Color.YELLOW);
                  textci.setTextColor(Color.GREEN);
              }
          });

          btnamarillo.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  textnombre.setTextColor(Color.YELLOW);
                  textapellido.setTextColor(Color.GREEN);
                  textci.setTextColor(Color.RED);
              }
          });
          btnverde.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  textnombre.setTextColor(Color.GREEN);
                  textapellido.setTextColor(Color.RED);
                  textci.setTextColor(Color.YELLOW);
              }
          });
    }


}
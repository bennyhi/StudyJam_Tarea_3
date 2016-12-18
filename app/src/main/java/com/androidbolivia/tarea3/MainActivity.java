package com.androidbolivia.tarea3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Resultado,Acumul;
    private TextView Coma;
    private TextView Cero;
    private TextView Igual;
    private TextView Uno;
    private TextView Dos;
    private TextView Tres;
    private TextView Cuatro;
    private TextView Cinco;
    private TextView Seis;
    private TextView Siete;
    private TextView Ocho;
    private TextView Nueve;
    private TextView Borrar;
    private TextView Dividir;
    private TextView Multiplicar;
    private TextView Restar;
    private TextView Sumar;
    int sw=0; float prim;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Resultado= (TextView) findViewById(R.id.tvResultado);
        Coma= (TextView) findViewById(R.id.tvComa);
        Cero= (TextView) findViewById(R.id.tvCero);
        Igual= (TextView) findViewById(R.id.tvIgual);
        Uno= (TextView) findViewById(R.id.tvUno);
        Dos= (TextView) findViewById(R.id.tvDos);
        Tres= (TextView) findViewById(R.id.tvTres);
        Cuatro= (TextView) findViewById(R.id.tvCuatro);
        Cinco= (TextView) findViewById(R.id.tvCinco);
        Seis= (TextView) findViewById(R.id.tvSeis);
        Siete= (TextView) findViewById(R.id.tvSiete);
        Ocho= (TextView) findViewById(R.id.tvOcho);
        Nueve= (TextView) findViewById(R.id.tvNueve);
        Borrar= (TextView) findViewById(R.id.tvCE);
        Dividir= (TextView) findViewById(R.id.tvDivision);
        Multiplicar= (TextView) findViewById(R.id.tvMultiplicacion);
        Restar= (TextView) findViewById(R.id.tvResta);
        Sumar= (TextView) findViewById(R.id.tvSuma);
        Acumul= (TextView) findViewById(R.id.tvAcumul);
    }
    public void uno(View v)
    {
        String res=Resultado.getText().toString()+1;
        Resultado.setText(res);
    }
    public void dos(View v)
    {
        String res=Resultado.getText().toString()+2;
        Resultado.setText(res);
    }
    public void tres(View v)
    {
        String res=Resultado.getText().toString()+3;
        Resultado.setText(res);
    }
    public void cuatro(View v)
    {
        String res=Resultado.getText().toString()+4;
        Resultado.setText(res);
    }
    public void cinco(View v)
    {
        String res=Resultado.getText().toString()+5;
        Resultado.setText(res);
    }
    public void seis(View v)
    {
        String res=Resultado.getText().toString()+6;
        Resultado.setText(res);
    }
    public void siete(View v)
    {
        String res=Resultado.getText().toString()+7;
        Resultado.setText(res);
    }
    public void ocho(View v)
    {
        String res=Resultado.getText().toString()+8;
        Resultado.setText(res);
    }
    public void nueve(View v)
    {
        String res=Resultado.getText().toString()+9;
        Resultado.setText(res);
    }
    public void cero(View v)
    {
        String res=Resultado.getText().toString()+0;
        Resultado.setText(res);
    }
    public void coma(View v)
    {
        String res=Resultado.getText().toString()+".";
        Resultado.setText(res);
    }
    public void suma(View v)
    {
        prim=Float.parseFloat(Resultado.getText().toString());
        Acumul.setText(Resultado.getText().toString()+"+");
        String res="+";
        Resultado.setText(res);
        sw=1;
        Resultado.setText("");
    }
    public void resta(View v)
    {
        prim=Float.parseFloat(Resultado.getText().toString());
        Acumul.setText(Resultado.getText().toString()+"-");
        String res="-";
        Resultado.setText(res);
        sw=2;
        Resultado.setText("");
    }
    public void multiplicacion(View v)
    {
        prim=Float.parseFloat(Resultado.getText().toString());
        Acumul.setText(Resultado.getText().toString()+"x");
        String res="x";
        Resultado.setText(res);
        sw=3;
        Resultado.setText("");
    }
    public void dividir(View v)
    {
        prim=Float.parseFloat(Resultado.getText().toString());
        Acumul.setText(Resultado.getText().toString()+"/");
        String res="/";
        Resultado.setText(res);
        sw=4;
        Resultado.setText("");
    }
    public void borrar(View v)
    {
        Resultado.setText("");
        Acumul.setText("");
    }
    public void igual(View v)
    {
        Acumul.setText(Acumul.getText().toString()+Resultado.getText().toString());
        float segund=Float.parseFloat(Resultado.getText().toString());
        String res=Resultado.getText().toString();
        float rest=0;
        float n1=prim, n2=segund;
        switch (sw){
            case 1 :
                rest=n1+n2;
                break;
            case 2 :
                rest=n1-n2;
                break;
            case 3 :
                rest=n1*n2;
                break;
            case 4 :
                rest=n1/n2;
                break;
        }
        Resultado.setText(""+rest);
    }
}

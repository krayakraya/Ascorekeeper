package franek.ascorekeeper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity2 extends Activity {
    Button button;
    int a=0,a1=0,b=0,b1,c,c1,d,d1,e,e1,f,f1,g,g1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        button = (Button) findViewById(R.id.gumb2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(activity2.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    public void reza1(View view) {
        a++;
        display(a);
    }
    public void reza1a(View view)
    {
        a--;
        if(a==-1)
        {
            a=0;
        }
        display(a);
    }

    private void display(int a) {
        TextView quantityTextView = (TextView) findViewById(R.id.reza1);
        quantityTextView.setText("" + a);
    }
    public void reza2(View view) {
        a1++;
        display2(a1);
    }
    public void reza2a(View view)
    {
        a1--;
        if(a1==-1)
        {
            a1=0;
        }
        display2(a1);
    }



    private void display2(int a1) {
        TextView quantityTextView = (TextView) findViewById(R.id.reza2);
        quantityTextView.setText("" + a1);
    }
    public void udarci1(View view) {
        b++;
        display3(b);
    }
    public void udarciminus1(View view)
    {
        b--;
        if(b==-1)
        {
            b=0;
        }
        display3(b);
    }

    private void display3(int b) {
        TextView quantityTextView = (TextView) findViewById(R.id.udarci1);
        quantityTextView.setText("" + b);
    }

    public void udarci2(View view) {
        b1++;
        display4(b1);
    }
    public void udarciminus2(View view)
    {
        b1--;
        if(b1==-1)
        {
            b1=0;
        }
        display4(b1);
    }

    private void display4(int b1) {
        TextView quantityTextView = (TextView) findViewById(R.id.udarci2);
        quantityTextView.setText("" + b1);
    }


    public void udarciokvir1(View view) {
        c++;
        display5(c);
    }
    public void udarciokvirminus1(View view)
    {
        c--;
        if(c==-1)
        {
            c=0;
        }
        display5(c);
    }

    private void display5(int c) {
        TextView quantityTextView = (TextView) findViewById(R.id.udarciokvir1);
        quantityTextView.setText("" + c);
    }

    public void udarciokvir2(View view) {
        c1++;
        display6(c1);
    }
    public void udarciokvirminus2(View view)
    {
        c1--;
        if(c1==-1)
        {
            c1=0;
        }
        display6(c1);
    }

    private void display6(int c1) {
        TextView quantityTextView = (TextView) findViewById(R.id.udarciokvir2);
        quantityTextView.setText("" + c1);
    }
    public void prekrsaj1(View view) {
        d++;
        display7(d);
    }
    public void prekrsajminus1(View view)
    {
        d--;
        if(d==-1)
        {
            d=0;
        }
        display7(d);
    }

    private void display7(int d) {
        TextView quantityTextView = (TextView) findViewById(R.id.prekrsaj1);
        quantityTextView.setText("" + d);
    }
    public void prekrsaj2(View view) {
        d1++;
        display8(d1);
    }
    public void prekrsajminus2(View view)
    {
        d1--;
        if(d1==-1)
        {
            d1=0;
        }
        display8(d1);
    }

    private void display8(int d1) {
        TextView quantityTextView = (TextView) findViewById(R.id.prekrsaj2);
        quantityTextView.setText("" + d1);
    }

    public void korner1(View view) {
        e++;
        display9(e);
    }
    public void kornerminus1(View view)
    {
        e--;
        if(e==-1)
        {
            e=0;
        }
        display9(e);
    }

    private void display9(int e) {
        TextView quantityTextView = (TextView) findViewById(R.id.korner1);
        quantityTextView.setText("" + e);
    }
    public void korner2(View view) {
        e1++;
        display10(e1);
    }
    public void kornerminus2(View view)
    {
        e1--;
        if(e1==-1)
        {
            e1=0;
        }
        display10(e1);
    }
    private void display10(int e1) {
        TextView quantityTextView = (TextView) findViewById(R.id.korner2);
        quantityTextView.setText("" + e1);
    }


    public void zuti1(View view) {
        f++;
        display11(f);
    }
    public void zutiminus1(View view)
    {
        f--;
        if(f==-1)
        {
            f=0;
        }
        display11(f);
    }

    private void display11(int f) {
        TextView quantityTextView = (TextView) findViewById(R.id.zuti1);
        quantityTextView.setText("" + f);
    }

    public void zuti2(View view) {
        f1++;
        display12(f1);
    }
    public void zutiminus2(View view)
    {
        f1--;
        if(f1==-1)
        {
            f1=0;
        }
        display12(f1);
    }

    private void display12(int f1) {
        TextView quantityTextView = (TextView) findViewById(R.id.zuti2);
        quantityTextView.setText("" + f1);
    }




    public void crveni1(View view) {
        g++;
        display13(g);
    }
    public void crveniminus1(View view)
    {
        g--;
        if(g==-1)
        {
            g=0;
        }
        display13(g);
    }

    private void display13(int g) {
        TextView quantityTextView = (TextView) findViewById(R.id.crveni1);
        quantityTextView.setText("" + g);
    }

    public void crveni2(View view) {
        g1++;
        display14(g1);
    }
    public void crveniminus2(View view)
    {
        g1--;
        if(g1==-1)
        {
            g1=0;
        }
        display14(g1);
    }

    private void display14(int g1) {
        TextView quantityTextView = (TextView) findViewById(R.id.crveni2);
        quantityTextView.setText("" + g1);
    }
}





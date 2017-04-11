package franek.ascorekeeper;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class kviz2 extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button button;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kviz2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio1) {
                    setContentView(R.layout.activity_kviz2);
                } else if (checkedId == R.id.radio2) {
                    setContentView(R.layout.activity_kviz2);
                } else if (checkedId == R.id.radio3) {
                    setContentView(R.layout.activity_kviz2);
                } else {
                    setContentView(R.layout.activity_kviz2);
                }
            }
        });

    }


    public void porukakrivo (View view)
    {
        Toast ToastMessage = Toast.makeText(getApplicationContext(),"Incorrect, try again!",Toast.LENGTH_SHORT);
        View toastView = ToastMessage.getView();
        toastView.setBackgroundResource(+R.layout.toast_background_color);
        ToastMessage.show();
    }

    public void porukafly (View view)
    {
        Toast ToastMessage = Toast.makeText(getApplicationContext(),"I BELIEVE I CAN FLY, I BELIEVE...incorrect!",Toast.LENGTH_SHORT);
        View toastView = ToastMessage.getView();
        toastView.setBackgroundResource(+R.layout.toast_background_color);
        ToastMessage.show();            }
    public void porukatired (View view)
    {
        Toast ToastMessage = Toast.makeText(getApplicationContext(),"Sometimes i'm really tired, but i still wouldn't answer this!",Toast.LENGTH_SHORT);
        View toastView = ToastMessage.getView();
        toastView.setBackgroundResource(+R.layout.toast_background_color);
        ToastMessage.show();
    }



    public void tocanOdgovor2 (View view)
    {
        Toast ToastMessage = Toast.makeText(getApplicationContext(),"Yes, it's the correct answer, GO ON !",Toast.LENGTH_SHORT);
        View toastView = ToastMessage.getView();
        toastView.setBackgroundResource(+R.layout.toast_background_color2);
        ToastMessage.show();
        button = (Button) findViewById(R.id.gumbkvizfinal);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(kviz2.this, about.class);
                startActivity(i);
            }

        });

        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/fonty.ttf");
        TextView myTextView = (TextView)findViewById(R.id.textView4);
        myTextView.setTypeface(myTypeface);
    }

}



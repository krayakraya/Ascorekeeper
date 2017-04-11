package franek.ascorekeeper;

    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.Button;
    import android.widget.RadioButton;
    import android.widget.RadioGroup;
    import android.widget.TextView;
    import android.widget.Toast;

        public class kviz extends AppCompatActivity {
            private RadioGroup radioGroup;
            private Button button;
            int a;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_kviz);
                button = (Button) findViewById(R.id.gumbkviz2);
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(kviz.this, kviz2.class);
                        startActivity(i);
                    }

                });
                radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if (checkedId == R.id.radio1) {
                            setContentView(R.layout.activity_kviz);
                        } else if (checkedId == R.id.radio2) {
                            setContentView(R.layout.activity_kviz);
                        } else if (checkedId == R.id.radio3) {
                            setContentView(R.layout.activity_kviz);
                        } else {
                            setContentView(R.layout.activity_kviz);
                        }
                    }
                });

            }

        public void porukacarrots (View view)
        {
            Toast ToastMessage = Toast.makeText(getApplicationContext(),"Really? Carrots?Do red pandas look like bunnies to you?",Toast.LENGTH_SHORT);
            View toastView = ToastMessage.getView();
            toastView.setBackgroundResource(+R.layout.toast_background_color);
            ToastMessage.show();
        }
        public void porukakrivo (View view)
        {
            Toast ToastMessage = Toast.makeText(getApplicationContext(),"Incorrect, try again!",Toast.LENGTH_SHORT);
            View toastView = ToastMessage.getView();
            toastView.setBackgroundResource(+R.layout.toast_background_color);
            ToastMessage.show();
        }
        public void porukabananas (View view)
        {
            Toast ToastMessage = Toast.makeText(getApplicationContext(),"Bananas are cool but the answer is incorrect!",Toast.LENGTH_SHORT);
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


            public void tocanOdgovor1 (View view)
            {
                Toast ToastMessage = Toast.makeText(getApplicationContext(),"Correct, CONTINUE , you're awesome!",Toast.LENGTH_SHORT);
                View toastView = ToastMessage.getView();
                toastView.setBackgroundResource(+R.layout.toast_background_color2);
                ToastMessage.show();
                button = (Button) findViewById(R.id.gumbkviz2);
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(kviz.this, kviz2.class);
                        startActivity(i);
                    }

                });
            }

    }



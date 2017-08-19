package hoandeptraicompany.com.tienganhnhamnhi.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import hoandeptraicompany.com.tienganhnhamnhi.ObjectClass.EnglishClass;
import hoandeptraicompany.com.tienganhnhamnhi.R;

public class ConfirmActivity extends AppCompatActivity {
    private TextView txtAnswer;
    private TextView txtExplain;
    private Button btnNext;
    MainActivity mainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        txtAnswer = (TextView) findViewById(R.id.txtAnswer);
        txtExplain = (TextView) findViewById(R.id.txtExplain);
        btnNext = (Button) findViewById(R.id.btnNext);
        Intent intent = getIntent();

        EnglishClass question = (EnglishClass) intent.getSerializableExtra("question");
        txtAnswer.setText(question.getVietnamese() + "");
        txtExplain.setText(question.getExplian() + "");
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resutlItent = new Intent();
                setResult(MainActivity.RESULT_CONFIRMACTIVIATY);

                finish();
            }
        });


    }
}

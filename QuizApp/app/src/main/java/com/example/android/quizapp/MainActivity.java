package com.example.android.quizapp;

import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    boolean isSubmit = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz (View view) {

        // Question 1

        CheckBox question1answera = (CheckBox) findViewById(R.id.resp_a_question_1);
        boolean hasquestion1answera = question1answera.isChecked();

        CheckBox question1answerc = (CheckBox) findViewById(R.id.resp_c_question_1);
        boolean hasquestion1answerc = question1answerc.isChecked();

        CheckBox question1answerd = (CheckBox) findViewById(R.id.resp_d_question_1);
        boolean hasquestion1answerd = question1answerd.isChecked();

        CheckBox question1answere = (CheckBox) findViewById(R.id.resp_e_question_1);
        boolean hasquestion1answere = question1answere.isChecked();

        CheckBox question1answerf = (CheckBox) findViewById(R.id.resp_f_question_1);
        boolean hasquestion1answerf = question1answerf.isChecked();

        // Question 2
        RadioButton question2 = (RadioButton) findViewById(R.id.radio_button_two_b);
        boolean question2isb = question2.isChecked();

        // Question 3
        RadioButton question3 = (RadioButton) findViewById(R.id.radio_button_three_a);
        boolean question3isa = question3.isChecked();

        // Question 4
        EditText question4 = (EditText) findViewById(R.id.edit_answer_one);
        String resp4 = question4.getText().toString();

        // Question 5
        RadioButton question5 = (RadioButton) findViewById(R.id.radio_button_five_b);
        boolean question5isb = question5.isChecked();


        // Add points

        if (isSubmit) {

            TextView txt1 = (TextView) findViewById(R.id.answer_status_one);
            txt1.setVisibility(View.VISIBLE);
            if (hasquestion1answera && hasquestion1answerc && hasquestion1answerd && hasquestion1answere
                    && hasquestion1answerf) {
                score += 20;
                txt1.setText("CORRECT");
                txt1.setTextColor(Color.parseColor("#009B10"));
            }
            else
            {
                txt1.setText("INCORRECT");
                txt1.setTextColor(Color.parseColor("#F44336"));
            }

            TextView txt2 = (TextView) findViewById(R.id.answer_status_two);
            txt2.setVisibility(View.VISIBLE);
            if (question2isb) {
                score += 20;
                txt2.setText("CORRECT");
                txt2.setTextColor(Color.parseColor("#009B10"));
            }
            else
            {
                txt2.setText("INCORRECT");
                txt2.setTextColor(Color.parseColor("#F44336"));
            }

            TextView txt3 = (TextView) findViewById(R.id.answer_status_three);
            txt3.setVisibility(View.VISIBLE);
            if (question3isa) {
                score += 20;
                txt3.setText("CORRECT");
                txt3.setTextColor(Color.parseColor("#009B10"));
            }
            else
            {
                txt3.setText("INCORRECT");
                txt3.setTextColor(Color.parseColor("#F44336"));
            }

            TextView txt4 = (TextView) findViewById(R.id.answer_status_four);
            txt4.setVisibility(View.VISIBLE);
            if (resp4.equals("Madrid") || resp4.equals("madrid") || resp4.equals("MADRID")) {
                score += 20;
                txt4.setText("CORRECT");
                txt4.setTextColor(Color.parseColor("#009B10"));
            }
            else
            {
                txt4.setText("INCORRECT");
                txt4.setTextColor(Color.parseColor("#F44336"));
            }

            TextView txt5 = (TextView) findViewById(R.id.answer_status_five);
            txt5.setVisibility(View.VISIBLE);
            if (question5isb) {
                score += 20;
                txt5.setText("CORRECT");
                txt5.setTextColor(Color.parseColor("#009B10"));
            }
            else
            {
                txt5.setText("INCORRECT");
                txt5.setTextColor(Color.parseColor("#F44336"));
            }

            // Show the total score
            Toast.makeText(this, "Your score is: " + score + " out of 100.", Toast.LENGTH_LONG).show();
            isSubmit = false;
        }
        else
            Toast.makeText(this, "You already sent the quiz.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Reset the answer and score when the reset button is clicked
     */
    public void resetQuiz (View view){
        // Clear answer question 1

        CheckBox question1answera = (CheckBox) findViewById(R.id.resp_a_question_1);
        if (question1answera.isChecked())
            question1answera.setChecked(false);

        CheckBox question1anserb = (CheckBox) findViewById(R.id.resp_b_question_1);
        if (question1anserb.isChecked())
            question1anserb.setChecked(false);

        CheckBox question1answerc = (CheckBox) findViewById(R.id.resp_c_question_1);
        if (question1answerc.isChecked())
            question1answerc.setChecked(false);

        CheckBox question1answerd = (CheckBox) findViewById(R.id.resp_d_question_1);
        if (question1answerd.isChecked())
            question1answerd.setChecked(false);

        CheckBox question1answere = (CheckBox) findViewById(R.id.resp_e_question_1);
        if (question1answere.isChecked())
            question1answere.setChecked(false);

        CheckBox question1answerf = (CheckBox) findViewById(R.id.resp_f_question_1);
        if (question1answerf.isChecked())
            question1answerf.setChecked(false);

        TextView txt1 = (TextView) findViewById(R.id.answer_status_one);
        txt1.setVisibility(View.GONE);

        // Clear answer question 2
        RadioGroup question2 = (RadioGroup) findViewById(R.id.radio_group_two);
        question2.clearCheck();

        TextView txt2 = (TextView) findViewById(R.id.answer_status_two);
        txt2.setVisibility(View.GONE);

        // Clear answer question 3
        RadioGroup question3 = (RadioGroup) findViewById(R.id.radio_group_three);
        question3.clearCheck();

        TextView txt3 = (TextView) findViewById(R.id.answer_status_three);
        txt3.setVisibility(View.GONE);

        // Clear answer question 4
        EditText question4 = (EditText) findViewById(R.id.edit_answer_one);
        question4.setText(null);

        TextView txt4 = (TextView) findViewById(R.id.answer_status_four);
        txt4.setVisibility(View.GONE);

        // Clear answer question 5
        RadioGroup question5 = (RadioGroup) findViewById(R.id.radio_group_five);
        question5.clearCheck();

        TextView txt5 = (TextView) findViewById(R.id.answer_status_five);
        txt5.setVisibility(View.GONE);

        score = 0;
        isSubmit = true;
    }
}



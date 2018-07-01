package tz.app.quiz.georgia.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int marksScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

     //A method to submit answers and to display results

    public void Submit(View view) {



        //Count for question one
        int marks = onRadioButtonClickedQuestionOne(8);
        //Count for question two;
        int marks2 = onRadioButtonClickedQuestionFour(0);
        //count for question with checkbox
        int mark3 = checkboxes(0);
        //Count for question five
        int marks5 = onRadioButtonClickedQuestionFive(0);
        //Total score
        int totalMarks = marks + marks2 + mark3 + marks5;

        Toast.makeText(getApplicationContext(), "You have scored  " + totalMarks, Toast.LENGTH_LONG).show();

    }

    public int onRadioButtonClickedQuestionOne(int marksOne) {
        marksOne = 0;


        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroupOne);

        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        //Calling the specific button from a radio group
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
        //Store the selected button in String variable
        String selectedButton = (String) radioButton.getText();

        //Cheking the right score for question number one
        if (selectedButton.equalsIgnoreCase("8")) {
            marksOne++;
        } else {

        }
        return marksOne;
    }

    public int onRadioButtonClickedQuestionFour(int marksTwo) {
        marksTwo = 0;
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroupFour);

        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        //Calling the specific button from a radio group
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
        //Store the selected button in String variable
        String selectedButton = (String) radioButton.getText();

        //Cheking the right score for question number one
        if (selectedButton.equalsIgnoreCase("Jupiter")) {
            marksTwo++;
        } else {

        }
        return marksTwo;
    }

    public int onRadioButtonClickedQuestionFive(int marksFive) {
        marksFive = 0;
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroupFive);

        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        //Calling the specific button from a radio group
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);
        //Store the selected button in String variable
        String selectedButton = (String) radioButton.getText();

        //Cheking the right score for question number one
        if (selectedButton.equalsIgnoreCase("Saturn")) {
            marksFive++;
        } else {

        }
        return marksFive;
    }

    public int checkboxes(int markCheckBox) {

        markCheckBox = 0;

        CheckBox checkBox1 = findViewById(R.id.secondqn_checkbox);
        CheckBox checkBox2 = findViewById(R.id.secondqn_checkboxtwo);
        CheckBox checkBox3 = findViewById(R.id.secondqn_checkboxthree);

        CheckBox checkThree_1 = findViewById(R.id.three_checkbox1);
        CheckBox checkThree_2 = findViewById(R.id.three_checkbox2);
        CheckBox checkThree_3 = findViewById(R.id.three_checkbox3);


        CheckBox checkBoxSix_1 = findViewById(R.id.six_checkbox1);
        CheckBox checkBoxSix_2 = findViewById(R.id.six_checkbox2);
        CheckBox checkBoxSix_3 = findViewById(R.id.six_checkbox3);

        //Checking box questiontwo
        boolean twoCheckBoxOne = checkBox1.isChecked();
        boolean twoCheckBoxTwo = checkBox2.isChecked();
        boolean twocheckBoxThree = checkBox3.isChecked();

        //Question three
        boolean threeCheckBoxOne = checkBox1.isChecked();
        boolean threeCheckBoxTwo = checkBox2.isChecked();
        boolean thirdcheckBoxThree = checkBox3.isChecked();


        //Checking qustion six
        boolean sixCheckBoxOne = checkBoxSix_1.isChecked();
        boolean sixCheckBoxTwo = checkBoxSix_2.isChecked();
        boolean sixCheckBoxThree = checkBoxSix_3.isChecked();

        if (twoCheckBoxOne || threeCheckBoxOne || sixCheckBoxTwo) {
            markCheckBox++;
        }
        if (twoCheckBoxTwo || twocheckBoxThree || threeCheckBoxTwo || thirdcheckBoxThree || sixCheckBoxOne || sixCheckBoxThree) {
            markCheckBox = markCheckBox + 0;
        } else {

        }
        return markCheckBox;
    }


}





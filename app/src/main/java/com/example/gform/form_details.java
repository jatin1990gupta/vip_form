package com.example.gform;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class form_details extends AppCompatActivity {

    EditText emailET,nameET,collegeET,mobET,othertechTV2,lkinET,fbprofET,gitET,resumeET,whyET,expET,suggestET,reffET;
    SeekBar ageSB;
    TextView dispAge;
    Spinner yearSpn;
    RadioButton fmaleRB,maleRB,otherRB;
    CheckBox reachCB1,desgCB1,markCB1,writCB1,progCB1,mangCB1,pyCB2,javaCB2,reactCB2,angCB2,htmlCB2,phpCB2,nodeCB2,sqlCB2,cCB2,goCB2,
            othertechCB2,webCB3,appCB3,swCB3,datasCB3,blckCB3,cloudCB3,devCB3,quantCB3,compCB3,prodCB3,cyberCB3,consentCB;
    Button smtBtn;
    int age=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_details);


        nameET =(EditText)findViewById(R.id.nameET);
        emailET =(EditText)findViewById(R.id.emailET);
        collegeET =(EditText)findViewById(R.id.collegeET);
        mobET =(EditText)findViewById(R.id.mobET);
        othertechTV2 =(EditText)findViewById(R.id.othertechTV2);
        lkinET =(EditText)findViewById(R.id.lkinET);
        fbprofET =(EditText)findViewById(R.id.fbprofET);
        gitET =(EditText)findViewById(R.id.gitET);
        resumeET =(EditText)findViewById(R.id.resumeET);
        whyET =(EditText)findViewById(R.id.whyET);
        expET =(EditText)findViewById(R.id.expET);
        suggestET =(EditText)findViewById(R.id.suggestET);
        reffET =(EditText)findViewById(R.id.reffEV);

        reachCB1 =(CheckBox)findViewById(R.id.reachCB1);
        desgCB1 =(CheckBox)findViewById(R.id.desgCB1);
        markCB1 =(CheckBox)findViewById(R.id.markCB1);
        writCB1 =(CheckBox)findViewById(R.id.writCB1);
        progCB1 =(CheckBox)findViewById(R.id.progCB1);
        mangCB1 =(CheckBox)findViewById(R.id.mangCB1);
        pyCB2 =(CheckBox)findViewById(R.id.pyCB2);
        javaCB2 =(CheckBox)findViewById(R.id.javaCB2);
        reactCB2 =(CheckBox)findViewById(R.id.reactCB2);
        angCB2 =(CheckBox)findViewById(R.id.angCB2);
        htmlCB2 =(CheckBox)findViewById(R.id.htmlCB2);
        phpCB2 =(CheckBox)findViewById(R.id.phpCB2);
        nodeCB2 =(CheckBox)findViewById(R.id.nodeCB2);
        sqlCB2 =(CheckBox)findViewById(R.id.sqlCB2);
        cCB2 =(CheckBox)findViewById(R.id.cCB2);
        goCB2 =(CheckBox)findViewById(R.id.goCB2);
        othertechCB2 =(CheckBox)findViewById(R.id.othertechCB2);
        webCB3 =(CheckBox)findViewById(R.id.webCB3);
        appCB3 =(CheckBox)findViewById(R.id.appCB3);
        swCB3 =(CheckBox)findViewById(R.id.swCB3);
        datasCB3 =(CheckBox)findViewById(R.id.datasCB3);
        blckCB3 =(CheckBox)findViewById(R.id.blckCB3);
        cloudCB3 =(CheckBox)findViewById(R.id.cloudCB3);
        devCB3 =(CheckBox)findViewById(R.id.devCB3);
        quantCB3 =(CheckBox)findViewById(R.id.quantCB3);
        compCB3 =(CheckBox)findViewById(R.id.compCB3);
        prodCB3 =(CheckBox)findViewById(R.id.prodCB3);
        cyberCB3 =(CheckBox)findViewById(R.id.cyberCB3);
        consentCB =(CheckBox)findViewById(R.id.consentCB);

        ageSB =(SeekBar) findViewById(R.id.ageSB);
        dispAge =(TextView) findViewById(R.id.dispAge);
        yearSpn =(Spinner) findViewById(R.id.yearSpn);

        fmaleRB =(RadioButton) findViewById(R.id.fmaleRB);
        maleRB =(RadioButton) findViewById(R.id.maleRB);
        otherRB =(RadioButton) findViewById(R.id.otherRB);

        smtBtn =(Button) findViewById(R.id.smtBtn);
        othertechTV2.setEnabled(false);


        ageSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min=1;
                if(progress<min){
                    age = min;
                }
                else {
                    age = progress;
                }
                dispAge.setText(Integer.toString(age));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        othertechCB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othertechTV2.setEnabled(true);
            }
        });


        smtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String email = emailET.getText().toString();
                String name = nameET.getText().toString();
                int age = ageSB.getProgress();
                String college = collegeET.getText().toString();
                String year = yearSpn.getSelectedItem().toString();
                String mobile = mobET.getText().toString();
                mobile = "+91 "+mobile;

                String gender = null;
                if(fmaleRB.isChecked()){ gender = fmaleRB.getText().toString(); }
                else if(maleRB.isChecked()){ gender = maleRB.getText().toString(); }
                else if(otherRB.isChecked()){ gender = otherRB.getText().toString(); }

                String aexp = "";
                if(reachCB1.isChecked()){aexp+="Reaching Out (Companies/Colleges)\n";}
                if(desgCB1.isChecked()){aexp+="Designing\n";}
                if(desgCB1.isChecked()){aexp+="\nDesigning";}
                if(markCB1.isChecked()){aexp+="\nMarketing";}
                if(writCB1.isChecked()){aexp+="\nWriting";}
                if(progCB1.isChecked()){aexp+="\nProgramming";}
                if(mangCB1.isChecked()){aexp+="\nManagement";}

                String techs = "";
                if(pyCB2.isChecked()){techs+="\nPython";}
                if(javaCB2.isChecked()){techs+="\nJavaScript";}
                if(reactCB2.isChecked()){techs+="\nReact";}
                if(angCB2.isChecked()){techs+="\nAngular";}
                if(htmlCB2.isChecked()){techs+="\nHTML + CSS";}
                if(phpCB2.isChecked()){techs+="\nPHP";}
                if(nodeCB2.isChecked()){techs+="\nNode.js";}
                if(sqlCB2.isChecked()){techs+="\nSQL / NoSQL";}
                if(cCB2.isChecked()){techs+="\nC#";}
                if(goCB2.isChecked()){techs+="\nGo";}
                if(othertechCB2.isChecked()){techs+="\n"+othertechTV2.getText().toString();}

                String specs = "";
                if(webCB3.isChecked()){specs+="Web Development\n";}
                if(appCB3.isChecked()){specs+="App Development\n";}
                if(swCB3.isChecked()){specs+="Software Development\n";}
                if(datasCB3.isChecked()){specs+="Data Science / ML / DL\n";}
                if(blckCB3.isChecked()){specs+="Blockchain\n";}
                if(cloudCB3.isChecked()){specs+="Cloud Computing\n";}
                if(devCB3.isChecked()){specs+="\nDevOps";}
                if(quantCB3.isChecked()){specs+="\nQuantum Computing";}
                if(compCB3.isChecked()){specs+="\nCompetitive Programming";}
                if(prodCB3.isChecked()){specs+="\nProduct Development";}
                if(cyberCB3.isChecked()){specs+="\nCybersecurity";}

                String lnkprof = lkinET.getText().toString();
                String fbprof = fbprofET.getText().toString();
                String gitprof = gitET.getText().toString();
                String lnkresume = resumeET.getText().toString();
                String why = whyET.getText().toString();
                String exp = expET.getText().toString();
                String suggest = suggestET.getText().toString();
                String reff = reffET.getText().toString();

                in response = new in(email,name,age,college,year,mobile,gender,aexp,techs,specs,lnkprof,fbprof,gitprof,lnkresume,why,exp,suggest,reff);

                if(email.length() == 0 || name.length()==0 || college.length()==0 || year.equals("Select Year") || mobile.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Please fill mandatory fields.",Toast.LENGTH_LONG).show();
                }
                else if(gender == null) {
                    Toast.makeText(getApplicationContext(),"Select gender",Toast.LENGTH_LONG).show();;
                }
                else if(mobile.length() != 14){
                    Toast.makeText(getApplicationContext(),"Enter a 10 digit mobile number.",Toast.LENGTH_LONG).show();
                }
                else if (!consentCB.isChecked()){
                    Toast.makeText(getApplicationContext(),"Please accept the terms and conditions !",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent i = new Intent(form_details.this,input_data.class);
                    i.putExtra("resp",response);
                    startActivity(i);
                }

                
            }
        });


    }
}

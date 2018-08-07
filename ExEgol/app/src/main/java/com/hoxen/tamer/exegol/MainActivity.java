package com.hoxen.tamer.exegol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.CharSequence;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CharSequence btnplace;
    int flag = 0; //Check whom turn it is, X or O, 0=x 1=O
    TextView pwinner,score1,score2;

    int _score1=0,_score2=0;
    char [][] TicTac=new char[3][3]; // Matrix to control the game
  //  int row,col;
    boolean winner=false;


@Override
    public void onClick(View view) {
    // This way didn't work with me :(
 /*   Button btn =(Button)view;
    if(btn.getText().toString()!="X") {
       String place = btn.getTag().toString();
        row = Integer.valueOf(place.substring(0,0)); // gets the row of the button to add it to the matrix
       col = Integer.valueOf(place.substring(1,1)); // same as above (column*)
       if (flag == 0) {
            btn.setText("X");
            TicTac[row][col]='X';
            flag = 1;
        } else {
            btn.setText("O");
            TicTac[row][col]='O';
            flag = 0;
        }
        // Checks if there is a winner
          if(TicTac[0][0]==TicTac[1][1] && TicTac[2][2]==TicTac[0][0])
                winner =true;
            if(TicTac[0][2]==TicTac[1][1] && TicTac[2][0]==TicTac[0][2])
                winner = true;
        for(int i=0;i<3;i++) {
            if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                winner = true;
            if(TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                winner=true;
        }

    }*/

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score1  = (TextView)findViewById(R.id.Player1s);
        score2  = (TextView)findViewById(R.id.Player2s);
        pwinner =(TextView)findViewById(R.id.tvWinner);
        Button btn1 = (Button)findViewById(R.id.btn00);
        Button btn2 = (Button)findViewById(R.id.btn01);
        Button btn3 = (Button)findViewById(R.id.btn02);
        Button btn4 = (Button)findViewById(R.id.btn10);
        Button btn5 = (Button)findViewById(R.id.btn11);
        Button btn6 = (Button)findViewById(R.id.btn12);
        Button btn7 = (Button)findViewById(R.id.btn20);
        Button btn8 = (Button)findViewById(R.id.btn21);
        Button btn9 = (Button)findViewById(R.id.btn22);
        Button btnContinuegame = (Button)findViewById(R.id.btnContinue);
        Button btnNewgame=(Button)findViewById(R.id.btnNewGame);
        Button btnMenu=(Button)findViewById(R.id.btnMenu);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                    if (flag == 0) {
                        btn.setText("X");
                        btn.setTextColor(getResources().getColor(R.color.Green));
                        TicTac[0][0] = 'X';
                        flag = 1;
                    } else {
                        btn.setText("O");
                        btn.setTextColor(getResources().getColor(R.color.Red));
                        TicTac[0][0] = 'O';
                        flag = 0;
                    }
                    // Checks if there is a winner
                    if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                        if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                            WinnerCheck();
                    }
                    if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                        if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                            WinnerCheck();
                    }

                    for (int i = 0; i < 3; i++) {
                        if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                            if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                            if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                WinnerCheck();
                        }

                    }
                }}
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                    if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                        if (flag == 0) {
                            btn.setText("X");
                            btn.setTextColor(getResources().getColor(R.color.Green));
                            TicTac[0][1] = 'X';
                            flag = 1;
                        } else {
                            btn.setText("O");
                            btn.setTextColor(getResources().getColor(R.color.Red));
                            TicTac[0][1] = 'O';
                            flag = 0;
                        }
                        // Checks if there is a winner
                        if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                            if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                            if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                                WinnerCheck();
                        }

                        for (int i = 0; i < 3; i++) {
                            if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                                if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                    WinnerCheck();
                            }
                            if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                                if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                    WinnerCheck();
                            }

                        }
                    }}
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                    if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                        if (flag == 0) {
                            btn.setText("X");
                            btn.setTextColor(getResources().getColor(R.color.Green));
                            TicTac[0][2] = 'X';
                            flag = 1;
                        } else {
                            btn.setText("O");
                            btn.setTextColor(getResources().getColor(R.color.Red));
                            TicTac[0][2] = 'O';
                            flag = 0;
                        }
                        // Checks if there is a winner
                        if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                            if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                            if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                                WinnerCheck();
                        }

                        for (int i = 0; i < 3; i++) {
                            if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                                if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                    WinnerCheck();
                            }
                            if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                                if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                    WinnerCheck();
                            }

                        }
                    }}
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                    if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                        if (flag == 0) {
                            btn.setText("X");
                            btn.setTextColor(getResources().getColor(R.color.Green));
                            TicTac[1][0] = 'X';
                            flag = 1;
                        } else {
                            btn.setText("O");
                            btn.setTextColor(getResources().getColor(R.color.Red));
                            TicTac[1][0] = 'O';
                            flag = 0;
                        }
                        // Checks if there is a winner
                        if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                            if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                            if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                                WinnerCheck();
                        }

                        for (int i = 0; i < 3; i++) {
                            if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                                if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                    WinnerCheck();
                            }
                            if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                                if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                    WinnerCheck();
                            }

                        }
                    }}
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                    if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                        if (flag == 0) {
                            btn.setText("X");
                            btn.setTextColor(getResources().getColor(R.color.Green));
                            TicTac[1][1] = 'X';
                            flag = 1;
                        } else {
                            btn.setText("O");
                            btn.setTextColor(getResources().getColor(R.color.Red));
                            TicTac[1][1] = 'O';
                            flag = 0;
                        }
                        // Checks if there is a winner
                        if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                            if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                            if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                                WinnerCheck();
                        }

                        for (int i = 0; i < 3; i++) {
                            if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                                if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                    WinnerCheck();
                            }
                            if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                                if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                    WinnerCheck();
                            }

                        }
                    }}
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                    if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                        if (flag == 0) {
                            btn.setText("X");
                            btn.setTextColor(getResources().getColor(R.color.Green));
                            TicTac[1][2] = 'X';
                            flag = 1;
                        } else {
                            btn.setText("O");
                            btn.setTextColor(getResources().getColor(R.color.Red));
                            TicTac[1][2] = 'O';
                            flag = 0;
                        }
                        // Checks if there is a winner
                        if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                            if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                            if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                                WinnerCheck();
                        }

                        for (int i = 0; i < 3; i++) {
                            if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                                if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                    WinnerCheck();
                            }
                            if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                                if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                    WinnerCheck();
                            }

                        }
                    }}
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                    if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                        if (flag == 0) {
                            btn.setText("X");
                            btn.setTextColor(getResources().getColor(R.color.Green));
                            TicTac[2][0] = 'X';
                            flag = 1;
                        } else {
                            btn.setText("O");
                            btn.setTextColor(getResources().getColor(R.color.Red));
                            TicTac[2][0] = 'O';
                            flag = 0;
                        }
                        // Checks if there is a winner
                        if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                            if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                            if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                                WinnerCheck();
                        }

                        for (int i = 0; i < 3; i++) {
                            if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                                if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                    WinnerCheck();
                            }
                            if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                                if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                    WinnerCheck();
                            }

                        }
                    }}
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                    if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                        if (flag == 0) {
                            btn.setText("X");
                            btn.setTextColor(getResources().getColor(R.color.Green));
                            TicTac[2][1] = 'X';
                            flag = 1;
                        } else {
                            btn.setText("O");
                            btn.setTextColor(getResources().getColor(R.color.Red));
                            TicTac[2][1] = 'O';
                            flag = 0;
                        }
                        // Checks if there is a winner
                        if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                            if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                            if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                                WinnerCheck();
                        }

                        for (int i = 0; i < 3; i++) {
                            if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                                if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                    WinnerCheck();
                            }
                            if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                                if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                    WinnerCheck();
                            }

                        }
                    }}
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn =(Button)view;
                if(!winner){
                    if(btn.getText().toString()!="X" && (btn.getText().toString()!="O")) {
                        if (flag == 0) {
                            btn.setText("X");
                            btn.setTextColor(getResources().getColor(R.color.Green));
                            TicTac[2][2] = 'X';
                            flag = 1;
                        } else {
                            btn.setText("O");
                            btn.setTextColor(getResources().getColor(R.color.Red));
                            TicTac[2][2] = 'O';
                            flag = 0;
                        }
                        // Checks if there is a winner
                        if(TicTac[0][0]=='X' || TicTac[0][0]=='O') {
                            if (TicTac[0][0] == TicTac[1][1] && TicTac[2][2] == TicTac[0][0])
                                WinnerCheck();
                        }
                        if(TicTac[0][2]=='X' || TicTac[0][2]=='O') {
                            if (TicTac[0][2] == TicTac[1][1] && TicTac[2][0] == TicTac[0][2])
                                WinnerCheck();
                        }

                        for (int i = 0; i < 3; i++) {
                            if(TicTac[i][0]=='X' || TicTac[i][0]=='O') {
                                if (TicTac[i][0] == TicTac[i][1] && TicTac[i][2] == TicTac[i][0])
                                    WinnerCheck();
                            }
                            if(TicTac[0][i]=='X' || TicTac[0][i]=='O') {
                                if (TicTac[0][i] == TicTac[1][i] && TicTac[2][i] == TicTac[0][i])
                                    WinnerCheck();
                            }

                        }
                    }}
            }
        });

        btnNewgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewGame();
            }
        });
        btnContinuegame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NextRound();
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Menu();
            }
        });
    }
        public void WinnerCheck(){
            winner=true;
            if(flag==1){
                pwinner = (TextView)findViewById(R.id.tvWinner);
                score2 = (TextView)findViewById(R.id.Player2s);
                pwinner.setText("Green won!");
                pwinner.setTextColor(getResources().getColor(R.color.Green));
                _score2++;
                score2.setText(_score2+"");

            }
            else{
                pwinner = (TextView)findViewById(R.id.tvWinner);
                score1 = (TextView)findViewById(R.id.Player1s);
                pwinner.setText("Red won!");
                pwinner.setTextColor(getResources().getColor(R.color.Red));
                _score1++;
                score1.setText(_score1+"");
            }
    }
    public void NewGame(){
        NextRound();
        score1 = (TextView)findViewById(R.id.Player1s);
        score2 = (TextView)findViewById(R.id.Player2s);
        score2.setText("0");
        score1.setText("0");
        _score1=0;
        _score2=0;
    }
    public void NextRound(){
        winner=false;
        pwinner = (TextView)findViewById(R.id.tvWinner);
        pwinner.setText("");
        Button btn1 = (Button)findViewById(R.id.btn00);
        Button btn2 = (Button)findViewById(R.id.btn01);
        Button btn3 = (Button)findViewById(R.id.btn02);
        Button btn4 = (Button)findViewById(R.id.btn10);
        Button btn5 = (Button)findViewById(R.id.btn11);
        Button btn6 = (Button)findViewById(R.id.btn12);
        Button btn7 = (Button)findViewById(R.id.btn20);
        Button btn8 = (Button)findViewById(R.id.btn21);
        Button btn9 = (Button)findViewById(R.id.btn22);
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                TicTac[i][j]='z';
            }
        }
    }
}



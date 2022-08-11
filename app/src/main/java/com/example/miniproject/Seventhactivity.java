package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Seventhactivity extends AppCompatActivity implements View.OnClickListener {

    boolean gameActive = true;


    Button btn;

    // Player representation
    // 0 - X
    // 1 - O
    int activePlayer = 0;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    // State meanings:
    //    0 - X
    //    1 - O
    //    2 - Null
    // put all win positions in a 2D array
    int[][] winPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}};

    ArrayList<Integer> emptySquares = new ArrayList<Integer>();
    ArrayList<Integer> player1 = new ArrayList<Integer>();
    ArrayList<Integer> player2 = new ArrayList<Integer>();

    public  void computer() {

        if (gameActive) {


            int selected = new Random().nextInt(9);
            if(emptySquares.contains(selected))
                computer();
            switch (selected) {
                case 0:
                    ImageView imageView1 = findViewById(R.id.imageView1);
                    imageView1.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(0);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;


                case 1:
                    ImageView imageView2 = findViewById(R.id.imageView2);
                    imageView2.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(1);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;

                case 2:
                    ImageView imageView3 = findViewById(R.id.imageView3);
                    imageView3.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(2);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;

                case 3:
                    ImageView imageView4 = findViewById(R.id.imageView4);
                    imageView4.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(3);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;

                case 4:
                    ImageView imageView5 = findViewById(R.id.imageView5);
                    imageView5.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(4);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;

                case 5:
                    ImageView imageView6 = findViewById(R.id.imageView6);
                    imageView6.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(5);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;

                case 6:
                    ImageView imageView7 = findViewById(R.id.imageView7);
                    imageView7.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(6);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;

                case 7:
                    ImageView imageView8 = findViewById(R.id.imageView8);
                    imageView8.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(7);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;

                case 8:
                    ImageView imageView9 = findViewById(R.id.imageView9);
                    imageView9.setImageResource(R.drawable.x);
                    activePlayer = 0;
                    player1.add(8);

                    //gameState[Integer.parseInt(selectedSquare)] = activePlayer;
                    break;
            }

            ImageView i= findViewById(R.id.imageView10);
            i.setImageResource(R.drawable.o);
            TextView status = findViewById(R.id.status);
            status.setText(" Turn - Tap to play");

            check();


        }
    }

    public void playerTap(View view) {


        TextView status = findViewById(R.id.status);
        status.setVisibility(View.VISIBLE);

        ImageView img = findViewById(R.id.imageView10);
        img.setVisibility(View.VISIBLE);

        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (!gameActive) {
            playAgain(view);
        }


            counter.setTranslationY(-1500);

            if(activePlayer == 0) {
                counter.setImageResource(R.drawable.o);
                activePlayer=1;

                player2.add(tappedCounter);
                emptySquares.add(tappedCounter);
                //emptySquares.remove(Integer.toString(tappedCounter));
                counter.animate().translationYBy(1500).setDuration(500);
                check();
                computer();


            }



    }



    public int check()

    {

        if ((player1.contains(0) && player1.contains(1) && player1.contains(2)) || (player1.contains(
                0
        ) && player1.contains(3) && player1.contains(6)) ||
                (player1.contains(2) && player1.contains(5) && player1.contains(8)) || (player1.contains(
                6
        ) && player1.contains(7) && player1.contains(8)) ||
                (player1.contains(3) && player1.contains(4) && player1.contains(5)) || (player1.contains(
                0
        ) && player1.contains(4) && player1.contains(8)) ||
                player1.contains(2) && player1.contains(4) && player1.contains(6) || (player1.contains(1) && player1.contains(
                4
        ) && player1.contains(7))
        ) {

            gameActive= false;
            ImageView i= findViewById(R.id.imageView10);
            i.setImageResource(R.drawable.x);
            TextView status = findViewById(R.id.status);
            status.setText(" has won");



            return 1;


        } else if ((player2.contains(0) && player2.contains(1) && player2.contains(2)) || (player2.contains(
                0
        ) && player2.contains(3) && player2.contains(6)) ||
                (player2.contains(2) && player2.contains(5) && player2.contains(8)) || (player2.contains(
                6
        ) && player2.contains(7) && player2.contains(8)) ||
                (player2.contains(3) && player2.contains(4) && player2.contains(5)) || (player2.contains(
                0
        ) && player2.contains(4) && player2.contains(8)) ||
                player2.contains(2) && player2.contains(4) && player2.contains(6) || (player2.contains(1) && player2.contains(
                4
        ) && player2.contains(7))
        ) {
            gameActive= false;
            ImageView i= findViewById(R.id.imageView10);
            i.setImageResource(R.drawable.o);
            TextView status = findViewById(R.id.status);
            status.setText(" has won");


            return 1;
        } else if (emptySquares.contains(0) && emptySquares.contains(1) && emptySquares.contains(2) && emptySquares.contains(
                3
        ) && emptySquares.contains(4) && emptySquares.contains(5) && emptySquares.contains(6) &&
                emptySquares.contains(7) && emptySquares.contains(8)
        ) {
            gameActive= false;

            String winnerStr;
            winnerStr = "Nobody has won";
            TextView status = findViewById(R.id.status);
            status.setText(winnerStr);

            return 1;

        }
        return 0;
    }




    // reset the game
    public void playAgain(View view)
    {

        TextView status = findViewById(R.id.status);
        status.setVisibility(View.INVISIBLE);

        ImageView img = findViewById(R.id.imageView10);
        img.setVisibility(View.INVISIBLE);

        player1.clear();
        player2.clear();
        emptySquares.clear();


        gameActive = true;
        activePlayer = 0;


        // remove all the images from the boxes inside the grid
        ((ImageView) findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView9)).setImageResource(0);



    }






















    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventhactivity);



        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this,singlemulti.class);

        startActivity(intent);

    }
}
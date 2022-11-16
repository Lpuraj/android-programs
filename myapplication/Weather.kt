package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Weather
import com.example.myapplication.R
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Weather : AppCompatActivity() {
    var gameActive = true

    // Player representation
    // 0 - X
    // 1 - O
    var activePlayer = 0
    var gameState = intArrayOf(2, 2, 2, 2, 2, 2, 2, 2, 2)

    // State meanings:
    //    0 - X
    //    1 - O
    //    2 - Null
    // put all win positions in a 2D array
    var winPositions = arrayOf(
        intArrayOf(0, 1, 2),
        intArrayOf(3, 4, 5),
        intArrayOf(6, 7, 8),
        intArrayOf(0, 3, 6),
        intArrayOf(1, 4, 7),
        intArrayOf(2, 5, 8),
        intArrayOf(0, 4, 8),
        intArrayOf(2, 4, 6)
    )

    // this function will be called every time a
    // players tap in an empty box of the grid
    fun playerTap(view: View) {
        val img = view as ImageView
        val tappedImage = img.tag.toString().toInt()

        // game reset function will be called
        // if someone wins or the boxes are full
        if (!gameActive) {
            gameReset(view)
        }

        // if the tapped image is empty
        if (gameState[tappedImage] == 2) {
            // increase the counter
            // after every tap
            counter++

            // check if its the last box
            if (counter == 9) {
                // reset the game
                gameActive = false
            }

            // mark this position
            gameState[tappedImage] = activePlayer

            // this will give a motion
            // effect to the image
            img.translationY = -1000f

            // change the active player
            // from 0 to 1 or 1 to 0
            if (activePlayer == 0) {
                // set the image of x
                img.setImageResource(R.drawable.x)
                activePlayer = 1
                val status = findViewById<TextView>(R.id.status)

                // change the status
                status.text = "O's Turn - Tap to play"
            } else {
                // set the image of o
                img.setImageResource(R.drawable.zero)
                activePlayer = 0
                val status = findViewById<TextView>(R.id.status)

                // change the status
                status.text = "X's Turn - Tap to play"
            }
            img.animate().translationYBy(1000f).duration = 300
        }
        var flag = 0
        // Check if any player has won
        for (winPosition in winPositions) {
            if (gameState[winPosition[0]] == gameState[winPosition[1]] && gameState[winPosition[1]] == gameState[winPosition[2]] && gameState[winPosition[0]] != 2) {
                flag = 1

                // Somebody has won! - Find out who!
                var winnerStr: String

                // game reset function be called
                gameActive = false
                winnerStr = if (gameState[winPosition[0]] == 0) {
                    "X has won"
                } else {
                    "O has won"
                }
                // Update the status bar for winner announcement
                val status = findViewById<TextView>(R.id.status)
                status.text = winnerStr
            }
        }
        // set the status if the match draw
        if (counter == 9 && flag == 0) {
            val status = findViewById<TextView>(R.id.status)
            status.text = "Match Draw"
        }
    }

    // reset the game
    fun gameReset(view: View?) {
        gameActive = true
        activePlayer = 0
        for (i in gameState.indices) {
            gameState[i] = 2
        }
        // remove all the images from the boxes inside the grid
        (findViewById<View>(R.id.imageView0) as ImageView).setImageResource(0)
        (findViewById<View>(R.id.imageView1) as ImageView).setImageResource(0)
        (findViewById<View>(R.id.imageView2) as ImageView).setImageResource(0)
        (findViewById<View>(R.id.imageView3) as ImageView).setImageResource(0)
        (findViewById<View>(R.id.imageView4) as ImageView).setImageResource(0)
        (findViewById<View>(R.id.imageView5) as ImageView).setImageResource(0)
        (findViewById<View>(R.id.imageView6) as ImageView).setImageResource(0)
        (findViewById<View>(R.id.imageView7) as ImageView).setImageResource(0)
        (findViewById<View>(R.id.imageView8) as ImageView).setImageResource(0)
        val status = findViewById<TextView>(R.id.status)
        status.text = "X's Turn - Tap to play"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
    }

    companion object {
        var counter = 0
    }
}
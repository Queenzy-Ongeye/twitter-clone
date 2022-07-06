package dev.queen.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.queen.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        displayTweets()
    }

    fun displayTweets(){
        var jon = Tweets("", "John Doe","@johnVin_doe", "Basking under the morning sun", "", "5", "", "0", "", "0", "")
        var mand = Tweets("", "Mandy","@jlandy", "Baking in Bahamas", "", "5", "", "0", "", "0", "")
        var winn = Tweets("", "WollyMain","@wolly", "I did not stutter.\n" +
                "I said what I said.", "", "5", "", "500", "", "6", "")
        var george = Tweets("", "George", "@master_chief", "Feminists watching Caroline Mutoko being roasted on twitter.", "", "600", "", "5000", "", "500", "")
        var caroM = Tweets("", "Caro", "@mutuko", "Feminists watching Caroline Mutoko being roasted on twitter.", "", "600", "", "5000", "", "500", "")
        var caro = Tweets("", "ManStivo", "@stivo_man", "\uD83D\uDC64: will you ever stop loving BTS ? \n" +
                "Me:", "", "600", "", "50", "", "500", "")


        var tweetList = mutableListOf(jon, mand, winn, george, caro, caroM)
        var tweetAdapter = TweetRecyclerViewAdapter(tweetList)

        bindingMain.rvTweets.layoutManager = LinearLayoutManager(this)
        bindingMain.rvTweets.adapter = tweetAdapter



    }
}
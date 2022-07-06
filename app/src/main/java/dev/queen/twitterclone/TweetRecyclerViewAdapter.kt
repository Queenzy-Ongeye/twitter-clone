package dev.queen.twitterclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRecyclerViewAdapter (var tweetList: List<Tweets>): RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.tweet_list, parent, false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweets = tweetList.get(position)
        holder.tweetname.text = currentTweets.name
        holder.handle.text = currentTweets.handle
        holder.tweet.text = currentTweets.tweet
        holder.tvcomment.text = currentTweets.tvComment
        holder.tvRweet.text = currentTweets.tvRetweet
        holder.tvFav.text = currentTweets.tvFav
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}

class TweetViewHolder (itemView: View): RecyclerView.ViewHolder (itemView){
    var tweetname = itemView.findViewById<TextView>(R.id.tvName)
    var handle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tweet = itemView.findViewById<TextView>(R.id.tvTwweet)
    var profile = itemView.findViewById<ImageView>(R.id.imgTweet)
    var comment = itemView.findViewById<ImageView>(R.id.imgComment)
    var fav = itemView.findViewById<ImageView>(R.id.imgFav)
    var retweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgshare = itemView.findViewById<ImageView>(R.id.imgShare)
    var tvcomment = itemView.findViewById<TextView>(R.id.tvComment)
    var tvFav = itemView.findViewById<TextView>(R.id.tvFav)
    var tvRweet = itemView.findViewById<TextView>(R.id.tvRetweet)


}
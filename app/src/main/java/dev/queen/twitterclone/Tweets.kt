package dev.queen.twitterclone

data class Tweets(var profile: String,
                  var name: String,
                  var handle: String,
                  var tweet: String,
                  var imgComment: String,
                  var tvComment: String,
                  var imgRetweet: String,
                  var tvRetweet: String,
                  var imgFav: String,
                  var tvFav: String,
                  var imgShare: String )

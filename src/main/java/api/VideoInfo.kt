package api

interface VideoInfo {

    fun getVideoAwards(videoId: Int=1): String
    fun getVideoInfo(videoId: Int=1): String
    fun getVideoPersons(videoId: Int): String
    fun searchVideo(query: String): String

}
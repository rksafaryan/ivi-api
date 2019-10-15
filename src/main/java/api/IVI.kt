package api

import model.DeviceApp
import model.Method
import utils.RequestHandler
import utils.URLDecoder

class IVI: VideoInfo {
    private val BASE_URL: String = "https://api.ivi.ru/mobileapi"

    override fun getVideoAwards(videoId: Int): String {
        return RequestHandler().getData(
            "${BASE_URL}/${URLDecoder.decode(Method.AWARDS.link)}?id=${videoId}&app_version=${DeviceApp.MOBILE_PHONE.code}"
        )
    }

    override fun getVideoInfo(videoId: Int): String {
        return RequestHandler().getData(
            "${BASE_URL}/${URLDecoder.decode(Method.INFO.link)}?id=${videoId}&app_version=${DeviceApp.MOBILE_PHONE.code}"
        )
    }

    override fun getVideoPersons(videoId: Int): String {
        return RequestHandler().getData(
            "${BASE_URL}/${URLDecoder.decode(Method.PERSONS.link)}?id=${videoId}&app_version=${DeviceApp.MOBILE_PHONE.code}"
        )
    }

    override fun searchVideo(query: String): String {
        val queryStr = query.replace("[\\s,.]".toRegex(),"%20")

        return RequestHandler().getData(
            "${BASE_URL}/${URLDecoder.decode(Method.SEARCH.link)}?query=${queryStr}&app_version=${DeviceApp.MOBILE_PHONE.code}"
        )
    }

}
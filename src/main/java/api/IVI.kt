package api

import utils.RequestHandler

class IVI(): FilmProvider {

    private val BASE_URL: String = "https://api.ivi.ru"
    private val app_v: String = "19782"

    override fun getFilmAwards(id: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFilmActors(id: Int): String {
        return RequestHandler().getData("${BASE_URL}/mobileapi/video/persons/v5/?id=${id}&app_version=${app_v}")
    }

    override fun getFilmInfo(id: Int): String {
        return RequestHandler().getData("${BASE_URL}/mobileapi/videoinfo/v6/?id=${id}&app_version=${app_v}")
    }

    override fun searchFilm(query: String): String {
        val queryStr = query.replace("[\\s,.]".toRegex(),"%20")
        return RequestHandler().getData("${BASE_URL}/mobileapi/search/v5/?query=${queryStr}&app_version=${app_v}")
    }
}
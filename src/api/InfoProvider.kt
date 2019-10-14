package api

interface InfoProvider {

    fun getFilmInfo(id: Int)
    fun searchFilm(id: Int)
    // - getFilmInfo
    // - getPersonInfo
}
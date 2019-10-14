package api

interface FilmProvider {

    fun getFilmInfo(id: Int): String
    fun searchFilm(query: String): String
    fun getFilmActors(id: Int): String
}
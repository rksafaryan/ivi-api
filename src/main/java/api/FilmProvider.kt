package api

interface FilmProvider {

    fun getFilmInfo(id: Int): String
    fun searchFilm(query: String): String
    fun getFilmActors(id: Int): String
    fun getFilmAwards(id: Int): String

    /*
    *VIDEO_AWARDS = (BASE_API_URL + "video/awards/v5/");
    VIDEO_CHECK_FAVOURITE = (BASE_API_URL + "video/favourite/v5/check");
    VIDEO_FROM_COMPILATION = (BASE_API_URL + "videofromcompilation/v5/");
    VIDEO_INFO = (BASE_API_URL + "videoinfo/v6/");
    VIDEO_PERSONS = (BASE_API_URL + "video/persons/v5/");
    VIDEO_PROPERTIES = (BASE_API_URL + "video/v5/properties/");
    VIDEO_REMOVE_FROM_FAVOURITE = (BASE_API_URL + "video/favourite/v5/delete");
    VIDEO_REVIEWS = (BASE_API_URL + "video/reviews/v5/best/");
    VIDEO_SEARCH = (BASE_API_URL + "search/v5/");
    VIDEO_USER_PREFERENCE_ADD = (BASE_API_URL + "video/user_preference/v5/add");
    VIDEO_USER_PREFERENCE_DELETE = (BASE_API_URL + "video/user_preference/v5/delete");
    VIDEO_WATCHTIME = (BASE_API_URL + "video/watchtime/v6/");
*/
}
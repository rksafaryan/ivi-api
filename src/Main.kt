import api.IVI
import utils.QueryBuilder
import utils.URLDecoder
import java.net.URI
import java.util.Arrays.asList

fun main() {
  // Program starts here
    val test = URLDecoder.encode("password")
    val res = URLDecoder.decode(test)

    print(
        IVI().getFilmActors(136232)
    )
}
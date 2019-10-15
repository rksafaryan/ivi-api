import utils.RequestHandler
import utils.URLDecoder





fun main() {
    val dec = URLDecoder().decode("aHR0cHM6Ly9qc29ucGxhY2Vob2xkZXIudHlwaWNvZGUuY29tL3VzZXJzLzE=".toByteArray())
    val test = RequestHandler().getData(dec)
}
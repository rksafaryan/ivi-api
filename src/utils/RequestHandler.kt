package utils

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

class RequestHandler {

    fun getData(link: String, lines: Boolean=false): String {
        val url = URL(link)
        val sb = StringBuilder()
        val connection= url.openConnection() as HttpURLConnection
            connection.setRequestProperty("User-Agent","Dalvik/2.1.0 (Linux; U; Android 9; Nokia 7.1 Build/PPR1.180610.011)")
            connection.setRequestProperty("Content-Type","application/json")

        try {
            val reader = BufferedReader(InputStreamReader(connection.inputStream))
            reader.use { buffer ->
                buffer.lines().forEach {
                    when(lines) {
                        false -> sb.append(it)
                        else -> sb.append(it).append(System.lineSeparator())
                    }
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        } finally {
            connection.disconnect()
        }
        return sb.toString()
    }
}
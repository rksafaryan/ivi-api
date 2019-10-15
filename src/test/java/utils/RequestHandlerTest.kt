package utils

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.nio.file.Files
import java.io.IOException
import java.net.MalformedURLException


internal class RequestHandlerTest {

    @Test
    fun getData() {
        val thrown = assertThrows(MalformedURLException::class.java) {
            RequestHandler().getData("4pda.ru")
        }
        val thrownIO = assertThrows(IOException::class.java) {
            RequestHandler().getData("yasfefesf")
        }
        val thrownNullString = assertThrows(IOException::class.java) {
            RequestHandler().getData("")
        }
    }
}
package utils

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class URLDecoderTest {

    val pas = "password"

    @Test
    fun decode() {
        val enc = URLDecoder.encode(pas)
        val dec = URLDecoder.decode(enc)

        assertEquals(pas, dec)

    }
}
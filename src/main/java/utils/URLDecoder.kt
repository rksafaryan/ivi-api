package utils

import java.util.*

object URLDecoder {

    fun decode(bytes: ByteArray): String {
        return String(Base64.getDecoder().decode(bytes))
    }

    fun decode(str: String): String {
        return String(Base64.getDecoder().decode(str.toByteArray()))
    }

    fun encode(str: String): ByteArray {
        return Base64.getEncoder().encode(str.toByteArray())
    }

}
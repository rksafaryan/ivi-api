package utils

import java.lang.StringBuilder

class QueryBuilder {
    fun buildFileds(params: List<String>, separator: String=","): String {
        val sb = StringBuilder()

        for (param in params) {
            sb.append(param).append(separator)
        }
        return "fields=${sb.dropLast(1)}"
    }

}
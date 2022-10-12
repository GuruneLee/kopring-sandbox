package com.github.gurunelee.sandbox.converter

import java.util.*

/**
 * Created by chlee on 2022/10/05.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
enum class SupportLang(val locale: Locale, val code: String) {
    KO(Locale.forLanguageTag("ko"), "ko"),
    EN(Locale.forLanguageTag("en"), "en"),
    JA(Locale.forLanguageTag("ja"), "ja"),
    ZH(Locale.forLanguageTag("zh"), "zh");

    companion object {
        fun from(locale: Locale?): SupportLang {
            return values().find { it.locale == locale } ?: EN
        }

        fun from(code: String?): SupportLang? {
            return when (code?.lowercase()) {
                null -> null
                in setOf("kor", "ko") -> KO
                in setOf("eng", "en") -> EN
                in setOf("chi", "zh") -> ZH
                in setOf("jpn", "ja") -> JA
                else -> EN
            }
        }
    }
}
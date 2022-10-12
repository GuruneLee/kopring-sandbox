package com.github.gurunelee.sandbox.message

import com.github.gurunelee.sandbox.converter.SupportLang
import org.springframework.context.MessageSource
import org.springframework.stereotype.Component

/**
 * Created by chlee on 2022/10/04.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@Component
class MessageService(
    private val messageSource: MessageSource
) {
    fun getMessage(
        messageId: String,
        supportLang: SupportLang,
        args: Array<Any>? = null
    ): String {
        return messageSource.getMessage(messageId, args, supportLang.locale)
    }
}
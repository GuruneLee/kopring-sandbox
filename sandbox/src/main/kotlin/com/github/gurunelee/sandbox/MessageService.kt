package com.github.gurunelee.sandbox

import org.springframework.context.MessageSource
import org.springframework.stereotype.Component
import java.util.Locale

/**
 * Created by chlee on 2022/10/04.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@Component
class MessageService(private val messageSource: MessageSource){
    fun getMessage(
        messageId: String,
        locale: Locale,
        args: Array<Any>? = null
    ): String {
        return messageSource.getMessage(messageId, args, locale)
    }
}
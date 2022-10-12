package com.github.gurunelee.sandbox.message

import com.github.gurunelee.sandbox.converter.SupportLang
import com.github.gurunelee.sandbox.resolver.RequestLocale
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by chlee on 2022/10/05.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@RestController
class MessageController(
    private val service: MessageService
) {
    @GetMapping("/message/{messageId}")
    fun getMessage(requestLocale: RequestLocale, @PathVariable messageId: String): String {
        return service.getMessage(messageId, SupportLang.from(requestLocale.locale))
    }
}
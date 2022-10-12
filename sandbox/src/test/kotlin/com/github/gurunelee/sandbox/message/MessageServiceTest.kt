package com.github.gurunelee.sandbox.message

import com.github.gurunelee.sandbox.converter.SupportLang
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * Created by chlee on 2022/10/12.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@SpringBootTest
internal class MessageServiceTest {
    @Autowired
    private lateinit var service: MessageService

    @Test
    fun get_message() {
        println(service.getMessage("HELLO", SupportLang.KO))
    }
}
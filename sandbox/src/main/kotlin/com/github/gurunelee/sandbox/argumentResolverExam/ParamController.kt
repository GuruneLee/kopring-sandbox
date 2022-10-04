package com.github.gurunelee.sandbox.argumentResolverExam

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by chlee on 2022/10/04.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@RestController
class ParamController {
    @PostMapping("/test")
    fun test(
        @RequestBody paramObject: ParamObject
    ): String {
        return "${paramObject.foo}, ${paramObject.bar}"
    }
}
package com.github.gurunelee.sandbox.argumentResolverExam

import org.springframework.core.MethodParameter
import org.springframework.web.bind.support.WebDataBinderFactory
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.method.support.ModelAndViewContainer

/**
 * Created by chlee on 2022/10/04.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
class ParamHandlerMethodArgumentResolver: HandlerMethodArgumentResolver {

    // 어떤 파라미터에 대한 작업을 할 것인가 정의
    // parameterType 이 ParamObject면 resolveArgument를 실행한다
    override fun supportsParameter(parameter: MethodParameter): Boolean {
        // return parameter.parameterType == ParamObject::class.java
        return false
    }

    /**
     * @Params
     *  parameter – the method parameter to resolve
     *  mavContainer – the ModelAndViewContainer for the current request
     *  webRequest – the current request
     *  binderFactory – a factory for creating WebDataBinder instances
     */
    override fun resolveArgument(
        parameter: MethodParameter,
        mavContainer: ModelAndViewContainer?,
        webRequest: NativeWebRequest,
        binderFactory: WebDataBinderFactory?
    ): Any? {
        var foo = webRequest.getParameter("foo")
        var bar = webRequest.getParameter("bar")
        if (foo == null) {
            foo = "foo"
        }
        if (bar == null) {
            bar = "bar"
        }
        return ParamObject(foo, bar)
    }
}
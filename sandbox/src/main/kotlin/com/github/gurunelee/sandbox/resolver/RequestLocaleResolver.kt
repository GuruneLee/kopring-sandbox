package com.github.gurunelee.sandbox.resolver

import org.springframework.core.MethodParameter
import org.springframework.stereotype.Component
import org.springframework.web.bind.support.WebDataBinderFactory
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.method.support.ModelAndViewContainer
import org.springframework.web.servlet.LocaleResolver
import javax.servlet.http.HttpServletRequest

/**
 * Created by chlee on 2022/10/12.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@Component
class RequestLocaleResolver(
    private val localeResolver: LocaleResolver
): HandlerMethodArgumentResolver {
    override fun supportsParameter(parameter: MethodParameter): Boolean {
        return parameter.parameterType == RequestLocale::class.java
    }

    override fun resolveArgument(
        parameter: MethodParameter,
        mavContainer: ModelAndViewContainer?,
        webRequest: NativeWebRequest,
        binderFactory: WebDataBinderFactory?
    ): Any {
        val locale = localeResolver.resolveLocale(webRequest.nativeRequest as HttpServletRequest)
        return RequestLocale(locale)
    }
}
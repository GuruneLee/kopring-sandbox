package com.github.gurunelee.sandbox.argumentResolverExam

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Created by chlee on 2022/10/04.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@Profile("test")
@Configuration
class TestAppConfig: WebMvcConfigurer {
    override fun addArgumentResolvers(resolvers: MutableList<HandlerMethodArgumentResolver>) {
        val argumentResolver = paramHandlerMethodArgumentResolver()
        resolvers.add(argumentResolver)
    }

    @Bean
    fun paramHandlerMethodArgumentResolver(): ParamHandlerMethodArgumentResolver {
        return ParamHandlerMethodArgumentResolver()
    }
}
package com.github.gurunelee.sandbox

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.LocaleContextResolver
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Created by chlee on 2022/10/04.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@Profile("!test")
@Configuration
class AppConfig: WebMvcConfigurer {
    override fun addArgumentResolvers(resolvers: MutableList<HandlerMethodArgumentResolver>) {
        val localeContextResolver
    }

    @Bean
    fun localContextResolver(): LocaleResolver {
        return LocaleContextResolver()
    }
}
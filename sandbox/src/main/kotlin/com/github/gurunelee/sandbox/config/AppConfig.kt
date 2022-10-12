package com.github.gurunelee.sandbox.config

import com.github.gurunelee.sandbox.resolver.RequestLocaleResolver
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Configuration
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Created by chlee on 2022/10/04.
 *
 * @author Changha Lee
 * @version sandbox
 * @since sandbox
 */
@Configuration
class AppConfig(
    private val applicationContext: ApplicationContext
): WebMvcConfigurer {

    override fun addArgumentResolvers(resolvers: MutableList<HandlerMethodArgumentResolver>) {
        val localeResolver = applicationContext.getBean(LocaleResolver::class.java)
        resolvers.add(RequestLocaleResolver(localeResolver))
    }

}
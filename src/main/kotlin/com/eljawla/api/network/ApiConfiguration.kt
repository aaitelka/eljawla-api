package com.eljawla.api.network

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.support.RestTemplateAdapter
import org.springframework.web.service.invoker.HttpServiceProxyFactory
import org.springframework.web.util.DefaultUriBuilderFactory


@Configuration
class ApiConfiguration {

    @Bean
    fun footballClient(@Value("\${sofa.base.url}") uri: String) = RestTemplate().run {
        uriTemplateHandler = DefaultUriBuilderFactory(uri)
        HttpServiceProxyFactory.builderFor(RestTemplateAdapter.create(this)).build()
            .createClient(FootballClient::class.java)
    }
}



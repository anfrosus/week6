package com.example.week6

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Main1 {

    companion object {
        private val logger = LoggerFactory.getLogger(Main1::class.java)
    }

    @GetMapping("/test")
    fun doSomething(){
        logger.error("에러")
        logger.warn("경고")
        logger.info("정보")
        logger.debug("디버그")
        logger.trace("트레이스")
    }

}
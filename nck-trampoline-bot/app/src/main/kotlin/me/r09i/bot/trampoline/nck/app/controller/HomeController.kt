package me.r09i.bot.trampoline.nck.app.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @RequestMapping("/")
    fun home(): String {
        val hoge = "Hello Docker World"
        return hoge.toString()
    }
}
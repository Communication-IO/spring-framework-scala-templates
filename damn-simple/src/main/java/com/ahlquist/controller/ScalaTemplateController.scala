package com.ahlquist.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class ScalaDemoController {
    @GetMapping(path = Array("/demo"))
    def demo={
      "This is a damn simple scala template using springboot."
    }
}

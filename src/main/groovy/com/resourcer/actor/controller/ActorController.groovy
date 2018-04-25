package com.resourcer.actor.controller

import com.resourcer.actor.dto.ActorDTO
import com.resourcer.actor.service.ActorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value="/actor")
class ActorController {

    @Autowired
    ActorService actorService


    @GetMapping
    List<ActorDTO> allActors(){
        actorService.returnActorList()
    }

}

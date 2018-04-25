package com.resourcer.actor.service

import com.resourcer.actor.Repository.ActorRepository
import com.resourcer.actor.dto.ActorDTO
import com.resourcer.actor.entity.Actor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActorService {

    @Autowired
    ActorRepository actorRepository

    List<ActorDTO> returnActorList() {
        List<ActorDTO> actorDTOList = []
        List<Actor> actorList = actorRepository.findAll()
        actorList.collect {
            Actor actor
            ActorDTO actorDTO = new ActorDTO()
            actorDTO.firstName = actor.firstName
            actorDTO.lastName = actor.lastName
            actorDTOList << actor
            return actorDTOList
        }
        return actorDTOList
    }


}

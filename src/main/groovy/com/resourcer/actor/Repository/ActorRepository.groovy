package com.resourcer.actor.Repository

import com.resourcer.actor.entity.Actor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActorRepository extends JpaRepository<Actor,Long> {

}

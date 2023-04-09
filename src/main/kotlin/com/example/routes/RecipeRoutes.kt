package com.example.routes

import com.example.models.recipeStorage
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.recipesTypes() {
    get("/recipe/type/{type?}") {
        val type =
            call.parameters["type"] ?: return@get call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
        val order = recipeStorage.find { it.type == type } ?: return@get call.respondText(
            "Not Found", status = HttpStatusCode.NotFound
        )
        call.respond(order)
    }
}
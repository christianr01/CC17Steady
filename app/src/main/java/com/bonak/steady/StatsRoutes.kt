package com.bonak.steady

fun Route.statsRoutes(statsService: StatsService) {
    route("/stats") {
        get("/landslide-prediction") {
            call.respond(statsService.getLandslidePredictions())
        }
        get("/high-risk-areas") {
            call.respond(statsService.getHighRiskAreas())
        }
        get("/landslide-risks") {
            call.respond(statsService.getLandslideRisks())
        }
        get("/recent-earthquakes") {
            call.respond(statsService.getRecentEarthquakes())
        }
    }
}

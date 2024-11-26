package com.bonak.steady
object ApiClient {
    private val client = HttpClient(CIO)

    suspend fun fetchEarthquakes(): List<EarthquakeEvent> {
        val response = client.get("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson")
        val data = response.body<EarthquakeApiResponse>()
        return data.features.map { feature ->
            EarthquakeEvent(
                magnitude = feature.properties.mag,
                location = feature.properties.place,
                timestamp = feature.properties.time.toString()
            )
        }
    }
}

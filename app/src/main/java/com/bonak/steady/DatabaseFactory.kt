package com.bonak.steady
object DatabaseFactory {
    fun init() {
        Database.connect(
            "jdbc:postgresql://localhost:5432/stats",
            driver = "org.postgresql.Driver"
        )
        transaction {
            SchemaUtils.create(HighRiskAreasTable) // Add other tables as needed
        }
    }
}

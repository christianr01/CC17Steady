package com.bonak.steady
object HighRiskAreasTable : Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 100)
    val latitude = double("latitude")
    val longitude = double("longitude")
    val riskLevel = varchar("risk_level", 50)
    override val primaryKey = PrimaryKey(id)
}

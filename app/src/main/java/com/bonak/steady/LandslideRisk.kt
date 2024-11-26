package com.bonak.steady
data class LandslideRisk(
    val area: String,
    val riskLevel: String,
    val factors: Map<String, String>
)
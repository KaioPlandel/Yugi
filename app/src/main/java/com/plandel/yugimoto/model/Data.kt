package com.plandel.yugimoto.model

data class Data(
    val archetype: String,
    val atk: Int,
    val attribute: String,
    val card_images: List<CardImage>,
    val card_prices: List<CardPrice>,
    val card_sets: List<CardSet>,
    val def: Int,
    val desc: String,
    val id: Int,
    val level: Int,
    val name: String,
    val race: String,
    val type: String
)
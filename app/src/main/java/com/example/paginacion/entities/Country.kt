package com.example.paginacion.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Country")
data class Country(
    @PrimaryKey val id: Int,
    val name: String
)
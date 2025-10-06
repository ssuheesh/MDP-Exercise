package com.example.lab4.data

import com.example.lab4.R
import com.example.lab4.model.Item

object DataSource {
    fun loadData(): List<Item> {
        return listOf(
            Item(R.string.compro_admission_team, R.drawable.compro_admission_team),
            Item(R.string.compro_professionals, R.drawable.compro_professionals),
            Item(R.string.faculty_student, R.drawable.faculty_student),
            Item(R.string.friends, R.drawable.friends),
            Item(R.string.graduation, R.drawable.graduation),
            Item(R.string.miu_campus, R.drawable.miu_campus),
            Item(R.string.rainbow, R.drawable.rainbow)
        )
    }
}
package com.app.gofound.pojo

import java.util.*

data class LostAllPost(
    val data: LinkedList<Data>,
    val message: String,
    val no_of_records_per_page: Int,
    val status: Int,
    val total_pages: Int,
    val total_records: Int
)
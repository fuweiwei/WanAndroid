package com.veer.libnet.bean

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

/**
 * <li>Package: com.veer.libnet.bean</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
@Keep
@Parcelize
data class Category(
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val userControlSetTop: Boolean,
    val visible: Int,
    val children: MutableList<Category>
) : Parcelable
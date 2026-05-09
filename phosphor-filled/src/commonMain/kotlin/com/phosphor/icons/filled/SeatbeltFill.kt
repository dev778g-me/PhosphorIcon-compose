package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SeatbeltFill: ImageVector
    get() {
        if (_SeatbeltFill != null) {
            return _SeatbeltFill!!
        }
        _SeatbeltFill = ImageVector.Builder(
            name = "Filled.SeatbeltFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 112f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44f, -44f)
                arcTo(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 112f)
                close()
                moveTo(200f, 216f)
                lineTo(77.16f, 216f)
                lineTo(197.29f, 110f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, -1.19f)
                arcToRelative(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.61f, -5.08f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186.71f, 98f)
                lineToRelative(-24.54f, 21.65f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 49f, 179.25f)
                arcToRelative(8.33f, 8.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, 1.1f)
                lineTo(48f, 223.83f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 232f)
                lineTo(200f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(188.12f, 143f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.25f, 1.94f)
                lineTo(119.47f, 200f)
                lineTo(200f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                arcToRelative(79.6f, 79.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.27f, -45.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 188.12f, 143f)
                close()
            }
        }.build()

        return _SeatbeltFill!!
    }

@Suppress("ObjectPropertyName")
private var _SeatbeltFill: ImageVector? = null

package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CookieFill: ImageVector
    get() {
        if (_CookieFill != null) {
            return _CookieFill!!
        }
        _CookieFill = ImageVector.Builder(
            name = "Filled.CookieFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 120f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 120f)
                close()
                moveTo(75.51f, 99.51f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 17f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 75.51f, 99.51f)
                close()
                moveTo(100.51f, 172.51f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -17f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.49f, 172.49f)
                close()
                moveTo(123.51f, 132.51f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 123.51f, 132.49f)
                close()
                moveTo(164.51f, 180.51f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -17f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164.49f, 180.49f)
                close()
            }
        }.build()

        return _CookieFill!!
    }

@Suppress("ObjectPropertyName")
private var _CookieFill: ImageVector? = null

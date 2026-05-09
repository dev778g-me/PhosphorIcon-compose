package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AirplaneTakeoffFill: ImageVector
    get() {
        if (_AirplaneTakeoffFill != null) {
            return _AirplaneTakeoffFill!!
        }
        _AirplaneTakeoffFill = ImageVector.Builder(
            name = "Filled.AirplaneTakeoffFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 216f)
                close()
                moveTo(246.31f, 86.76f)
                lineTo(227.67f, 62.87f)
                lineToRelative(-0.12f, -0.15f)
                arcToRelative(39.82f, 39.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -51.28f, -9.12f)
                lineTo(124.7f, 84.38f)
                lineTo(70.76f, 64.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.59f, 0f)
                lineTo(58f, 67.27f)
                lineToRelative(-0.32f, 0.13f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.53f, 26.47f)
                lineTo(75f, 115.06f)
                lineToRelative(-20.17f, 12.2f)
                lineToRelative(-28.26f, -9.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.08f, 0.4f)
                lineToRelative(-3f, 1.47f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 145.8f)
                lineToRelative(36f, 35.27f)
                lineToRelative(0.12f, 0.12f)
                arcToRelative(39.78f, 39.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.28f, 10.87f)
                arcToRelative(40.18f, 40.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.26f, -5.52f)
                lineToRelative(147.41f, -88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.21f, -11.78f)
                close()
            }
        }.build()

        return _AirplaneTakeoffFill!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneTakeoffFill: ImageVector? = null

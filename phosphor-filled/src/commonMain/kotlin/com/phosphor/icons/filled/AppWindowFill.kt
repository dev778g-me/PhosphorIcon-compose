package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AppWindowFill: ImageVector
    get() {
        if (_AppWindowFill != null) {
            return _AppWindowFill!!
        }
        _AppWindowFill = ImageVector.Builder(
            name = "Filled.AppWindowFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(68f, 96f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 84f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 96f)
                close()
                moveTo(108f, 96f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 96f)
                close()
            }
        }.build()

        return _AppWindowFill!!
    }

@Suppress("ObjectPropertyName")
private var _AppWindowFill: ImageVector? = null

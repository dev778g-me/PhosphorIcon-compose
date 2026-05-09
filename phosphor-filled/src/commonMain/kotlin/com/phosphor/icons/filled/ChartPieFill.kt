package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChartPieFill: ImageVector
    get() {
        if (_ChartPieFill != null) {
            return _ChartPieFill!!
        }
        _ChartPieFill = ImageVector.Builder(
            name = "Filled.ChartPieFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 40f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.87f, 37.27f)
                lineTo(128f, 118.76f)
                close()
                moveTo(128f, 216f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -71.87f, -37.27f)
                lineTo(207.89f, 91.12f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 216f)
                close()
            }
        }.build()

        return _ChartPieFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieFill: ImageVector? = null

package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ThermometerHotFill: ImageVector
    get() {
        if (_ThermometerHotFill != null) {
            return _ThermometerHotFill!!
        }
        _ThermometerHotFill = ImageVector.Builder(
            name = "Filled.ThermometerHotFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 146.08f)
                lineTo(152f, 40f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 0f)
                lineTo(88f, 146.08f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                close()
                moveTo(136f, 56f)
                lineTo(104f, 56f)
                lineTo(104f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                close()
                moveTo(177.3f, 80.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.33f, -11.07f)
                curveToRelative(15f, -9.79f, 26.87f, -4.75f, 35.51f, -1.06f)
                curveTo(223f, 72f, 227.76f, 74f, 235.63f, 68.89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.74f, 13.41f)
                curveTo(237.88f, 86.53f, 232f, 88f, 226.69f, 88f)
                curveToRelative(-7f, 0f, -12.92f, -2.54f, -17.83f, -4.63f)
                curveTo(201f, 80f, 196.24f, 78f, 188.37f, 83.11f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 177.3f, 80.77f)
                close()
                moveTo(246.7f, 103.23f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.33f, 11.07f)
                curveTo(237.88f, 118.53f, 232f, 120f, 226.69f, 120f)
                curveToRelative(-7f, 0f, -12.92f, -2.54f, -17.83f, -4.63f)
                curveToRelative(-7.87f, -3.36f, -12.62f, -5.38f, -20.49f, -0.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.74f, -13.41f)
                curveToRelative(15f, -9.79f, 26.87f, -4.75f, 35.51f, -1.06f)
                curveToRelative(7.87f, 3.36f, 12.62f, 5.39f, 20.49f, 0.25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 246.7f, 103.23f)
                close()
            }
        }.build()

        return _ThermometerHotFill!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerHotFill: ImageVector? = null

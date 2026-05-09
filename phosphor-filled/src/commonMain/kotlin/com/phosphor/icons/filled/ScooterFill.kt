package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ScooterFill: ImageVector
    get() {
        if (_ScooterFill != null) {
            return _ScooterFill!!
        }
        _ScooterFill = ImageVector.Builder(
            name = "Filled.ScooterFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(244f, 172f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -49.38f, -26.85f)
                lineToRelative(-9f, -26.89f)
                lineToRelative(-51.46f, 62.81f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 184f)
                horizontalLineTo(73.66f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.08f, -16f)
                horizontalLineToRelative(48.47f)
                lineToRelative(55.46f, -67.69f)
                lineTo(162.23f, 48f)
                horizontalLineTo(136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.59f, 5.47f)
                lineTo(209.8f, 140.08f)
                curveToRelative(0.72f, -0.05f, 1.46f, -0.08f, 2.2f, -0.08f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 244f, 172f)
                close()
            }
        }.build()

        return _ScooterFill!!
    }

@Suppress("ObjectPropertyName")
private var _ScooterFill: ImageVector? = null

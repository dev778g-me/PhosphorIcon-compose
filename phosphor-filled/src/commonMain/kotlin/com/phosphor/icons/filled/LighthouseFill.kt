package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LighthouseFill: ImageVector
    get() {
        if (_LighthouseFill != null) {
            return _LighthouseFill!!
        }
        _LighthouseFill = ImageVector.Builder(
            name = "Filled.LighthouseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(16f)
                horizontalLineTo(188.85f)
                lineTo(184f, 55.2f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 181.31f, 50f)
                horizontalLineToRelative(0f)
                lineTo(138.44f, 11.88f)
                lineToRelative(-0.2f, -0.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.48f, 0f)
                lineToRelative(-0.2f, 0.17f)
                lineTo(74.68f, 50f)
                verticalLineToRelative(0f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 55.2f)
                lineTo(67.15f, 104f)
                horizontalLineTo(56f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(65.54f)
                lineToRelative(-9.47f, 94.48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 232f)
                horizontalLineTo(184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.92f, -17.56f)
                lineTo(190.46f, 120f)
                horizontalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 80f)
                close()
                moveTo(87.24f, 64f)
                horizontalLineToRelative(81.52f)
                lineToRelative(4f, 40f)
                horizontalLineTo(136f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(16f)
                horizontalLineTo(83.23f)
                close()
                moveTo(72f, 216f)
                lineToRelative(4.81f, -48f)
                horizontalLineTo(179.19f)
                lineTo(184f, 216f)
                close()
            }
        }.build()

        return _LighthouseFill!!
    }

@Suppress("ObjectPropertyName")
private var _LighthouseFill: ImageVector? = null

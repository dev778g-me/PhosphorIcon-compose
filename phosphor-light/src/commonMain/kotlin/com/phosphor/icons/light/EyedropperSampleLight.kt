package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.EyedropperSampleLight: ImageVector
    get() {
        if (_EyedropperSampleLight != null) {
            return _EyedropperSampleLight!!
        }
        _EyedropperSampleLight = ImageVector.Builder(
            name = "Light.EyedropperSampleLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(182.43f, 113.17f)
                lineToRelative(4.88f, 4.89f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22.63f)
                lineToRelative(-9f, 9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                lineTo(106.34f, 89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.31f)
                lineToRelative(9f, -9f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.63f, 0f)
                lineToRelative(4.89f, 4.88f)
                lineToRelative(25f, -25.1f)
                curveToRelative(10.79f, -10.79f, 28.37f, -11.45f, 39.44f, -1f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.57f, 40.15f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(159.31f, 141.94f)
                lineToRelative(-56.68f, 56.69f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32.06f, 8f)
                horizontalLineToRelative(0f)
                lineToRelative(-20f, 8.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.86f, -1.67f)
                horizontalLineToRelative(0f)
                arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, -6.36f)
                lineToRelative(9.19f, -21.06f)
                horizontalLineToRelative(0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.7f, -32.87f)
                lineToRelative(56.69f, -56.68f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(52.28f, 160f)
                lineTo(141.25f, 160f)
            }
        }.build()

        return _EyedropperSampleLight!!
    }

@Suppress("ObjectPropertyName")
private var _EyedropperSampleLight: ImageVector? = null

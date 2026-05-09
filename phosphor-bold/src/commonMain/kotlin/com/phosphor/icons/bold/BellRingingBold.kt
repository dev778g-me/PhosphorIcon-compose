package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BellRingingBold: ImageVector
    get() {
        if (_BellRingingBold != null) {
            return _BellRingingBold!!
        }
        _BellRingingBold = ImageVector.Builder(
            name = "Bold.BellRingingBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 188f)
                verticalLineToRelative(8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 0f)
                verticalLineToRelative(-8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 24f)
                arcToRelative(102.71f, 102.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36.29f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(35.71f, 64f)
                arcTo(102.71f, 102.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(52f, 188f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.38f, -12.81f)
                curveTo(53.85f, 164.49f, 63.84f, 144.6f, 64f, 112f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 0f)
                curveToRelative(0.16f, 32.6f, 10.15f, 52.49f, 18.35f, 63.19f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 204f, 188f)
                close()
            }
        }.build()

        return _BellRingingBold!!
    }

@Suppress("ObjectPropertyName")
private var _BellRingingBold: ImageVector? = null

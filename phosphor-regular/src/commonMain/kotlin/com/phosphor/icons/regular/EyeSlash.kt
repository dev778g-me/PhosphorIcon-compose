package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) {
            return _EyeSlash!!
        }
        _EyeSlash = ImageVector.Builder(
            name = "Regular.EyeSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(154.91f, 157.6f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -53.82f, -59.2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(135.53f, 88.71f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.3f, 35.53f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208.61f, 169.1f)
                curveTo(230.41f, 149.58f, 240f, 128f, 240f, 128f)
                reflectiveCurveTo(208f, 56f, 128f, 56f)
                arcToRelative(126f, 126f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.68f, 1.68f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(74f, 68.6f)
                curveTo(33.23f, 89.24f, 16f, 128f, 16f, 128f)
                reflectiveCurveToRelative(32f, 72f, 112f, 72f)
                arcToRelative(118.05f, 118.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54f, -12.6f)
            }
        }.build()

        return _EyeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSlash: ImageVector? = null

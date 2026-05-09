package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.FilmSlateLight: ImageVector
    get() {
        if (_FilmSlateLight != null) {
            return _FilmSlateLight!!
        }
        _FilmSlateLight = ImageVector.Builder(
            name = "Light.FilmSlateLight",
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
                moveTo(40f, 112f)
                horizontalLineTo(216f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
                verticalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(112f)
                arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 112f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40.43f, 112f)
                lineTo(208f, 67.77f)
                lineToRelative(-8.16f, -30f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.66f, -5.49f)
                lineTo(37.85f, 72.47f)
                arcTo(7.76f, 7.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.27f, 82f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(67.71f, 64.59f)
                lineTo(115.5f, 92.19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(126.61f, 49.05f)
                lineTo(174.4f, 76.64f)
            }
        }.build()

        return _FilmSlateLight!!
    }

@Suppress("ObjectPropertyName")
private var _FilmSlateLight: ImageVector? = null

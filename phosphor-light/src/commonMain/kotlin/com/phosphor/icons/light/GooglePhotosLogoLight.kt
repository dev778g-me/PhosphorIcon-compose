package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.GooglePhotosLogoLight: ImageVector
    get() {
        if (_GooglePhotosLogoLight != null) {
            return _GooglePhotosLogoLight!!
        }
        _GooglePhotosLogoLight = ImageVector.Builder(
            name = "Light.GooglePhotosLogoLight",
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
                moveTo(128f, 128f)
                verticalLineTo(24f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 50f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                horizontalLineTo(24f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 78f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                verticalLineTo(232f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                horizontalLineTo(232f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -104f, 50f)
            }
        }.build()

        return _GooglePhotosLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _GooglePhotosLogoLight: ImageVector? = null

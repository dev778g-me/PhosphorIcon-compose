package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.GifThin: ImageVector
    get() {
        if (_GifThin != null) {
            return _GifThin!!
        }
        _GifThin = ImageVector.Builder(
            name = "Thin.GifThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 72f)
                lineTo(136f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 72f)
                lineToRelative(-56f, 0f)
                lineToRelative(0f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 128f)
                lineTo(176f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 128f)
                horizontalLineTo(96f)
                verticalLineToRelative(24f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                verticalLineTo(104f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 72f)
                curveToRelative(14.91f, 0f, 28.45f, 10.2f, 32f, 24f)
            }
        }.build()

        return _GifThin!!
    }

@Suppress("ObjectPropertyName")
private var _GifThin: ImageVector? = null

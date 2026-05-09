package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BehanceLogoDuotone: ImageVector
    get() {
        if (_BehanceLogoDuotone != null) {
            return _BehanceLogoDuotone!!
        }
        _BehanceLogoDuotone = ImageVector.Builder(
            name = "Duotone.BehanceLogoDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(160f, 152f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(94f, 124f)
                horizontalLineTo(90f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -60f)
                horizontalLineTo(32f)
                verticalLineTo(192f)
                horizontalLineTo(94f)
                arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -68f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 80f)
                lineTo(232f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 124f)
                horizontalLineTo(94f)
                arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 68f)
                horizontalLineTo(32f)
                verticalLineTo(64f)
                horizontalLineTo(90f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 60f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 176f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -24f)
                horizontalLineTo(160f)
            }
        }.build()

        return _BehanceLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BehanceLogoDuotone: ImageVector? = null

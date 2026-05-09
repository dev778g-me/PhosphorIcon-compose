package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Handshake: ImageVector
    get() {
        if (_Handshake != null) {
            return _Handshake!!
        }
        _Handshake = ImageVector.Builder(
            name = "Regular.Handshake",
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
                moveTo(200f, 152f)
                lineToRelative(-40f, 40f)
                lineToRelative(-64f, -16f)
                lineToRelative(-56f, -40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72.68f, 70.63f)
                lineToRelative(55.32f, -14.63f)
                lineToRelative(55.32f, 14.63f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(34.37f, 60.42f)
                lineTo(8.85f, 111.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, 10.73f)
                lineTo(40f, 136f)
                lineTo(72.68f, 70.63f)
                lineTo(45.11f, 56.85f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.37f, 60.42f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 136f)
                lineToRelative(27.58f, -13.79f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, -10.73f)
                lineTo(221.63f, 60.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.74f, -3.57f)
                lineTo(183.32f, 70.63f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 72f)
                horizontalLineTo(144f)
                lineTo(98.34f, 116.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, 12.42f)
                curveTo(117.23f, 139.9f, 141f, 139.13f, 160f, 120f)
                lineToRelative(40f, 32f)
                lineToRelative(16f, -16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(124.06f, 216f)
                lineToRelative(-41.72f, -10.43f)
                lineToRelative(-26.34f, -18.82f)
            }
        }.build()

        return _Handshake!!
    }

@Suppress("ObjectPropertyName")
private var _Handshake: ImageVector? = null

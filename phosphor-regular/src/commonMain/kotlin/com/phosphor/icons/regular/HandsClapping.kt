package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.HandsClapping: ImageVector
    get() {
        if (_HandsClapping != null) {
            return _HandsClapping!!
        }
        _HandsClapping = ImageVector.Builder(
            name = "Regular.HandsClapping",
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
                moveTo(168f, 8f)
                lineTo(168f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 21.02f)
                lineTo(200f, 34.13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(235.66f, 56f)
                lineTo(220.62f, 60.85f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(83.54f, 99f)
                lineTo(77.81f, 89f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = false, -31.18f, 18f)
                lineToRelative(19f, 32.91f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(109.55f, 144f)
                lineToRelative(-26f, -45f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = true, 31.17f, -18f)
                lineToRelative(36.45f, 63f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(102f, 59f)
                lineTo(96.28f, 49f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = false, 65.1f, 67f)
                lineTo(77.81f, 89f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.71f, 81f)
                lineTo(102f, 59f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = true, 31.17f, -18f)
                lineToRelative(37f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(199f, 187.76f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.7f, -86.19f)
                lineTo(188.61f, 65f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.18f, 18f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(81.81f, 168f)
                lineTo(61.59f, 133f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.18f, 18f)
                lineTo(40f, 167.59f)
                lineTo(65.63f, 212f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124.71f, -72f)
                lineToRelative(-20.2f, -35f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = false, 139f, 123f)
            }
        }.build()

        return _HandsClapping!!
    }

@Suppress("ObjectPropertyName")
private var _HandsClapping: ImageVector? = null

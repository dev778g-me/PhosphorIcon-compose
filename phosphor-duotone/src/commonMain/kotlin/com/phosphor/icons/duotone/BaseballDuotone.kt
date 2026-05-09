package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BaseballDuotone: ImageVector
    get() {
        if (_BaseballDuotone != null) {
            return _BaseballDuotone!!
        }
        _BaseballDuotone = ImageVector.Builder(
            name = "Duotone.BaseballDuotone",
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
                moveTo(32f, 128f)
                arcToRelative(28.66f, 68.42f, 0f, isMoreThanHalf = true, isPositiveArc = false, 57.32f, 0f)
                arcToRelative(28.66f, 68.42f, 0f, isMoreThanHalf = true, isPositiveArc = false, -57.32f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(166.68f, 128f)
                arcToRelative(28.66f, 68.42f, 0f, isMoreThanHalf = true, isPositiveArc = false, 57.32f, 0f)
                arcToRelative(28.66f, 68.42f, 0f, isMoreThanHalf = true, isPositiveArc = false, -57.32f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 144f)
                arcToRelative(94.87f, 94.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.14f, 16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(83.86f, 96f)
                arcTo(94.87f, 94.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60.66f, 59.58f)
                arcTo(94.93f, 94.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.27f, 68f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(68.27f, 188f)
                arcToRelative(94.93f, 94.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.61f, 8.42f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 144f)
                arcToRelative(94.87f, 94.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.14f, 16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(172.14f, 96f)
                arcTo(94.87f, 94.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(195.34f, 59.58f)
                arcTo(94.93f, 94.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.73f, 68f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(187.73f, 188f)
                arcToRelative(94.93f, 94.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.61f, 8.42f)
            }
        }.build()

        return _BaseballDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballDuotone: ImageVector? = null

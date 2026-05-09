package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TipJarDuotone: ImageVector
    get() {
        if (_TipJarDuotone != null) {
            return _TipJarDuotone!!
        }
        _TipJarDuotone = ImageVector.Builder(
            name = "Duotone.TipJarDuotone",
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
                moveTo(80f, 56f)
                lineTo(176f, 56f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 88f)
                lineTo(208f, 200f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 232f)
                lineTo(80f, 232f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 200f)
                lineTo(48f, 88f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 56f)
                lineTo(176f, 56f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 88f)
                lineTo(208f, 200f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 232f)
                lineTo(80f, 232f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 200f)
                lineTo(48f, 88f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 56f)
                verticalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 56f)
                lineTo(112f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 56f)
                lineTo(144f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 176f)
                horizontalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
                horizontalLineTo(120f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
                horizontalLineToRelative(24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 112f)
                lineTo(128f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 192f)
                lineTo(128f, 176f)
            }
        }.build()

        return _TipJarDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TipJarDuotone: ImageVector? = null

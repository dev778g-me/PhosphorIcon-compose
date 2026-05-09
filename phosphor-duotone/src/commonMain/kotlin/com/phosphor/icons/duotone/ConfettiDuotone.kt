package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ConfettiDuotone: ImageVector
    get() {
        if (_ConfettiDuotone != null) {
            return _ConfettiDuotone!!
        }
        _ConfettiDuotone = ImageVector.Builder(
            name = "Duotone.ConfettiDuotone",
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
                moveTo(101.11f, 197.11f)
                lineTo(58.89f, 154.89f)
                lineToRelative(-18.4f, 50.63f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(78.09f, 102.09f)
                lineToRelative(75.82f, 75.82f)
                lineToRelative(41f, -14.9f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.85f, -12.84f)
                lineTo(105.83f, 58.29f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 93f, 61.14f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40.49f, 205.52f)
                lineTo(93f, 61.14f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.84f, -2.85f)
                lineToRelative(91.88f, 91.88f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 194.86f, 163f)
                lineTo(50.48f, 215.51f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.49f, 205.52f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 72f)
                reflectiveCurveToRelative(0f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, -24f, 24f, -24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 16f)
                lineTo(144f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 112f)
                lineTo(232f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 80f)
                lineTo(240f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(78.09f, 102.09f)
                lineTo(153.91f, 177.91f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(101.11f, 197.11f)
                lineTo(58.89f, 154.89f)
            }
        }.build()

        return _ConfettiDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ConfettiDuotone: ImageVector? = null

package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CherriesDuotone: ImageVector
    get() {
        if (_CherriesDuotone != null) {
            return _CherriesDuotone!!
        }
        _CherriesDuotone = ImageVector.Builder(
            name = "Duotone.CherriesDuotone",
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
                moveTo(176f, 80f)
                arcToRelative(63.92f, 63.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -52.19f, 27f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 140.2f, 197f)
                lineToRelative(0f, 0.07f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 176f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 160f)
                moveToRelative(-64f, 0f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 136f)
                reflectiveCurveToRelative(-8f, 8f, -24f, 8f)
                reflectiveCurveToRelative(-24f, -8f, -24f, -8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 120f)
                reflectiveCurveToRelative(-8f, 8f, -24f, 8f)
                reflectiveCurveToRelative(-24f, -8f, -24f, -8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 128f)
                curveTo(168f, 16f, 56f, 32f, 56f, 32f)
                curveToRelative(48f, 32f, 32f, 112f, 32f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(123.81f, 107f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.41f, 90.12f)
            }
        }.build()

        return _CherriesDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CherriesDuotone: ImageVector? = null

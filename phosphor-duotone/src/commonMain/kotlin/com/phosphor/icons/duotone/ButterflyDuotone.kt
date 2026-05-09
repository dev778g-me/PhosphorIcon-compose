package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ButterflyDuotone: ImageVector
    get() {
        if (_ButterflyDuotone != null) {
            return _ButterflyDuotone!!
        }
        _ButterflyDuotone = ImageVector.Builder(
            name = "Duotone.ButterflyDuotone",
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
                moveTo(208.93f, 48f)
                curveTo(177.64f, 48f, 128f, 95.8f, 128f, 127.67f)
                curveTo(128f, 95.8f, 78.36f, 48f, 47.07f, 48f)
                reflectiveCurveTo(22.79f, 87.84f, 30.88f, 119.71f)
                curveToRelative(7.86f, 30.94f, 29.31f, 32.71f, 37.36f, 32.23f)
                horizontalLineToRelative(1f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 180f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 58.72f, -28.06f)
                horizontalLineToRelative(1f)
                curveToRelative(8.05f, 0.48f, 29.5f, -1.29f, 37.36f, -32.23f)
                curveTo(233.21f, 87.84f, 240.22f, 48f, 208.93f, 48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 56f)
                lineTo(128f, 180f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(187.76f, 151.94f)
                curveToRelative(8.05f, 0.48f, 29.5f, -1.29f, 37.36f, -32.23f)
                curveTo(233.21f, 87.84f, 240.22f, 48f, 208.93f, 48f)
                reflectiveCurveTo(128f, 95.8f, 128f, 127.67f)
                curveTo(128f, 95.8f, 78.36f, 48f, 47.07f, 48f)
                reflectiveCurveTo(22.79f, 87.84f, 30.88f, 119.71f)
                curveToRelative(7.86f, 30.94f, 29.31f, 32.71f, 37.36f, 32.23f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 144f)
                arcToRelative(36.11f, 36.11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 40f, 36f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 40f, -36f)
            }
        }.build()

        return _ButterflyDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ButterflyDuotone: ImageVector? = null

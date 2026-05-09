package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TireDuotone: ImageVector
    get() {
        if (_TireDuotone != null) {
            return _TireDuotone!!
        }
        _TireDuotone = ImageVector.Builder(
            name = "Duotone.TireDuotone",
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
                moveTo(92f, 224f)
                curveToRelative(-28.72f, 0f, -52f, -43f, -52f, -96f)
                reflectiveCurveTo(63.28f, 32f, 92f, 32f)
                horizontalLineToRelative(72f)
                curveToRelative(-28.72f, 0f, -52f, 43f, -52f, 96f)
                reflectiveCurveToRelative(23.28f, 96f, 52f, 96f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(152f, 128f)
                arcToRelative(16f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
                arcToRelative(16f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 128f)
                arcToRelative(16f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
                arcToRelative(16f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 128f)
                arcToRelative(52f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 104f, 0f)
                arcToRelative(52f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -104f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 224f)
                horizontalLineTo(92f)
                curveToRelative(-28.72f, 0f, -52f, -43f, -52f, -96f)
                reflectiveCurveTo(63.28f, 32f, 92f, 32f)
                horizontalLineToRelative(72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40.38f, 116.3f)
                lineToRelative(39.62f, -28.3f)
                lineToRelative(32.77f, 23.41f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(46.85f, 175.68f)
                lineToRelative(33.15f, -23.68f)
                lineToRelative(40.65f, 29.03f)
            }
        }.build()

        return _TireDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TireDuotone: ImageVector? = null

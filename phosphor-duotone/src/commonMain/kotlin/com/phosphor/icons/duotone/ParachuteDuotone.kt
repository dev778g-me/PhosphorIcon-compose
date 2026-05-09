package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ParachuteDuotone: ImageVector
    get() {
        if (_ParachuteDuotone != null) {
            return _ParachuteDuotone!!
        }
        _ParachuteDuotone = ImageVector.Builder(
            name = "Duotone.ParachuteDuotone",
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
                moveTo(128f, 24f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 96f)
                horizontalLineTo(88f)
                curveTo(88f, 48f, 128f, 24f, 128f, 24f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(128f, 24f)
                reflectiveCurveToRelative(40f, 24f, 40f, 96f)
                horizontalLineToRelative(56f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 120f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -192f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 120f)
                lineToRelative(-96f, 72f)
                lineToRelative(-96f, -72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 192f)
                lineTo(128f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 224f)
                lineTo(144f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 192f)
                lineTo(88f, 120f)
                curveToRelative(0f, -72f, 40f, -96f, 40f, -96f)
                reflectiveCurveToRelative(40f, 24f, 40f, 96f)
                close()
            }
        }.build()

        return _ParachuteDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ParachuteDuotone: ImageVector? = null

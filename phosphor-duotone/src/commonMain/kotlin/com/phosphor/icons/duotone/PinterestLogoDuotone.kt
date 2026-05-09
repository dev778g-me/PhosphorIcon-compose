package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PinterestLogoDuotone: ImageVector
    get() {
        if (_PinterestLogoDuotone != null) {
            return _PinterestLogoDuotone!!
        }
        _PinterestLogoDuotone = ImageVector.Builder(
            name = "Duotone.PinterestLogoDuotone",
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
                moveTo(110.37f, 162.93f)
                reflectiveCurveTo(120f, 184f, 152f, 184f)
                reflectiveCurveToRelative(64f, -27.82f, 64f, -72f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -74.86f, -79.84f)
                horizontalLineToRelative(0f)
                lineTo(128f, 88f)
                lineToRelative(-17.63f, 74.93f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 88f)
                lineTo(96f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(66.7f, 152f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 216f, 112f)
                curveToRelative(0f, 44.18f, -32f, 72f, -64f, 72f)
                reflectiveCurveToRelative(-41.63f, -21.07f, -41.63f, -21.07f)
            }
        }.build()

        return _PinterestLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PinterestLogoDuotone: ImageVector? = null

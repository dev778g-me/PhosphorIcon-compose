package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.EyeClosedDuotone: ImageVector
    get() {
        if (_EyeClosedDuotone != null) {
            return _EyeClosedDuotone!!
        }
        _EyeClosedDuotone = ImageVector.Builder(
            name = "Duotone.EyeClosedDuotone",
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
                moveTo(32f, 104f)
                arcToRelative(96f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 192f, 0f)
                arcToRelative(96f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -192f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 104f)
                curveToRelative(16.81f, 20.81f, 47.63f, 48f, 96f, 48f)
                reflectiveCurveToRelative(79.19f, -27.19f, 96f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 168f)
                lineTo(200.62f, 127.09f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 192f)
                lineTo(152.91f, 149.45f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 192f)
                lineTo(103.09f, 149.45f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 168f)
                lineTo(55.38f, 127.09f)
            }
        }.build()

        return _EyeClosedDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _EyeClosedDuotone: ImageVector? = null

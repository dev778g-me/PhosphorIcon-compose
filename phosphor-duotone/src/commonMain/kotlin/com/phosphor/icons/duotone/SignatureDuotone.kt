package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.SignatureDuotone: ImageVector
    get() {
        if (_SignatureDuotone != null) {
            return _SignatureDuotone!!
        }
        _SignatureDuotone = ImageVector.Builder(
            name = "Duotone.SignatureDuotone",
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
                moveTo(77.91f, 32f)
                horizontalLineToRelative(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(78f, 32f)
                curveToRelative(-32.54f, 0.07f, -42.24f, 97.52f, -10.54f, 110.56f)
                curveTo(92f, 90.26f, 111.82f, 32.05f, 78f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 176f)
                lineTo(232f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 224f)
                reflectiveCurveTo(139.52f, 32f, 77.91f, 32f)
                curveTo(32.07f, 32f, 31.58f, 225.11f, 128f, 104.19f)
                curveToRelative(0f, 0f, 8.11f, 39.44f, 27.23f, 39.81f)
                curveToRelative(7.72f, 0.15f, 17.25f, -6.31f, 28.77f, -24f)
                curveToRelative(0f, 0f, 0f, 24f, 48f, 24f)
            }
        }.build()

        return _SignatureDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SignatureDuotone: ImageVector? = null

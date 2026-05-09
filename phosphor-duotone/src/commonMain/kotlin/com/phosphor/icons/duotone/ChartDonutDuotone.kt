package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ChartDonutDuotone: ImageVector
    get() {
        if (_ChartDonutDuotone != null) {
            return _ChartDonutDuotone!!
        }
        _ChartDonutDuotone = ImageVector.Builder(
            name = "Duotone.ChartDonutDuotone",
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
                moveTo(128f, 224f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -192f)
                verticalLineTo(88f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 168f)
                lineTo(128f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44.85f, 80f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 32f)
                verticalLineTo(88f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -34.65f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(89.35f, 138.36f)
                lineTo(35.25f, 152.85f)
            }
        }.build()

        return _ChartDonutDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ChartDonutDuotone: ImageVector? = null

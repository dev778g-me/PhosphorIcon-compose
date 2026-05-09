package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.HeartBreakDuotone: ImageVector
    get() {
        if (_HeartBreakDuotone != null) {
            return _HeartBreakDuotone!!
        }
        _HeartBreakDuotone = ImageVector.Builder(
            name = "Duotone.HeartBreakDuotone",
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
                moveTo(178f, 48f)
                arcToRelative(53.79f, 53.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -38.18f, 15.82f)
                lineTo(128f, 75.63f)
                lineTo(116.18f, 63.82f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 102f)
                curveToRelative(0f, 66f, 104f, 122f, 104f, 122f)
                reflectiveCurveToRelative(104f, -56f, 104f, -122f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 178f, 48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 75.63f)
                lineTo(116.18f, 63.82f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 102f)
                curveToRelative(0f, 66f, 104f, 122f, 104f, 122f)
                reflectiveCurveToRelative(104f, -56f, 104f, -122f)
                arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -92.18f, -38.18f)
                lineTo(112f, 91.63f)
                lineToRelative(30.18f, 30.19f)
                lineTo(120f, 144f)
            }
        }.build()

        return _HeartBreakDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HeartBreakDuotone: ImageVector? = null

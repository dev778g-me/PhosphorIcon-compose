package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.NeedleDuotone: ImageVector
    get() {
        if (_NeedleDuotone != null) {
            return _NeedleDuotone!!
        }
        _NeedleDuotone = ImageVector.Builder(
            name = "Duotone.NeedleDuotone",
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
                moveTo(182.63f, 118.63f)
                lineToRelative(24f, -24f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, -45.26f)
                lineToRelative(-24f, 24f)
                curveTo(128f, 128f, 40f, 216f, 40f, 216f)
                reflectiveCurveTo(128f, 128f, 182.63f, 118.63f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 72f)
                lineTo(168f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(182.63f, 118.63f)
                lineToRelative(24f, -24f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, -45.26f)
                lineToRelative(-24f, 24f)
                curveTo(128f, 128f, 40f, 216f, 40f, 216f)
                reflectiveCurveTo(128f, 128f, 182.63f, 118.63f)
                close()
            }
        }.build()

        return _NeedleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _NeedleDuotone: ImageVector? = null

package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.IntersectionDuotone: ImageVector
    get() {
        if (_IntersectionDuotone != null) {
            return _IntersectionDuotone!!
        }
        _IntersectionDuotone = ImageVector.Builder(
            name = "Duotone.IntersectionDuotone",
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
                moveTo(56f, 200f)
                verticalLineTo(120f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                verticalLineToRelative(80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 200f)
                verticalLineTo(120f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                verticalLineToRelative(80f)
            }
        }.build()

        return _IntersectionDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectionDuotone: ImageVector? = null

package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.AtDuotone: ImageVector
    get() {
        if (_AtDuotone != null) {
            return _AtDuotone!!
        }
        _AtDuotone = ImageVector.Builder(
            name = "Duotone.AtDuotone",
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
                moveTo(128f, 32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 96f, 96f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-40f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 208f)
                curveToRelative(-15.21f, 10.11f, -36.37f, 16f, -56f, 16f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, -96f)
                curveToRelative(0f, 22.09f, -8f, 40f, -28f, 40f)
                reflectiveCurveToRelative(-28f, -17.91f, -28f, -40f)
                verticalLineTo(88f)
            }
        }.build()

        return _AtDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _AtDuotone: ImageVector? = null

package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ScribbleLoopDuotone: ImageVector
    get() {
        if (_ScribbleLoopDuotone != null) {
            return _ScribbleLoopDuotone!!
        }
        _ScribbleLoopDuotone = ImageVector.Builder(
            name = "Duotone.ScribbleLoopDuotone",
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
                moveTo(185.33f, 119.83f)
                curveTo(187f, 162.36f, 159.88f, 208f, 108.6f, 208f)
                curveToRelative(-64f, 0f, -64f, -96f, 32f, -96f)
                arcToRelative(134.44f, 134.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44.73f, 7.83f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 92.8f)
                reflectiveCurveTo(64f, 48f, 112f, 48f)
                curveToRelative(104f, 0f, 92.6f, 160f, -3.4f, 160f)
                curveToRelative(-64f, 0f, -64f, -96f, 32f, -96f)
                curveToRelative(64f, 0f, 107.4f, 48f, 107.4f, 48f)
            }
        }.build()

        return _ScribbleLoopDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ScribbleLoopDuotone: ImageVector? = null

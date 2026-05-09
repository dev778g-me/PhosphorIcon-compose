package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FramerLogoDuotone: ImageVector
    get() {
        if (_FramerLogoDuotone != null) {
            return _FramerLogoDuotone!!
        }
        _FramerLogoDuotone = ImageVector.Builder(
            name = "Duotone.FramerLogoDuotone",
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
                moveTo(56f, 104f)
                lineToRelative(0f, 64f)
                lineToRelative(72f, 72f)
                lineToRelative(0f, -72f)
                lineToRelative(72f, 0f)
                lineToRelative(-144f, -128f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(-144f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 104f)
                lineToRelative(0f, 64f)
                lineToRelative(72f, 72f)
                lineToRelative(0f, -72f)
                lineToRelative(72f, 0f)
                lineToRelative(-144f, -128f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(-144f, 0f)
                close()
            }
        }.build()

        return _FramerLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FramerLogoDuotone: ImageVector? = null

package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.WaveTriangleDuotone: ImageVector
    get() {
        if (_WaveTriangleDuotone != null) {
            return _WaveTriangleDuotone!!
        }
        _WaveTriangleDuotone = ImageVector.Builder(
            name = "Duotone.WaveTriangleDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                lineToRelative(52f, -72f)
                lineToRelative(104f, 144f)
                lineToRelative(52f, -72f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(24f, 128f)
                lineToRelative(52f, -72f)
                lineToRelative(104f, 144f)
                lineToRelative(52f, -72f)
                lineToRelative(-208f, 0f)
                close()
            }
        }.build()

        return _WaveTriangleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WaveTriangleDuotone: ImageVector? = null

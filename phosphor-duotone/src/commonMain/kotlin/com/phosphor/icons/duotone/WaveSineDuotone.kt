package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.WaveSineDuotone: ImageVector
    get() {
        if (_WaveSineDuotone != null) {
            return _WaveSineDuotone!!
        }
        _WaveSineDuotone = ImageVector.Builder(
            name = "Duotone.WaveSineDuotone",
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
                moveTo(24f, 128f)
                curveToRelative(104f, -221.7f, 104f, 221.7f, 208f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                curveToRelative(104f, -221.7f, 104f, 221.7f, 208f, 0f)
            }
        }.build()

        return _WaveSineDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSineDuotone: ImageVector? = null

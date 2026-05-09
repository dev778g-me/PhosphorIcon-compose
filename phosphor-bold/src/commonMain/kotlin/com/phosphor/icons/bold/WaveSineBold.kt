package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.WaveSineBold: ImageVector
    get() {
        if (_WaveSineBold != null) {
            return _WaveSineBold!!
        }
        _WaveSineBold = ImageVector.Builder(
            name = "Bold.WaveSineBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                curveToRelative(104f, -221.7f, 104f, 221.7f, 208f, 0f)
            }
        }.build()

        return _WaveSineBold!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSineBold: ImageVector? = null

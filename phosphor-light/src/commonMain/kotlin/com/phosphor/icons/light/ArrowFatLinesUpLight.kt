package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowFatLinesUpLight: ImageVector
    get() {
        if (_ArrowFatLinesUpLight != null) {
            return _ArrowFatLinesUpLight!!
        }
        _ArrowFatLinesUpLight = ImageVector.Builder(
            name = "Light.ArrowFatLinesUpLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 120f)
                lineToRelative(96f, -96f)
                lineToRelative(96f, 96f)
                lineToRelative(-48f, 0f)
                lineToRelative(0f, 32f)
                lineToRelative(-96f, 0f)
                lineToRelative(0f, -32f)
                lineToRelative(-48f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 216f)
                lineTo(80f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 184f)
                lineTo(80f, 184f)
            }
        }.build()

        return _ArrowFatLinesUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesUpLight: ImageVector? = null

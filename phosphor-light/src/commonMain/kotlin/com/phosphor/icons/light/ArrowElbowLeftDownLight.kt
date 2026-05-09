package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowElbowLeftDownLight: ImageVector
    get() {
        if (_ArrowElbowLeftDownLight != null) {
            return _ArrowElbowLeftDownLight!!
        }
        _ArrowElbowLeftDownLight = ImageVector.Builder(
            name = "Light.ArrowElbowLeftDownLight",
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
                moveTo(136f, 168f)
                lineToRelative(-48f, 48f)
                lineToRelative(-48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 72f)
                lineToRelative(-144f, 0f)
                lineToRelative(0f, 144f)
            }
        }.build()

        return _ArrowElbowLeftDownLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftDownLight: ImageVector? = null

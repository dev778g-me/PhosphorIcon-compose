package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowDownRightLight: ImageVector
    get() {
        if (_ArrowDownRightLight != null) {
            return _ArrowDownRightLight!!
        }
        _ArrowDownRightLight = ImageVector.Builder(
            name = "Light.ArrowDownRightLight",
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
                moveTo(64f, 64f)
                lineTo(192f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 192f)
                lineToRelative(104f, 0f)
                lineToRelative(0f, -104f)
            }
        }.build()

        return _ArrowDownRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRightLight: ImageVector? = null

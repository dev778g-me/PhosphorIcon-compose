package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CaretUpDownLight: ImageVector
    get() {
        if (_CaretUpDownLight != null) {
            return _CaretUpDownLight!!
        }
        _CaretUpDownLight = ImageVector.Builder(
            name = "Light.CaretUpDownLight",
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
                moveTo(80f, 176f)
                lineToRelative(48f, 48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 80f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
            }
        }.build()

        return _CaretUpDownLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUpDownLight: ImageVector? = null

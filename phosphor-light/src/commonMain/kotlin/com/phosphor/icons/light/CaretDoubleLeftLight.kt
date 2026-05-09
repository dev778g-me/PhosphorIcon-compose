package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CaretDoubleLeftLight: ImageVector
    get() {
        if (_CaretDoubleLeftLight != null) {
            return _CaretDoubleLeftLight!!
        }
        _CaretDoubleLeftLight = ImageVector.Builder(
            name = "Light.CaretDoubleLeftLight",
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
                moveTo(200f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
            }
        }.build()

        return _CaretDoubleLeftLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleLeftLight: ImageVector? = null

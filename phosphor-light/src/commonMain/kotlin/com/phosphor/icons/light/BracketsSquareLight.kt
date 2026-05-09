package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BracketsSquareLight: ImageVector
    get() {
        if (_BracketsSquareLight != null) {
            return _BracketsSquareLight!!
        }
        _BracketsSquareLight = ImageVector.Builder(
            name = "Light.BracketsSquareLight",
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
                moveTo(80f, 40f)
                lineToRelative(-40f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                lineToRelative(40f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(-40f, 0f)
            }
        }.build()

        return _BracketsSquareLight!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsSquareLight: ImageVector? = null

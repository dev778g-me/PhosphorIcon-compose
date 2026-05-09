package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BracketsCurlyLight: ImageVector
    get() {
        if (_BracketsCurlyLight != null) {
            return _BracketsCurlyLight!!
        }
        _BracketsCurlyLight = ImageVector.Builder(
            name = "Light.BracketsCurlyLight",
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
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
            }
        }.build()

        return _BracketsCurlyLight!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsCurlyLight: ImageVector? = null

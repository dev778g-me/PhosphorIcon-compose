package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BracketsCurlyBold: ImageVector
    get() {
        if (_BracketsCurlyBold != null) {
            return _BracketsCurlyBold!!
        }
        _BracketsCurlyBold = ImageVector.Builder(
            name = "Bold.BracketsCurlyBold",
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
                moveTo(80f, 40f)
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
            }
        }.build()

        return _BracketsCurlyBold!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsCurlyBold: ImageVector? = null

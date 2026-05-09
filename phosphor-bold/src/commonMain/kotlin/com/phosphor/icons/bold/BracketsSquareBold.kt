package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BracketsSquareBold: ImageVector
    get() {
        if (_BracketsSquareBold != null) {
            return _BracketsSquareBold!!
        }
        _BracketsSquareBold = ImageVector.Builder(
            name = "Bold.BracketsSquareBold",
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
                lineToRelative(-40f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                lineToRelative(40f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(-40f, 0f)
            }
        }.build()

        return _BracketsSquareBold!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsSquareBold: ImageVector? = null

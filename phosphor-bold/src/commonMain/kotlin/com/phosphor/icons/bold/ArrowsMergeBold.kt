package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowsMergeBold: ImageVector
    get() {
        if (_ArrowsMergeBold != null) {
            return _ArrowsMergeBold!!
        }
        _ArrowsMergeBold = ImageVector.Builder(
            name = "Bold.ArrowsMergeBold",
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
                moveTo(128f, 232f)
                lineToRelative(0f, -72f)
                lineToRelative(-56f, -56f)
                lineToRelative(0f, -64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 200f)
                lineToRelative(-32f, 32f)
                lineToRelative(-32f, -32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 40f)
                lineToRelative(0f, 64f)
                lineToRelative(-56f, 56f)
            }
        }.build()

        return _ArrowsMergeBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsMergeBold: ImageVector? = null

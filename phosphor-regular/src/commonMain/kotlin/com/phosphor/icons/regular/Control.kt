package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Control: ImageVector
    get() {
        if (_Control != null) {
            return _Control!!
        }
        _Control = ImageVector.Builder(
            name = "Regular.Control",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 120f)
                lineToRelative(72f, -72f)
                lineToRelative(72f, 72f)
            }
        }.build()

        return _Control!!
    }

@Suppress("ObjectPropertyName")
private var _Control: ImageVector? = null

package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowFatUpLight: ImageVector
    get() {
        if (_ArrowFatUpLight != null) {
            return _ArrowFatUpLight!!
        }
        _ArrowFatUpLight = ImageVector.Builder(
            name = "Light.ArrowFatUpLight",
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
                moveTo(32f, 120f)
                lineToRelative(96f, -96f)
                lineToRelative(96f, 96f)
                horizontalLineTo(176f)
                verticalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(120f)
                close()
            }
        }.build()

        return _ArrowFatUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatUpLight: ImageVector? = null

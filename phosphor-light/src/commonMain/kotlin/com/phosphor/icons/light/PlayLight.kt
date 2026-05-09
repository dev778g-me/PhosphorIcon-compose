package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PlayLight: ImageVector
    get() {
        if (_PlayLight != null) {
            return _PlayLight!!
        }
        _PlayLight = ImageVector.Builder(
            name = "Light.PlayLight",
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
                moveTo(72f, 39.88f)
                verticalLineTo(216.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.15f, 6.69f)
                lineToRelative(144.08f, -88.12f)
                arcToRelative(7.82f, 7.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.38f)
                lineTo(84.15f, 33.19f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 39.88f)
                close()
            }
        }.build()

        return _PlayLight!!
    }

@Suppress("ObjectPropertyName")
private var _PlayLight: ImageVector? = null

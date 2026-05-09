package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.HeartStraightLight: ImageVector
    get() {
        if (_HeartStraightLight != null) {
            return _HeartStraightLight!!
        }
        _HeartStraightLight = ImageVector.Builder(
            name = "Light.HeartStraightLight",
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
                moveTo(128f, 224f)
                lineToRelative(89.36f, -90.64f)
                arcToRelative(50f, 50f, 0f, isMoreThanHalf = true, isPositiveArc = false, -70.72f, -70.72f)
                lineTo(128f, 80f)
                lineTo(109.36f, 62.64f)
                arcToRelative(50f, 50f, 0f, isMoreThanHalf = false, isPositiveArc = false, -70.72f, 70.72f)
                close()
            }
        }.build()

        return _HeartStraightLight!!
    }

@Suppress("ObjectPropertyName")
private var _HeartStraightLight: ImageVector? = null

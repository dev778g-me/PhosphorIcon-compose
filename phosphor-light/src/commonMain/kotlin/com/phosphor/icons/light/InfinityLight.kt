package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.InfinityLight: ImageVector
    get() {
        if (_InfinityLight != null) {
            return _InfinityLight!!
        }
        _InfinityLight = ImageVector.Builder(
            name = "Light.InfinityLight",
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
                moveTo(106.63f, 152.13f)
                lineToRelative(-8.69f, 9.81f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -67.88f)
                lineToRelative(60.12f, 67.88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -67.88f)
                lineToRelative(-8.69f, 9.81f)
            }
        }.build()

        return _InfinityLight!!
    }

@Suppress("ObjectPropertyName")
private var _InfinityLight: ImageVector? = null

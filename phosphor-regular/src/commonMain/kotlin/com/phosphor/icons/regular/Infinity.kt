package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Infinity: ImageVector
    get() {
        if (_Infinity != null) {
            return _Infinity!!
        }
        _Infinity = ImageVector.Builder(
            name = "Regular.Infinity",
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
                moveTo(106.63f, 152.13f)
                lineToRelative(-8.69f, 9.81f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -67.88f)
                lineToRelative(60.12f, 67.88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -67.88f)
                lineToRelative(-8.69f, 9.81f)
            }
        }.build()

        return _Infinity!!
    }

@Suppress("ObjectPropertyName")
private var _Infinity: ImageVector? = null

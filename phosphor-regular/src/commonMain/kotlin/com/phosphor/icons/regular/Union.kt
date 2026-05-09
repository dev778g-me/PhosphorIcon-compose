package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Union: ImageVector
    get() {
        if (_Union != null) {
            return _Union!!
        }
        _Union = ImageVector.Builder(
            name = "Regular.Union",
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
                moveTo(200f, 64f)
                verticalLineToRelative(80f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -144f, 0f)
                verticalLineTo(64f)
            }
        }.build()

        return _Union!!
    }

@Suppress("ObjectPropertyName")
private var _Union: ImageVector? = null

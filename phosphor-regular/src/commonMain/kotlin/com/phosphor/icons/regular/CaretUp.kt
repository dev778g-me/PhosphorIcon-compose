package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) {
            return _CaretUp!!
        }
        _CaretUp = ImageVector.Builder(
            name = "Regular.CaretUp",
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
                moveTo(48f, 160f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
            }
        }.build()

        return _CaretUp!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUp: ImageVector? = null

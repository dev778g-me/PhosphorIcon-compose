package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.CaretDown: ImageVector
    get() {
        if (_CaretDown != null) {
            return _CaretDown!!
        }
        _CaretDown = ImageVector.Builder(
            name = "Regular.CaretDown",
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
                moveTo(208f, 96f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
            }
        }.build()

        return _CaretDown!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDown: ImageVector? = null

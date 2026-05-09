package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.CaretDoubleDown: ImageVector
    get() {
        if (_CaretDoubleDown != null) {
            return _CaretDoubleDown!!
        }
        _CaretDoubleDown = ImageVector.Builder(
            name = "Regular.CaretDoubleDown",
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
                moveTo(208f, 136f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 56f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
            }
        }.build()

        return _CaretDoubleDown!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleDown: ImageVector? = null

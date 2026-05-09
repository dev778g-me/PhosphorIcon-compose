package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.CaretDoubleLeftThin: ImageVector
    get() {
        if (_CaretDoubleLeftThin != null) {
            return _CaretDoubleLeftThin!!
        }
        _CaretDoubleLeftThin = ImageVector.Builder(
            name = "Thin.CaretDoubleLeftThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
            }
        }.build()

        return _CaretDoubleLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleLeftThin: ImageVector? = null

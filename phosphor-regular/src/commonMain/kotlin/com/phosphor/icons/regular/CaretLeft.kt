package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.CaretLeft: ImageVector
    get() {
        if (_CaretLeft != null) {
            return _CaretLeft!!
        }
        _CaretLeft = ImageVector.Builder(
            name = "Regular.CaretLeft",
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
                moveTo(160f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
            }
        }.build()

        return _CaretLeft!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeft: ImageVector? = null

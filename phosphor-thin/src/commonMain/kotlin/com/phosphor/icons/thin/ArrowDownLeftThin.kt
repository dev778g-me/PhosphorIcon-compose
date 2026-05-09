package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowDownLeftThin: ImageVector
    get() {
        if (_ArrowDownLeftThin != null) {
            return _ArrowDownLeftThin!!
        }
        _ArrowDownLeftThin = ImageVector.Builder(
            name = "Thin.ArrowDownLeftThin",
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
                moveTo(192f, 64f)
                lineTo(64f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 192f)
                lineToRelative(-104f, 0f)
                lineToRelative(0f, -104f)
            }
        }.build()

        return _ArrowDownLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeftThin: ImageVector? = null

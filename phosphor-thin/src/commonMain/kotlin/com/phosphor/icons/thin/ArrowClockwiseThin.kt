package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowClockwiseThin: ImageVector
    get() {
        if (_ArrowClockwiseThin != null) {
            return _ArrowClockwiseThin!!
        }
        _ArrowClockwiseThin = ImageVector.Builder(
            name = "Thin.ArrowClockwiseThin",
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
                moveTo(184f, 104f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(188.4f, 192f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.83f, -126.23f)
                lineTo(232f, 104f)
            }
        }.build()

        return _ArrowClockwiseThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwiseThin: ImageVector? = null

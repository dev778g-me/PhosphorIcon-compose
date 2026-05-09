package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ClockCounterClockwiseThin: ImageVector
    get() {
        if (_ClockCounterClockwiseThin != null) {
            return _ClockCounterClockwiseThin!!
        }
        _ClockCounterClockwiseThin = ImageVector.Builder(
            name = "Thin.ClockCounterClockwiseThin",
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
                moveTo(128f, 80f)
                lineToRelative(0f, 48f)
                lineToRelative(40f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 104f)
                lineToRelative(-40f, 0f)
                lineToRelative(0f, -40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(67.6f, 192f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 65.77f, 65.77f)
                curveTo(54f, 77.69f, 44.28f, 88.93f, 32f, 104f)
            }
        }.build()

        return _ClockCounterClockwiseThin!!
    }

@Suppress("ObjectPropertyName")
private var _ClockCounterClockwiseThin: ImageVector? = null

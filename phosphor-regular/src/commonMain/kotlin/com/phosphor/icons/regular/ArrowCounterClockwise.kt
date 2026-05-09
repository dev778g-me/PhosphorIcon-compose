package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ArrowCounterClockwise: ImageVector
    get() {
        if (_ArrowCounterClockwise != null) {
            return _ArrowCounterClockwise!!
        }
        _ArrowCounterClockwise = ImageVector.Builder(
            name = "Regular.ArrowCounterClockwise",
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
                moveTo(24f, 56f)
                lineToRelative(0f, 48f)
                lineToRelative(48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(67.59f, 192f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 65.77f, 65.77f)
                lineTo(24f, 104f)
            }
        }.build()

        return _ArrowCounterClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCounterClockwise: ImageVector? = null

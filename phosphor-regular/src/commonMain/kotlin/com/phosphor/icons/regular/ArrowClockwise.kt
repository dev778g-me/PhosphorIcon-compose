package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ArrowClockwise: ImageVector
    get() {
        if (_ArrowClockwise != null) {
            return _ArrowClockwise!!
        }
        _ArrowClockwise = ImageVector.Builder(
            name = "Regular.ArrowClockwise",
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
                moveTo(184f, 104f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(188.4f, 192f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.83f, -126.23f)
                lineTo(232f, 104f)
            }
        }.build()

        return _ArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwise: ImageVector? = null

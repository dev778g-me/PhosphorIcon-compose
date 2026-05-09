package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.VibrateBold: ImageVector
    get() {
        if (_VibrateBold != null) {
            return _VibrateBold!!
        }
        _VibrateBold = ImageVector.Builder(
            name = "Bold.VibrateBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 56f)
                lineTo(180f, 200f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 216f)
                lineTo(92f, 216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 200f)
                lineTo(76f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 40f)
                lineTo(164f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(220f, 100f)
                lineTo(220f, 156f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(36f, 100f)
                lineTo(36f, 156f)
            }
        }.build()

        return _VibrateBold!!
    }

@Suppress("ObjectPropertyName")
private var _VibrateBold: ImageVector? = null

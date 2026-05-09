package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.AlignRightBold: ImageVector
    get() {
        if (_AlignRightBold != null) {
            return _AlignRightBold!!
        }
        _AlignRightBold = ImageVector.Builder(
            name = "Bold.AlignRightBold",
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
                moveTo(216f, 40f)
                lineTo(216f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 108f)
                lineTo(80f, 108f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 100f)
                lineTo(72f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                lineTo(168f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 64f)
                lineTo(176f, 100f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 108f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 148f)
                lineTo(168f, 148f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 156f)
                lineTo(176f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 200f)
                lineTo(40f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 192f)
                lineTo(32f, 156f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 148f)
                close()
            }
        }.build()

        return _AlignRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRightBold: ImageVector? = null

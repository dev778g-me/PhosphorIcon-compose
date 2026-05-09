package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.AlignBottomBold: ImageVector
    get() {
        if (_AlignBottomBold != null) {
            return _AlignBottomBold!!
        }
        _AlignBottomBold = ImageVector.Builder(
            name = "Bold.AlignBottomBold",
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
                moveTo(216f, 216f)
                lineTo(40f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 168f)
                lineTo(148f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 72f)
                lineTo(192f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 80f)
                lineTo(200f, 168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 176f)
                lineTo(156f, 176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 168f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 32f)
                lineTo(100f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 40f)
                lineTo(108f, 168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 176f)
                lineTo(64f, 176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 168f)
                lineTo(56f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 32f)
                close()
            }
        }.build()

        return _AlignBottomBold!!
    }

@Suppress("ObjectPropertyName")
private var _AlignBottomBold: ImageVector? = null

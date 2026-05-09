package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.AlignCenterVerticalBold: ImageVector
    get() {
        if (_AlignCenterVerticalBold != null) {
            return _AlignCenterVerticalBold!!
        }
        _AlignCenterVerticalBold = ImageVector.Builder(
            name = "Bold.AlignCenterVerticalBold",
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
                moveTo(224f, 128f)
                lineTo(204f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(52f, 128f)
                lineTo(32f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 128f)
                lineTo(108f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(204f, 72f)
                lineTo(204f, 184f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 192f)
                lineTo(156f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 184f)
                lineTo(148f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 64f)
                lineTo(196f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 204f, 72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60f, 40f)
                lineTo(100f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 48f)
                lineTo(108f, 208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 216f)
                lineTo(60f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 208f)
                lineTo(52f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 40f)
                close()
            }
        }.build()

        return _AlignCenterVerticalBold!!
    }

@Suppress("ObjectPropertyName")
private var _AlignCenterVerticalBold: ImageVector? = null

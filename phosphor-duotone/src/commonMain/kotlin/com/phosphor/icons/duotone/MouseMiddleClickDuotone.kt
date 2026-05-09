package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.MouseMiddleClickDuotone: ImageVector
    get() {
        if (_MouseMiddleClickDuotone != null) {
            return _MouseMiddleClickDuotone!!
        }
        _MouseMiddleClickDuotone = ImageVector.Builder(
            name = "Duotone.MouseMiddleClickDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(120f, 80f)
                lineTo(136f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 88f)
                lineTo(144f, 136f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 144f)
                lineTo(120f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 136f)
                lineTo(112f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 80f)
                lineTo(136f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 88f)
                lineTo(144f, 136f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 144f)
                lineTo(120f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 136f)
                lineTo(112f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 24f)
                lineTo(144f, 24f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 80f)
                lineTo(200f, 176f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 232f)
                lineTo(112f, 232f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 176f)
                lineTo(56f, 80f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 80f)
                lineTo(128f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 112f)
                lineTo(112f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 112f)
                lineTo(200f, 112f)
            }
        }.build()

        return _MouseMiddleClickDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MouseMiddleClickDuotone: ImageVector? = null

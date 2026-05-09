package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Columns: ImageVector
    get() {
        if (_Columns != null) {
            return _Columns!!
        }
        _Columns = ImageVector.Builder(
            name = "Regular.Columns",
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
                moveTo(112f, 48f)
                lineTo(112f, 208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 216f)
                lineTo(64f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 208f)
                lineTo(56f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 40f)
                lineTo(104f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 48f)
                lineTo(200f, 208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                lineTo(152f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 208f)
                lineTo(144f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 40f)
                lineTo(192f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 48f)
                close()
            }
        }.build()

        return _Columns!!
    }

@Suppress("ObjectPropertyName")
private var _Columns: ImageVector? = null

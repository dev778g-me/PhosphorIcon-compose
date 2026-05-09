package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.MouseLight: ImageVector
    get() {
        if (_MouseLight != null) {
            return _MouseLight!!
        }
        _MouseLight = ImageVector.Builder(
            name = "Light.MouseLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
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
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 112f)
                lineTo(128f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 112f)
                lineTo(200f, 112f)
            }
        }.build()

        return _MouseLight!!
    }

@Suppress("ObjectPropertyName")
private var _MouseLight: ImageVector? = null

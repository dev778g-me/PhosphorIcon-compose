package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.LaptopLight: ImageVector
    get() {
        if (_LaptopLight != null) {
            return _LaptopLight!!
        }
        _LaptopLight = ImageVector.Builder(
            name = "Light.LaptopLight",
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
                moveTo(40f, 176f)
                verticalLineTo(72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineTo(176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 176f)
                horizontalLineTo(232f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(176f)
                arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 88f)
                lineTo(112f, 88f)
            }
        }.build()

        return _LaptopLight!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopLight: ImageVector? = null

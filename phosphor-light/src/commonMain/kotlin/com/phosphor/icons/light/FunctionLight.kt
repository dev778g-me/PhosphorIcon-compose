package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.FunctionLight: ImageVector
    get() {
        if (_FunctionLight != null) {
            return _FunctionLight!!
        }
        _FunctionLight = ImageVector.Builder(
            name = "Light.FunctionLight",
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
                moveTo(72f, 128f)
                lineTo(184f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 216f)
                horizontalLineTo(85.29f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.49f, -26.28f)
                lineTo(139.22f, 66.28f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 170.71f, 40f)
                horizontalLineTo(200f)
            }
        }.build()

        return _FunctionLight!!
    }

@Suppress("ObjectPropertyName")
private var _FunctionLight: ImageVector? = null

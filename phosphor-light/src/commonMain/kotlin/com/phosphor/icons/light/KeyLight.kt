package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.KeyLight: ImageVector
    get() {
        if (_KeyLight != null) {
            return _KeyLight!!
        }
        _KeyLight = ImageVector.Builder(
            name = "Light.KeyLight",
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
                moveTo(93.17f, 122.83f)
                arcTo(71.68f, 71.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 95.91f)
                curveToRelative(0f, -38.58f, 31.08f, -70.64f, 69.64f, -71.87f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 98.36f)
                curveTo(230.73f, 136.92f, 198.67f, 168f, 160.09f, 168f)
                arcToRelative(71.68f, 71.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -26.92f, -5.17f)
                horizontalLineToRelative(0f)
                lineTo(120f, 176f)
                horizontalLineTo(96f)
                verticalLineToRelative(24f)
                horizontalLineTo(72f)
                verticalLineToRelative(24f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(187.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, -5.65f)
                lineToRelative(58.83f, -58.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(180f, 76f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
        }.build()

        return _KeyLight!!
    }

@Suppress("ObjectPropertyName")
private var _KeyLight: ImageVector? = null

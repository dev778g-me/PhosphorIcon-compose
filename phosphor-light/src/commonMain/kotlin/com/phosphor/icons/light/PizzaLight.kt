package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PizzaLight: ImageVector
    get() {
        if (_PizzaLight != null) {
            return _PizzaLight!!
        }
        _PizzaLight = ImageVector.Builder(
            name = "Light.PizzaLight",
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
                moveTo(25.16f, 70.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.7f, -11f)
                arcToRelative(193.49f, 193.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200.28f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.7f, 11f)
                lineToRelative(-96f, 157.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.7f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(37.9f, 91.76f)
                arcToRelative(160.1f, 160.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180.2f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(154f, 196.79f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 33.2f, -54.39f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(53.74f, 117.71f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 30.65f, 50f)
            }
        }.build()

        return _PizzaLight!!
    }

@Suppress("ObjectPropertyName")
private var _PizzaLight: ImageVector? = null

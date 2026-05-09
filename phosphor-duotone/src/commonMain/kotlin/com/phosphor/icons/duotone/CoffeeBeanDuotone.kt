package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CoffeeBeanDuotone: ImageVector
    get() {
        if (_CoffeeBeanDuotone != null) {
            return _CoffeeBeanDuotone!!
        }
        _CoffeeBeanDuotone = ImageVector.Builder(
            name = "Duotone.CoffeeBeanDuotone",
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
                moveTo(49.89f, 206.11f)
                arcToRelative(78.91f, 110.47f, 45f, isMoreThanHalf = true, isPositiveArc = false, 156.23f, -156.23f)
                arcToRelative(78.91f, 110.47f, 45f, isMoreThanHalf = true, isPositiveArc = false, -156.23f, 156.23f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(49.89f, 206.11f)
                arcToRelative(78.91f, 110.47f, 45f, isMoreThanHalf = true, isPositiveArc = false, 156.23f, -156.23f)
                arcToRelative(78.91f, 110.47f, 45f, isMoreThanHalf = true, isPositiveArc = false, -156.23f, 156.23f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(206.11f, 49.89f)
                curveToRelative(-24.51f, 5f, -66.9f, 22f, -78.11f, 78.11f)
                reflectiveCurveToRelative(-53.6f, 73.09f, -78.11f, 78.11f)
            }
        }.build()

        return _CoffeeBeanDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeBeanDuotone: ImageVector? = null

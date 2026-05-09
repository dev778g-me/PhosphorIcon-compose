package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.HouseSimpleLight: ImageVector
    get() {
        if (_HouseSimpleLight != null) {
            return _HouseSimpleLight!!
        }
        _HouseSimpleLight = ImageVector.Builder(
            name = "Light.HouseSimpleLight",
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
                moveTo(40f, 216f)
                horizontalLineTo(216f)
                verticalLineTo(120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineToRelative(-80f, -80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-80f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 120f)
                close()
            }
        }.build()

        return _HouseSimpleLight!!
    }

@Suppress("ObjectPropertyName")
private var _HouseSimpleLight: ImageVector? = null

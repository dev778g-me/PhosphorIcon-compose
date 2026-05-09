package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.NumberCircleFiveLight: ImageVector
    get() {
        if (_NumberCircleFiveLight != null) {
            return _NumberCircleFiveLight!!
        }
        _NumberCircleFiveLight = ImageVector.Builder(
            name = "Light.NumberCircleFiveLight",
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
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 80f)
                horizontalLineTo(112f)
                lineToRelative(-8f, 48f)
                arcToRelative(27.57f, 27.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, -8f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 56f)
                arcToRelative(27.57f, 27.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, -8f)
            }
        }.build()

        return _NumberCircleFiveLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleFiveLight: ImageVector? = null

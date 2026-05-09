package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CheckFatLight: ImageVector
    get() {
        if (_CheckFatLight != null) {
            return _CheckFatLight!!
        }
        _CheckFatLight = ImageVector.Builder(
            name = "Light.CheckFatLight",
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
                moveTo(104f, 147.43f)
                lineToRelative(98.34f, -97.09f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(24f, 23.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                lineToRelative(-128.4f, 128.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-71.6f, -72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.31f)
                lineToRelative(24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                close()
            }
        }.build()

        return _CheckFatLight!!
    }

@Suppress("ObjectPropertyName")
private var _CheckFatLight: ImageVector? = null

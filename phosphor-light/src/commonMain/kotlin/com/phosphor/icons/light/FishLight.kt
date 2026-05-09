package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.FishLight: ImageVector
    get() {
        if (_FishLight != null) {
            return _FishLight!!
        }
        _FishLight = ImageVector.Builder(
            name = "Light.FishLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 76f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 175.87f)
                lineToRelative(56.07f, 16.06f)
                lineToRelative(16f, 56.07f)
                lineToRelative(24f, -56.07f)
                curveTo(258.51f, 188.26f, 220f, 38.68f, 219f, 37f)
                curveToRelative(-1.73f, -1f, -151.25f, -39.46f, -155f, 114.9f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(185.82f, 167.62f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136.2f, 119.8f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.38f, 70.21f)
            }
        }.build()

        return _FishLight!!
    }

@Suppress("ObjectPropertyName")
private var _FishLight: ImageVector? = null

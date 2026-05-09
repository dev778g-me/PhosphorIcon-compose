package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.AtomLight: ImageVector
    get() {
        if (_AtomLight != null) {
            return _AtomLight!!
        }
        _AtomLight = ImageVector.Builder(
            name = "Light.AtomLight",
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
                moveTo(96.79f, 159.2f)
                arcToRelative(116.33f, 44.13f, 45f, isMoreThanHalf = true, isPositiveArc = false, 62.41f, -62.41f)
                arcToRelative(116.33f, 44.13f, 45f, isMoreThanHalf = true, isPositiveArc = false, -62.41f, 62.41f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(45.74f, 210.26f)
                arcToRelative(116.33f, 44.13f, 135f, isMoreThanHalf = true, isPositiveArc = false, 164.52f, -164.52f)
                arcToRelative(116.33f, 44.13f, 135f, isMoreThanHalf = true, isPositiveArc = false, -164.52f, 164.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 128f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
        }.build()

        return _AtomLight!!
    }

@Suppress("ObjectPropertyName")
private var _AtomLight: ImageVector? = null

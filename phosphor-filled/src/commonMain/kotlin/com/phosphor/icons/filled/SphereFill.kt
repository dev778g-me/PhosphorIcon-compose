package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SphereFill: ImageVector
    get() {
        if (_SphereFill != null) {
            return _SphereFill!!
        }
        _SphereFill = ImageVector.Builder(
            name = "Filled.SphereFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 40f)
                curveToRelative(8.15f, 0f, 24f, 31.06f, 24f, 88f)
                curveToRelative(0f, 8.24f, -0.34f, 15.92f, -0.93f, 23.07f)
                curveToRelative(-7.15f, 0.59f, -14.83f, 0.93f, -23.07f, 0.93f)
                curveToRelative(-56.94f, 0f, -88f, -15.85f, -88f, -24f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                close()
                moveTo(43.4f, 152.26f)
                curveTo(63.28f, 162.65f, 95.76f, 168f, 128f, 168f)
                curveToRelative(7.09f, 0f, 14.19f, -0.26f, 21.17f, -0.77f)
                curveTo(144.23f, 199f, 134f, 216f, 128f, 216f)
                arcTo(88.17f, 88.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 43.4f, 152.26f)
                close()
            }
        }.build()

        return _SphereFill!!
    }

@Suppress("ObjectPropertyName")
private var _SphereFill: ImageVector? = null

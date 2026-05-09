package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SpadeFill: ImageVector
    get() {
        if (_SpadeFill != null) {
            return _SpadeFill!!
        }
        _SpadeFill = ImageVector.Builder(
            name = "Filled.SpadeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 136f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -83.4f, 48.82f)
                lineToRelative(11.06f, 36.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 232f)
                horizontalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.66f, -10.3f)
                lineToRelative(11.06f, -36.88f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 136f)
                curveToRelative(0f, -32f, 17.65f, -62.84f, 51f, -89.27f)
                arcToRelative(234.14f, 234.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 49.89f, -30.11f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.16f, 0f)
                arcTo(234.14f, 234.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 181f, 46.73f)
                curveTo(214.35f, 73.16f, 232f, 104f, 232f, 136f)
                close()
            }
        }.build()

        return _SpadeFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpadeFill: ImageVector? = null

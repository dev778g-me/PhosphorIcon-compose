package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PeaceFill: ImageVector
    get() {
        if (_PeaceFill != null) {
            return _PeaceFill!!
        }
        _PeaceFill = ImageVector.Builder(
            name = "Filled.PeaceFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 143.37f)
                lineToRelative(46f, 32.2f)
                arcToRelative(71.86f, 71.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46f, 24f)
                close()
                moveTo(56f, 128f)
                arcToRelative(71.61f, 71.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.81f, 34.48f)
                lineTo(120f, 123.84f)
                lineTo(120f, 56.46f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 128f)
                close()
                moveTo(120f, 199.54f)
                lineTo(120f, 143.37f)
                lineToRelative(-46f, 32.2f)
                arcTo(71.86f, 71.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 199.54f)
                close()
                moveTo(136f, 56.46f)
                verticalLineToRelative(67.38f)
                lineToRelative(55.19f, 38.64f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 56.46f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(216f, 128f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, -88f, 88f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 128f)
                close()
            }
        }.build()

        return _PeaceFill!!
    }

@Suppress("ObjectPropertyName")
private var _PeaceFill: ImageVector? = null

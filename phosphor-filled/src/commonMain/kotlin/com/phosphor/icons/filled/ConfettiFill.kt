package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ConfettiFill: ImageVector
    get() {
        if (_ConfettiFill != null) {
            return _ConfettiFill!!
        }
        _ConfettiFill = ImageVector.Builder(
            name = "Filled.ConfettiFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(111.49f, 52.63f)
                arcToRelative(15.8f, 15.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -26f, 5.77f)
                lineTo(33f, 202.78f)
                arcTo(15.83f, 15.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.76f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.46f, -1f)
                lineToRelative(144.37f, -52.5f)
                arcToRelative(15.8f, 15.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.78f, -26f)
                close()
                moveTo(65.14f, 161.13f)
                lineToRelative(19.2f, -52.79f)
                lineToRelative(63.32f, 63.32f)
                lineToRelative(-52.8f, 19.2f)
                close()
                moveTo(160f, 72f)
                arcToRelative(37.8f, 37.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.84f, -15.58f)
                curveTo(169.14f, 45.83f, 179.14f, 40f, 192f, 40f)
                curveToRelative(6.7f, 0f, 11f, -2.29f, 13.65f, -7.21f)
                arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 23.94f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 24f)
                curveToRelative(0f, 12.86f, -8.52f, 32f, -32f, 32f)
                curveToRelative(-6.7f, 0f, -11f, 2.29f, -13.65f, 7.21f)
                arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 72.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 72f)
                close()
                moveTo(136f, 40f)
                lineTo(136f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(152f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(237.66f, 122.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.32f, 11.31f)
                lineToRelative(-16f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                close()
                moveTo(242.53f, 79.59f)
                lineTo(218.53f, 87.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.06f, -15.18f)
                lineToRelative(24f, -8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.06f, 15.18f)
                close()
            }
        }.build()

        return _ConfettiFill!!
    }

@Suppress("ObjectPropertyName")
private var _ConfettiFill: ImageVector? = null

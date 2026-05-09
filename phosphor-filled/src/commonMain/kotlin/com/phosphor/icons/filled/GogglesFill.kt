package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GogglesFill: ImageVector
    get() {
        if (_GogglesFill != null) {
            return _GogglesFill!!
        }
        _GogglesFill = ImageVector.Builder(
            name = "Filled.GogglesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 64f)
                lineTo(72f, 64f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 136f)
                arcToRelative(24.06f, 24.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 23f)
                curveToRelative(6.06f, 20.37f, 37.63f, 33f, 55f, 33f)
                arcToRelative(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.2f, -32f)
                horizontalLineToRelative(33.6f)
                arcTo(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 192f)
                curveToRelative(17.33f, 0f, 48.9f, -12.66f, 55f, -33f)
                arcToRelative(24.06f, 24.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, -23f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 64f)
                close()
                moveTo(89f, 169f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                lineTo(53.14f, 144.45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, -11.31f)
                lineTo(89f, 157.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89f, 169f)
                close()
                moveTo(208.52f, 168.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                lineToRelative(-25.41f, -25.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(25.4f, 25.41f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208.48f, 168.48f)
                close()
                moveTo(237.72f, 141.65f)
                curveTo(229.34f, 123.25f, 200.34f, 112f, 184f, 112f)
                arcToRelative(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -39.2f, 32f)
                lineTo(111.2f, 144f)
                arcTo(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 112f)
                curveToRelative(-16.34f, 0f, -45.34f, 11.25f, -53.68f, 29.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 136f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 80f)
                lineTo(184f, 80f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 237.68f, 141.62f)
                close()
            }
        }.build()

        return _GogglesFill!!
    }

@Suppress("ObjectPropertyName")
private var _GogglesFill: ImageVector? = null

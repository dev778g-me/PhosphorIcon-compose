package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AcornFill: ImageVector
    get() {
        if (_AcornFill != null) {
            return _AcornFill!!
        }
        _AcornFill = ImageVector.Builder(
            name = "Filled.AcornFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 104f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
                lineTo(136f, 48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 40f)
                lineTo(80f, 48f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 13.84f)
                lineTo(32f, 128f)
                curveToRelative(0f, 35.53f, 33.12f, 62.12f, 59.74f, 83.49f)
                curveTo(103.66f, 221.07f, 120f, 234.18f, 120f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                curveToRelative(0f, -5.82f, 16.34f, -18.93f, 28.26f, -28.51f)
                curveTo(190.88f, 190.12f, 224f, 163.53f, 224f, 128f)
                lineTo(224f, 117.84f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 104f)
                close()
                moveTo(154.25f, 199f)
                curveToRelative(-10.62f, 8.52f, -20f, 16f, -26.25f, 23.37f)
                curveToRelative(-6.25f, -7.32f, -15.63f, -14.85f, -26.25f, -23.37f)
                curveTo(77.8f, 179.79f, 48f, 155.86f, 48f, 128f)
                verticalLineToRelative(-8f)
                lineTo(208f, 120f)
                verticalLineToRelative(8f)
                curveTo(208f, 155.86f, 178.2f, 179.79f, 154.25f, 199f)
                close()
            }
        }.build()

        return _AcornFill!!
    }

@Suppress("ObjectPropertyName")
private var _AcornFill: ImageVector? = null

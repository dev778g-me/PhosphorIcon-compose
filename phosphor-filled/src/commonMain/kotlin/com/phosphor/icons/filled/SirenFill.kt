package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SirenFill: ImageVector
    get() {
        if (_SirenFill != null) {
            return _SirenFill!!
        }
        _SirenFill = ImageVector.Builder(
            name = "Filled.SirenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 16f)
                lineTo(120f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(200f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -2.34f)
                lineToRelative(8f, -8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineToRelative(-8f, 8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 48f)
                close()
                moveTo(50.34f, 45.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 61.66f, 34.34f)
                lineToRelative(-8f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 42.34f, 37.66f)
                close()
                moveTo(232f, 176f)
                verticalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                lineTo(40f, 128f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.67f, -88f)
                curveToRelative(48.15f, 0.36f, 87.33f, 40.29f, 87.33f, 89f)
                verticalLineToRelative(31f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 176f)
                close()
                moveTo(134.68f, 87.89f)
                curveTo(153.67f, 91.08f, 168f, 108.32f, 168f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                curveToRelative(0f, -27.4f, -20.07f, -51.43f, -46.68f, -55.89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.64f, 15.78f)
                close()
                moveTo(216f, 200f)
                lineTo(216f, 176f)
                lineTo(40f, 176f)
                verticalLineToRelative(24f)
                lineTo(216f, 200f)
                close()
            }
        }.build()

        return _SirenFill!!
    }

@Suppress("ObjectPropertyName")
private var _SirenFill: ImageVector? = null

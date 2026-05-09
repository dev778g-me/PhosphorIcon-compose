package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EarFill: ImageVector
    get() {
        if (_EarFill != null) {
            return _EarFill!!
        }
        _EarFill = ImageVector.Builder(
            name = "Filled.EarFill",
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
                moveTo(148f, 152f)
                arcToRelative(4.21f, 4.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.33f, -0.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.34f, 15.08f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 148f)
                curveToRelative(0f, -8.85f, 4.77f, -15.23f, 9f, -20.87f)
                curveToRelative(3.77f, -5f, 7f, -9.38f, 7f, -15.13f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                curveToRelative(0f, 11.07f, -5.66f, 18.63f, -10.2f, 24.71f)
                curveToRelative(-3.6f, 4.81f, -5.8f, 7.93f, -5.8f, 11.29f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 148f, 152f)
                close()
                moveTo(184f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 0f)
                curveToRelative(0f, 11.9f, 6.71f, 20.5f, 13.82f, 29.6f)
                curveToRelative(7f, 8.92f, 14.18f, 18.15f, 14.18f, 30.4f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34f, 14.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.19f, 11.42f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 172f)
                curveToRelative(0f, -6.74f, -5f, -13.14f, -10.79f, -20.55f)
                curveTo(73.54f, 141.63f, 64f, 129.41f, 64f, 112f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 120f)
                close()
            }
        }.build()

        return _EarFill!!
    }

@Suppress("ObjectPropertyName")
private var _EarFill: ImageVector? = null

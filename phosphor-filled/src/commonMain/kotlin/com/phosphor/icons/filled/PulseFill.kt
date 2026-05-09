package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PulseFill: ImageVector
    get() {
        if (_PulseFill != null) {
            return _PulseFill!!
        }
        _PulseFill = ImageVector.Builder(
            name = "Filled.PulseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(208f, 136f)
                lineTo(188.64f, 136f)
                lineTo(159f, 188f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.95f, 4f)
                horizontalLineToRelative(-0.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.89f, -4.84f)
                lineTo(103f, 89.92f)
                lineTo(79f, 132f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 4f)
                lineTo(48f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(67.36f, 120f)
                lineTo(97.05f, 68f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.3f, 0.82f)
                lineTo(153f, 166.08f)
                lineToRelative(24f, -42.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.95f, -4f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _PulseFill!!
    }

@Suppress("ObjectPropertyName")
private var _PulseFill: ImageVector? = null

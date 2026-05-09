package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StoolFill: ImageVector
    get() {
        if (_StoolFill != null) {
            return _StoolFill!!
        }
        _StoolFill = ImageVector.Builder(
            name = "Filled.StoolFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 64f)
                lineTo(200f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(72f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                lineTo(56f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 80f)
                horizontalLineToRelative(6.64f)
                lineTo(56.1f, 222.75f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, 9.15f)
                arcTo(7.82f, 7.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.89f, -6.75f)
                lineTo(79.68f, 176f)
                horizontalLineToRelative(96.64f)
                lineToRelative(7.78f, 49.25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 232f)
                arcToRelative(7.82f, 7.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.26f, -0.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, -9.15f)
                lineTo(177.36f, 80f)
                lineTo(184f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 64f)
                close()
                moveTo(173.79f, 160f)
                lineTo(82.21f, 160f)
                lineTo(94.84f, 80f)
                horizontalLineToRelative(66.32f)
                close()
            }
        }.build()

        return _StoolFill!!
    }

@Suppress("ObjectPropertyName")
private var _StoolFill: ImageVector? = null

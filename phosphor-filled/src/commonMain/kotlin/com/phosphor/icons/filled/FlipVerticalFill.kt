package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FlipVerticalFill: ImageVector
    get() {
        if (_FlipVerticalFill != null) {
            return _FlipVerticalFill!!
        }
        _FlipVerticalFill = ImageVector.Builder(
            name = "Filled.FlipVerticalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(56f, 120f)
                lineTo(216f, 120f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.23f, -30.74f)
                lineToRelative(-0.14f, -0.06f)
                lineToRelative(-159.93f, -64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineToRelative(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 120f)
                close()
                moveTo(56f, 40f)
                lineTo(56.15f, 40.06f)
                lineTo(216f, 104f)
                lineTo(56f, 104f)
                lineToRelative(0f, -64f)
                close()
                moveTo(231.67f, 148.82f)
                arcToRelative(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.45f, 17.92f)
                lineToRelative(-0.14f, 0.06f)
                lineToRelative(-159.93f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 216f)
                lineTo(40f, 152f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                lineTo(216f, 136f)
                arcTo(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.67f, 148.82f)
                close()
            }
        }.build()

        return _FlipVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlipVerticalFill: ImageVector? = null

package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BugFill: ImageVector
    get() {
        if (_BugFill != null) {
            return _BugFill!!
        }
        _BugFill = ImageVector.Builder(
            name = "Filled.BugFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 92f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 92f)
                close()
                moveTo(100f, 80f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100f, 80f)
                close()
                moveTo(216f, 144f)
                arcTo(87.76f, 87.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213f, 167f)
                lineToRelative(22.24f, 9.72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 192f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.2f, -0.67f)
                lineTo(207.38f, 182f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -158.76f, 0f)
                lineTo(27.2f, 191.33f)
                arcTo(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.2f, -15.33f)
                lineTo(43f, 167f)
                arcTo(87.76f, 87.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 144f)
                verticalLineToRelative(-8f)
                lineTo(16f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(40f, 120f)
                verticalLineToRelative(-8f)
                arcToRelative(87.76f, 87.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -23f)
                lineTo(20.8f, 79.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.4f, -14.66f)
                lineTo(48.62f, 74f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158.76f, 0f)
                lineToRelative(21.42f, -9.36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.4f, 14.66f)
                lineTo(213f, 89.05f)
                arcToRelative(87.76f, 87.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 23f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(216f, 136.05f)
                close()
                moveTo(136f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(200f, 112f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -144f, 0f)
                verticalLineToRelative(8f)
                lineTo(200f, 120f)
                close()
            }
        }.build()

        return _BugFill!!
    }

@Suppress("ObjectPropertyName")
private var _BugFill: ImageVector? = null

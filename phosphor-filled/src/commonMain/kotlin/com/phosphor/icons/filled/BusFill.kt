package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BusFill: ImageVector
    get() {
        if (_BusFill != null) {
            return _BusFill!!
        }
        _BusFill = ImageVector.Builder(
            name = "Filled.BusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 80f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(232f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(16f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(24f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 72f)
                close()
                moveTo(216f, 64f)
                lineTo(216f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(184f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineToRelative(-8f)
                lineTo(88f, 200f)
                verticalLineToRelative(8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(56f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(40f, 64f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 32f)
                lineTo(184f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 64f)
                close()
                moveTo(104f, 148f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 148f)
                close()
                moveTo(176f, 148f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 148f)
                close()
                moveTo(200f, 72f)
                lineTo(56f, 72f)
                verticalLineToRelative(40f)
                lineTo(200f, 112f)
                close()
            }
        }.build()

        return _BusFill!!
    }

@Suppress("ObjectPropertyName")
private var _BusFill: ImageVector? = null

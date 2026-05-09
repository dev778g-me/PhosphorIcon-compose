package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LockLaminatedOpenFill: ImageVector
    get() {
        if (_LockLaminatedOpenFill != null) {
            return _LockLaminatedOpenFill!!
        }
        _LockLaminatedOpenFill = ImageVector.Builder(
            name = "Filled.LockLaminatedOpenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 80f)
                lineTo(96f, 80f)
                lineTo(96f, 56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                curveToRelative(15.37f, 0f, 29.2f, 11f, 32.16f, 25.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.68f, -3.18f)
                curveTo(171.32f, 24.15f, 151.2f, 8f, 128f, 8f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 56f)
                lineTo(80f, 80f)
                lineTo(48f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 96f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 80f)
                close()
                moveTo(184f, 192f)
                lineTo(72f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(184f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(184f, 160f)
                lineTo(72f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(184f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(184f, 128f)
                lineTo(72f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(184f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _LockLaminatedOpenFill!!
    }

@Suppress("ObjectPropertyName")
private var _LockLaminatedOpenFill: ImageVector? = null

package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StampFill: ImageVector
    get() {
        if (_StampFill != null) {
            return _StampFill!!
        }
        _StampFill = ImageVector.Builder(
            name = "Filled.StampFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(40f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(216f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 224f)
                close()
                moveTo(208f, 128f)
                lineTo(151.57f, 128f)
                lineToRelative(15.71f, -73.29f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 16f)
                lineTo(120f, 16f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.72f, 54.71f)
                lineTo(104.43f, 128f)
                lineTo(48f, 128f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 144f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 128f)
                close()
            }
        }.build()

        return _StampFill!!
    }

@Suppress("ObjectPropertyName")
private var _StampFill: ImageVector? = null

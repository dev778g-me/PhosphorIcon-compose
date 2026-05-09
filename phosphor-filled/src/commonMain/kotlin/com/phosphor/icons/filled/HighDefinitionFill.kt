package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HighDefinitionFill: ImageVector
    get() {
        if (_HighDefinitionFill != null) {
            return _HighDefinitionFill!!
        }
        _HighDefinitionFill = ImageVector.Builder(
            name = "Filled.HighDefinitionFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(196f, 128f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                lineTo(152f, 160f)
                lineTo(152f, 96f)
                horizontalLineToRelative(12f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 128f)
                close()
                moveTo(232f, 56f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(120f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(32f)
                lineTo(64f, 120f)
                lineTo(64f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(64f, 136f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(212f, 128f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
                lineTo(144f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(20f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 128f)
                close()
            }
        }.build()

        return _HighDefinitionFill!!
    }

@Suppress("ObjectPropertyName")
private var _HighDefinitionFill: ImageVector? = null

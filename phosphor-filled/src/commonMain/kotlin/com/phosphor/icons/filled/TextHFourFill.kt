package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TextHFourFill: ImageVector
    get() {
        if (_TextHFourFill != null) {
            return _TextHFourFill!!
        }
        _TextHFourFill = ImageVector.Builder(
            name = "Filled.TextHFourFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(164.46f, 144f)
                lineTo(184f, 119.13f)
                lineTo(184f, 144f)
                close()
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(128f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(32f)
                lineTo(72f, 112f)
                lineTo(72f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(72f, 128f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(212f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineToRelative(-4f)
                lineTo(200f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.29f, -4.94f)
                lineToRelative(-44f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 148f, 160f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(200f, 160f)
                horizontalLineToRelative(4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 152f)
                close()
            }
        }.build()

        return _TextHFourFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextHFourFill: ImageVector? = null

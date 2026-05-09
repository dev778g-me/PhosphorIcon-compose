package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StackOverflowLogoFill: ImageVector
    get() {
        if (_StackOverflowLogoFill != null) {
            return _StackOverflowLogoFill!!
        }
        _StackOverflowLogoFill = ImageVector.Builder(
            name = "Filled.StackOverflowLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(134.86f, 46.86f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(45.25f, 45.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 11.31f)
                lineTo(134.86f, 58.18f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 134.86f, 46.86f)
                close()
                moveTo(100.18f, 98.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.45f, -4.33f)
                lineToRelative(59.13f, 24.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.06f, 15.4f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.06f, -0.62f)
                lineToRelative(-59.13f, -24.49f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.18f, 98.77f)
                close()
                moveTo(96f, 152f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(96f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                close()
                moveTo(200f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(64f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(56f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(40f)
                lineTo(184f, 184f)
                lineTo(184f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _StackOverflowLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _StackOverflowLogoFill: ImageVector? = null

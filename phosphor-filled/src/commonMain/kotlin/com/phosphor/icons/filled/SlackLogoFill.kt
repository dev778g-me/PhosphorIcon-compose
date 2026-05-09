package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SlackLogoFill: ImageVector
    get() {
        if (_SlackLogoFill != null) {
            return _SlackLogoFill!!
        }
        _SlackLogoFill = ImageVector.Builder(
            name = "Filled.SlackLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.13f, 128f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 76.31f)
                lineTo(184f, 56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -21.13f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76.31f, 72f)
                lineTo(56f, 72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.13f, 56f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 179.69f)
                lineTo(72f, 200f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 21.13f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 179.69f, 184f)
                lineTo(200f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.13f, -56f)
                close()
                moveTo(88f, 56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                lineTo(120f, 72f)
                lineTo(104f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 56f)
                close()
                moveTo(40f, 104f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 88f)
                horizontalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(16f)
                lineTo(56f, 120f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 104f)
                close()
                moveTo(168f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
                lineTo(136f, 184f)
                horizontalLineToRelative(16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 200f)
                close()
                moveTo(200f, 168f)
                lineTo(152f, 168f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(136f, 136f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
                close()
            }
        }.build()

        return _SlackLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _SlackLogoFill: ImageVector? = null

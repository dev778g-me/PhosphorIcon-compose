package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SignOutFill: ImageVector
    get() {
        if (_SignOutFill != null) {
            return _SignOutFill!!
        }
        _SignOutFill = ImageVector.Builder(
            name = "Filled.SignOutFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(48f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(40f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(56f, 48f)
                lineTo(56f, 208f)
                horizontalLineToRelative(56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 216f)
                close()
                moveTo(229.66f, 122.34f)
                lineTo(189.66f, 82.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 88f)
                verticalLineToRelative(32f)
                lineTo(112f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineToRelative(40f, -40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 229.66f, 122.34f)
                close()
            }
        }.build()

        return _SignOutFill!!
    }

@Suppress("ObjectPropertyName")
private var _SignOutFill: ImageVector? = null

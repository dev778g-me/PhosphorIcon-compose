package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShoppingBagOpenFill: ImageVector
    get() {
        if (_ShoppingBagOpenFill != null) {
            return _ShoppingBagOpenFill!!
        }
        _ShoppingBagOpenFill = ImageVector.Builder(
            name = "Filled.ShoppingBagOpenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(128f, 160f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 160f)
                close()
                moveTo(40f, 72f)
                verticalLineTo(56f)
                horizontalLineTo(216f)
                verticalLineTo(72f)
                close()
            }
        }.build()

        return _ShoppingBagOpenFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBagOpenFill: ImageVector? = null

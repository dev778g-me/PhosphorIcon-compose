package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShoppingCartFill: ImageVector
    get() {
        if (_ShoppingCartFill != null) {
            return _ShoppingCartFill!!
        }
        _ShoppingCartFill = ImageVector.Builder(
            name = "Filled.ShoppingCartFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.14f, 58.87f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 56f)
                lineTo(62.68f, 56f)
                lineTo(56.6f, 22.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48.73f, 16f)
                lineTo(24f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(18f)
                lineTo(67.56f, 172.29f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.33f, 11.27f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 44.4f, 8.44f)
                horizontalLineToRelative(45.42f)
                arcTo(27.75f, 27.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 204f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 28f, -28f)
                lineTo(91.17f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.87f, -6.57f)
                lineTo(80.13f, 152f)
                horizontalLineToRelative(116f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.61f, -19.71f)
                lineToRelative(12.16f, -66.86f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 230.14f, 58.87f)
                close()
                moveTo(104f, 204f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 204f)
                close()
                moveTo(200f, 204f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 204f)
                close()
            }
        }.build()

        return _ShoppingCartFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCartFill: ImageVector? = null

package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CurrencyDollarFill: ImageVector
    get() {
        if (_CurrencyDollarFill != null) {
            return _CurrencyDollarFill!!
        }
        _CurrencyDollarFill = ImageVector.Builder(
            name = "Filled.CurrencyDollarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 152f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineToRelative(-8f)
                lineTo(136f, 136f)
                horizontalLineToRelative(8f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 152f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(176f, 152f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                horizontalLineToRelative(-8f)
                lineTo(136f, 88f)
                horizontalLineToRelative(4f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                horizontalLineToRelative(-4f)
                lineTo(136f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-4f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 64f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 152f)
                close()
                moveTo(100f, 104f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(4f)
                lineTo(120f, 88f)
                horizontalLineToRelative(-4f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100f, 104f)
                close()
            }
        }.build()

        return _CurrencyDollarFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyDollarFill: ImageVector? = null

package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CookingPotFill: ImageVector
    get() {
        if (_CookingPotFill != null) {
            return _CookingPotFill!!
        }
        _CookingPotFill = ImageVector.Builder(
            name = "Filled.CookingPotFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 48f)
                lineTo(88f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(104f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(128f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(136f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 56f)
                close()
                moveTo(160f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(168f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(152f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 56f)
                close()
                moveTo(254.4f, 91.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.2f, -1.6f)
                lineTo(224f, 104f)
                lineTo(224f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(40f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(24f)
                lineTo(12.8f, 89.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.6f, 12.8f)
                lineTo(32f, 124f)
                verticalLineToRelative(60f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                lineTo(192f, 216f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                lineTo(224f, 124f)
                lineToRelative(28.8f, -21.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 254.4f, 91.2f)
                close()
            }
        }.build()

        return _CookingPotFill!!
    }

@Suppress("ObjectPropertyName")
private var _CookingPotFill: ImageVector? = null

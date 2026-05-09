package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChefHatFill: ImageVector
    get() {
        if (_ChefHatFill != null) {
            return _ChefHatFill!!
        }
        _ChefHatFill = ImageVector.Builder(
            name = "Filled.ChefHatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 112f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
                curveToRelative(-1.77f, 0f, -3.54f, 0.1f, -5.29f, 0.26f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -101.42f, 0f)
                curveTo(75.54f, 56.1f, 73.77f, 56f, 72f, 56f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 162.59f)
                lineTo(48f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(192f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(208f, 162.59f)
                arcTo(56.09f, 56.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 112f)
                close()
                moveTo(152.24f, 142.06f)
                lineTo(160.24f, 110.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.52f, 3.88f)
                lineToRelative(-8f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 152f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.95f, -0.24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152.24f, 142.06f)
                close()
                moveTo(120f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(86.06f, 104.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.7f, 5.82f)
                lineToRelative(8f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.82f, 9.7f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.75f, -6.06f)
                lineToRelative(-8f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 86.06f, 104.24f)
                close()
                moveTo(192f, 208f)
                lineTo(64f, 208f)
                lineTo(64f, 167.42f)
                arcToRelative(55.49f, 55.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0.58f)
                lineTo(184f, 168f)
                arcToRelative(55.49f, 55.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -0.58f)
                close()
            }
        }.build()

        return _ChefHatFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChefHatFill: ImageVector? = null

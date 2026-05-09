package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LightbulbFill: ImageVector
    get() {
        if (_LightbulbFill != null) {
            return _LightbulbFill!!
        }
        _LightbulbFill = ImageVector.Builder(
            name = "Filled.LightbulbFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(88f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 232f)
                close()
                moveTo(216f, 104f)
                arcToRelative(87.55f, 87.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -33.64f, 69.21f)
                arcTo(16.24f, 16.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 186f)
                verticalLineToRelative(6f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(96f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineToRelative(-6f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.23f, -12.66f)
                arcTo(87.59f, 87.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 104.49f)
                curveTo(39.74f, 56.83f, 78.26f, 17.14f, 125.88f, 16f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 104f)
                close()
                moveTo(183.89f, 94.66f)
                arcToRelative(57.6f, 57.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -46.56f, -46.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.66f, 15.78f)
                curveToRelative(16.57f, 2.79f, 30.63f, 16.85f, 33.44f, 33.45f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 104f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.35f, -0.11f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 183.89f, 94.66f)
                close()
            }
        }.build()

        return _LightbulbFill!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbFill: ImageVector? = null

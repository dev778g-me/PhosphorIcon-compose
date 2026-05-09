package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.VolleyballFill: ImageVector
    get() {
        if (_VolleyballFill != null) {
            return _VolleyballFill!!
        }
        _VolleyballFill = ImageVector.Builder(
            name = "Filled.VolleyballFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(215.63f, 120f)
                lineTo(181.37f, 120f)
                arcToRelative(104.18f, 104.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -35.78f, -78.23f)
                arcTo(88.18f, 88.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.63f, 120f)
                close()
                moveTo(44.53f, 155.87f)
                arcTo(87.95f, 87.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 77.27f, 56.13f)
                lineTo(94.39f, 85.78f)
                arcToRelative(104.14f, 104.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -49.86f, 70.09f)
                close()
                moveTo(58.9f, 182.43f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 43.49f, -82.79f)
                lineTo(118.76f, 128f)
                lineTo(77.27f, 199.87f)
                arcTo(88.62f, 88.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.9f, 182.43f)
                close()
                moveTo(209.74f, 160.58f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -93.49f, 3.78f)
                lineTo(132.62f, 136f)
                horizontalLineToRelative(83f)
                arcTo(87.16f, 87.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 209.74f, 160.58f)
                close()
            }
        }.build()

        return _VolleyballFill!!
    }

@Suppress("ObjectPropertyName")
private var _VolleyballFill: ImageVector? = null

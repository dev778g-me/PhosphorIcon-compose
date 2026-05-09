package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HurricaneFill: ImageVector
    get() {
        if (_HurricaneFill != null) {
            return _HurricaneFill!!
        }
        _HurricaneFill = ImageVector.Builder(
            name = "Filled.HurricaneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(158.32f, 45.36f)
                lineToRelative(9.41f, -35.3f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 158.32f, 0.18f)
                arcTo(195.87f, 195.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 99.67f, 25.27f)
                curveTo(60.63f, 50.37f, 40f, 85.89f, 40f, 128f)
                arcToRelative(88.11f, 88.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 57.68f, 82.64f)
                lineToRelative(-9.41f, 35.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.41f, 9.88f)
                arcToRelative(195.87f, 195.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 58.65f, -25.09f)
                curveTo(195.37f, 205.63f, 216f, 170.11f, 216f, 128f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 158.32f, 45.36f)
                close()
                moveTo(128f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 152f)
                close()
            }
        }.build()

        return _HurricaneFill!!
    }

@Suppress("ObjectPropertyName")
private var _HurricaneFill: ImageVector? = null

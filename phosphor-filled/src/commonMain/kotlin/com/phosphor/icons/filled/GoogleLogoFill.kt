package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GoogleLogoFill: ImageVector
    get() {
        if (_GoogleLogoFill != null) {
            return _GoogleLogoFill!!
        }
        _GoogleLogoFill = ImageVector.Builder(
            name = "Filled.GoogleLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 208f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 181.34f, 68.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.67f, 11.92f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 191.5f, 136f)
                lineTo(128f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcTo(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 208f)
                close()
            }
        }.build()

        return _GoogleLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleLogoFill: ImageVector? = null

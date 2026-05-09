package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PhosphorLogoFill: ImageVector
    get() {
        if (_PhosphorLogoFill != null) {
            return _PhosphorLogoFill!!
        }
        _PhosphorLogoFill = ImageVector.Builder(
            name = "Filled.PhosphorLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 32f)
                lineTo(72f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(64f, 168f)
                arcToRelative(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(152f, 176f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -144f)
                close()
                moveTo(136f, 231.5f)
                arcTo(64.14f, 64.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.51f, 176f)
                lineTo(136f, 176f)
                close()
                moveTo(136f, 137.5f)
                lineTo(85.68f, 48f)
                lineTo(136f, 48f)
                close()
                moveTo(152f, 160f)
                lineTo(152f, 48f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 112f)
                close()
            }
        }.build()

        return _PhosphorLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhosphorLogoFill: ImageVector? = null

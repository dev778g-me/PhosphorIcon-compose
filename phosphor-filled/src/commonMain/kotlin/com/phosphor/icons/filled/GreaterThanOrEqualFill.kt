package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GreaterThanOrEqualFill: ImageVector
    get() {
        if (_GreaterThanOrEqualFill != null) {
            return _GreaterThanOrEqualFill!!
        }
        _GreaterThanOrEqualFill = ImageVector.Builder(
            name = "Filled.GreaterThanOrEqualFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(184f, 184f)
                lineTo(80f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(184f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(186.35f, 119.65f)
                lineTo(82.35f, 151.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.7f, -15.3f)
                lineTo(156.8f, 112f)
                lineTo(77.65f, 87.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.7f, -15.3f)
                lineToRelative(104f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 15.3f)
                close()
            }
        }.build()

        return _GreaterThanOrEqualFill!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanOrEqualFill: ImageVector? = null

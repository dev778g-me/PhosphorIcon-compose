package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ExcludeSquareFill: ImageVector
    get() {
        if (_ExcludeSquareFill != null) {
            return _ExcludeSquareFill!!
        }
        _ExcludeSquareFill = ImageVector.Builder(
            name = "Filled.ExcludeSquareFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 88f)
                verticalLineToRelative(80f)
                lineTo(40f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(32f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                lineTo(160f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                lineTo(168f, 88f)
                close()
                moveTo(216f, 88f)
                lineTo(168f, 88f)
                verticalLineToRelative(80f)
                lineTo(88f, 168f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(216f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(224f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 88f)
                close()
            }
        }.build()

        return _ExcludeSquareFill!!
    }

@Suppress("ObjectPropertyName")
private var _ExcludeSquareFill: ImageVector? = null

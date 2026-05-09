package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ColumnsPlusRightFill: ImageVector
    get() {
        if (_ColumnsPlusRightFill != null) {
            return _ColumnsPlusRightFill!!
        }
        _ColumnsPlusRightFill = ImageVector.Builder(
            name = "Filled.ColumnsPlusRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(96f, 48f)
                lineTo(96f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(56f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(40f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 32f)
                lineTo(80f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 48f)
                close()
                moveTo(152f, 32f)
                lineTo(128f, 32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                lineTo(112f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(168f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 32f)
                close()
                moveTo(240f, 120f)
                lineTo(224f, 120f)
                lineTo(224f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(16f)
                lineTo(192f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(224f, 136f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _ColumnsPlusRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ColumnsPlusRightFill: ImageVector? = null

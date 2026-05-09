package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PencilLineFill: ImageVector
    get() {
        if (_PencilLineFill != null) {
            return _PencilLineFill!!
        }
        _PencilLineFill = ImageVector.Builder(
            name = "Filled.PencilLineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.32f, 73.37f)
                lineTo(182.63f, 28.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineTo(36.69f, 152f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 163.31f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(115.32f, 208f)
                lineToRelative(112f, -112f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.32f, 73.37f)
                close()
                moveTo(79.32f, 188f)
                lineToRelative(90.34f, -90.34f)
                lineToRelative(16.69f, 16.68f)
                lineTo(96f, 204.69f)
                close()
                moveTo(158.32f, 86.34f)
                horizontalLineToRelative(0f)
                lineTo(68f, 176.69f)
                lineTo(51.31f, 160f)
                lineToRelative(90.35f, -90.34f)
                close()
                moveTo(48f, 179.31f)
                lineTo(76.69f, 208f)
                lineTo(48f, 208f)
                close()
            }
        }.build()

        return _PencilLineFill!!
    }

@Suppress("ObjectPropertyName")
private var _PencilLineFill: ImageVector? = null

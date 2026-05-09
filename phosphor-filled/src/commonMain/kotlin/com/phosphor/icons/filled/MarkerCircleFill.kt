package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MarkerCircleFill: ImageVector
    get() {
        if (_MarkerCircleFill != null) {
            return _MarkerCircleFill!!
        }
        _MarkerCircleFill = ImageVector.Builder(
            name = "Filled.MarkerCircleFill",
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
                moveTo(168f, 206.37f)
                arcToRelative(87.89f, 87.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 0f)
                lineTo(88f, 176f)
                horizontalLineToRelative(80f)
                close()
                moveTo(104f, 160f)
                lineTo(104f, 144f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(16f)
                close()
                moveTo(184f, 195.83f)
                lineTo(184f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(168f, 144f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.61f, -15.8f)
                lineTo(143.66f, 76.74f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.32f, 0f)
                lineTo(101.61f, 128.2f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 144f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(19.83f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
                close()
            }
        }.build()

        return _MarkerCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _MarkerCircleFill: ImageVector? = null

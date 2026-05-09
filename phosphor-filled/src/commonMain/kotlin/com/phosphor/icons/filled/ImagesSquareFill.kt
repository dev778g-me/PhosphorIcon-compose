package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ImagesSquareFill: ImageVector
    get() {
        if (_ImagesSquareFill != null) {
            return _ImagesSquareFill!!
        }
        _ImagesSquareFill = ImageVector.Builder(
            name = "Filled.ImagesSquareFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(80f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 48f)
                lineTo(64f, 64f)
                lineTo(48f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 80f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(176f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(192f, 192f)
                horizontalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(80f, 48f)
                lineTo(208f, 48f)
                verticalLineToRelative(69.38f)
                lineToRelative(-16.7f, -16.7f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 0f)
                lineTo(93.37f, 176f)
                lineTo(80f, 176f)
                close()
                moveTo(176f, 208f)
                lineTo(48f, 208f)
                lineTo(48f, 80f)
                lineTo(64f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(96f)
                close()
                moveTo(104f, 88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 88f)
                close()
            }
        }.build()

        return _ImagesSquareFill!!
    }

@Suppress("ObjectPropertyName")
private var _ImagesSquareFill: ImageVector? = null

package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CarSimpleFill: ImageVector
    get() {
        if (_CarSimpleFill != null) {
            return _CarSimpleFill!!
        }
        _CarSimpleFill = ImageVector.Builder(
            name = "Filled.CarSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 104f)
                horizontalLineTo(229.2f)
                lineTo(201.42f, 41.5f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186.8f, 32f)
                horizontalLineTo(69.2f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.62f, 9.5f)
                lineTo(26.8f, 104f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(120f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(44.31f, 104f)
                lineTo(69.2f, 48f)
                horizontalLineTo(186.8f)
                lineToRelative(24.89f, 56f)
                close()
            }
        }.build()

        return _CarSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _CarSimpleFill: ImageVector? = null

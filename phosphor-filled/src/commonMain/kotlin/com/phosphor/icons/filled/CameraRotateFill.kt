package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CameraRotateFill: ImageVector
    get() {
        if (_CameraRotateFill != null) {
            return _CameraRotateFill!!
        }
        _CameraRotateFill = ImageVector.Builder(
            name = "Filled.CameraRotateFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 56f)
                horizontalLineTo(180.28f)
                lineTo(166.65f, 35.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 32f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.65f, 3.56f)
                lineTo(75.71f, 56f)
                horizontalLineTo(48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                verticalLineTo(192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineTo(208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                verticalLineTo(80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 56f)
                close()
                moveTo(156.81f, 166.4f)
                arcTo(48.21f, 48.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 163.77f)
                verticalLineTo(168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineToRelative(-5.15f)
                arcToRelative(32.12f, 32.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.34f, 1.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.62f, 12.79f)
                close()
                moveTo(176f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(5.15f)
                arcToRelative(32.12f, 32.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40.34f, -1.61f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 99.19f, 97.6f)
                arcTo(48.21f, 48.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 100.23f)
                verticalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _CameraRotateFill!!
    }

@Suppress("ObjectPropertyName")
private var _CameraRotateFill: ImageVector? = null

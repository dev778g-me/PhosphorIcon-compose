package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TranslateFill: ImageVector
    get() {
        if (_TranslateFill != null) {
            return _TranslateFill!!
        }
        _TranslateFill = ImageVector.Builder(
            name = "Filled.TranslateFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 129.89f)
                lineTo(175.06f, 160f)
                horizontalLineTo(144.94f)
                lineToRelative(6.36f, -12.7f)
                verticalLineToRelative(0f)
                close()
                moveTo(224f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                horizontalLineTo(208f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(207.16f, 188.42f)
                lineToRelative(-40f, -80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.32f, 0f)
                lineTo(139.66f, 134.8f)
                arcToRelative(62.31f, 62.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -23.61f, -10f)
                arcTo(79.61f, 79.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 135.6f, 80f)
                horizontalLineTo(152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(112f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(63.48f)
                arcToRelative(63.73f, 63.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.3f, 34.05f)
                arcToRelative(65.93f, 65.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -13.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.32f, 7.12f)
                arcToRelative(81.75f, 81.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.4f, 17.15f)
                arcTo(63.62f, 63.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                arcToRelative(79.56f, 79.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48.11f, -16.13f)
                arcToRelative(78.33f, 78.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.18f, 13.66f)
                lineToRelative(-19.45f, 38.89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.32f, 7.16f)
                lineTo(136.94f, 176f)
                horizontalLineToRelative(46.12f)
                lineToRelative(9.78f, 19.58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.32f, -7.16f)
                close()
            }
        }.build()

        return _TranslateFill!!
    }

@Suppress("ObjectPropertyName")
private var _TranslateFill: ImageVector? = null

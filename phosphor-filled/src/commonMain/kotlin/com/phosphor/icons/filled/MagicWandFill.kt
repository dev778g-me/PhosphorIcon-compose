package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MagicWandFill: ImageVector
    get() {
        if (_MagicWandFill != null) {
            return _MagicWandFill!!
        }
        _MagicWandFill = ImageVector.Builder(
            name = "Filled.MagicWandFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(224f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(160f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(16f)
                verticalLineTo(128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 152f)
                close()
                moveTo(56f, 72f)
                horizontalLineTo(72f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(72f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(88f)
                verticalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineTo(56f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(184f, 192f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(219.31f, 80f)
                lineTo(80f, 219.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, 0f)
                lineTo(36.68f, 198.63f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -22.63f)
                lineTo(176f, 36.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.63f, 0f)
                lineToRelative(20.68f, 20.68f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 219.31f, 80f)
                close()
                moveTo(208f, 68.69f)
                lineTo(187.31f, 48f)
                lineToRelative(-32f, 32f)
                lineTo(176f, 100.69f)
                close()
            }
        }.build()

        return _MagicWandFill!!
    }

@Suppress("ObjectPropertyName")
private var _MagicWandFill: ImageVector? = null

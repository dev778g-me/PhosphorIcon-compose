package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SplitVerticalFill: ImageVector
    get() {
        if (_SplitVerticalFill != null) {
            return _SplitVerticalFill!!
        }
        _SplitVerticalFill = ImageVector.Builder(
            name = "Filled.SplitVerticalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(136f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-32f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 192f)
                horizontalLineToRelative(24f)
                verticalLineTo(160f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 152f)
                close()
                moveTo(48f, 112f)
                horizontalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(136f)
                verticalLineTo(64f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                lineToRelative(-32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 64f)
                horizontalLineToRelative(24f)
                verticalLineTo(96f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
            }
        }.build()

        return _SplitVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _SplitVerticalFill: ImageVector? = null

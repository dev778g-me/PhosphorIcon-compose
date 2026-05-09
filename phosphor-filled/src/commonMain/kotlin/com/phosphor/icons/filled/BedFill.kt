package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BedFill: ImageVector
    get() {
        if (_BedFill != null) {
            return _BedFill!!
        }
        _BedFill = ImageVector.Builder(
            name = "Filled.BedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 72f)
                horizontalLineTo(32f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(176f)
                horizontalLineTo(240f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(112f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                close()
                moveTo(32f, 88f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(72f)
                horizontalLineTo(32f)
                close()
            }
        }.build()

        return _BedFill!!
    }

@Suppress("ObjectPropertyName")
private var _BedFill: ImageVector? = null

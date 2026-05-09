package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberFourFill: ImageVector
    get() {
        if (_NumberFourFill != null) {
            return _NumberFourFill!!
        }
        _NumberFourFill = ImageVector.Builder(
            name = "Filled.NumberFourFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(104.65f, 144f)
                lineTo(144f, 94.81f)
                verticalLineTo(144f)
                close()
                moveTo(216f, 40f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineTo(200f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 40f)
                close()
                moveTo(184f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(160f)
                verticalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.25f, -5f)
                lineToRelative(-64f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 160f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(160f)
                horizontalLineToRelative(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 152f)
                close()
            }
        }.build()

        return _NumberFourFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFourFill: ImageVector? = null

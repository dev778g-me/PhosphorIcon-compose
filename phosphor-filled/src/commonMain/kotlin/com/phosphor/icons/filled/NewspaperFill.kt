package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NewspaperFill: ImageVector
    get() {
        if (_NewspaperFill != null) {
            return _NewspaperFill!!
        }
        _NewspaperFill = ImageVector.Builder(
            name = "Filled.NewspaperFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 48f)
                lineTo(56f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 64f)
                lineTo(40f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(24f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 88f)
                verticalLineToRelative(96.11f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 208f)
                lineTo(208f, 208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(232f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 48f)
                close()
                moveTo(176f, 152f)
                lineTo(96f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(176f, 120f)
                lineTo(96f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _NewspaperFill!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperFill: ImageVector? = null

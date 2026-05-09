package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AlignBottomFill: ImageVector
    get() {
        if (_AlignBottomFill != null) {
            return _AlignBottomFill!!
        }
        _AlignBottomFill = ImageVector.Builder(
            name = "Filled.AlignBottomFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(40f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(216f, 208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 216f)
                close()
                moveTo(152f, 192f)
                horizontalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(208f, 80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(152f, 64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 192f)
                close()
                moveTo(64f, 192f)
                horizontalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(120f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(64f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 40f)
                lineTo(48f, 176f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 192f)
                close()
            }
        }.build()

        return _AlignBottomFill!!
    }

@Suppress("ObjectPropertyName")
private var _AlignBottomFill: ImageVector? = null

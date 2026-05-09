package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AlignTopFill: ImageVector
    get() {
        if (_AlignTopFill != null) {
            return _AlignTopFill!!
        }
        _AlignTopFill = ImageVector.Builder(
            name = "Filled.AlignTopFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(40f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(216f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 40f)
                close()
                moveTo(192f, 64f)
                lineTo(152f, 64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(208f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 64f)
                close()
                moveTo(104f, 64f)
                lineTo(64f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 80f)
                lineTo(48f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(120f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 64f)
                close()
            }
        }.build()

        return _AlignTopFill!!
    }

@Suppress("ObjectPropertyName")
private var _AlignTopFill: ImageVector? = null

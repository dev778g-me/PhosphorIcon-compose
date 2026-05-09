package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowsOutLineVerticalFill: ImageVector
    get() {
        if (_ArrowsOutLineVerticalFill != null) {
            return _ArrowsOutLineVerticalFill!!
        }
        _ArrowsOutLineVerticalFill = ImageVector.Builder(
            name = "Filled.ArrowsOutLineVerticalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(40f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(216f, 120f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                close()
                moveTo(96f, 56f)
                horizontalLineToRelative(24f)
                lineTo(120f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 56f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                lineToRelative(-32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 56f)
                close()
                moveTo(160f, 200f)
                lineTo(136f, 200f)
                lineTo(136f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(40f)
                lineTo(96f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineToRelative(32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                lineToRelative(32f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 200f)
                close()
            }
        }.build()

        return _ArrowsOutLineVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsOutLineVerticalFill: ImageVector? = null

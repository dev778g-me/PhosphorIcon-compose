package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BaseballHelmetFill: ImageVector
    get() {
        if (_BaseballHelmetFill != null) {
            return _BaseballHelmetFill!!
        }
        _BaseballHelmetFill = ImageVector.Builder(
            name = "Filled.BaseballHelmetFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 120f)
                lineTo(223.7f, 120f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 128f)
                verticalLineToRelative(24f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 72f)
                horizontalLineToRelative(40f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, -72f)
                lineTo(200f, 136f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(88f, 180f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 180f)
                close()
                moveTo(184f, 152f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -50.46f, 55.72f)
                arcTo(71.87f, 71.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 152f)
                lineTo(160f, 136f)
                horizontalLineToRelative(24f)
                close()
            }
        }.build()

        return _BaseballHelmetFill!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballHelmetFill: ImageVector? = null

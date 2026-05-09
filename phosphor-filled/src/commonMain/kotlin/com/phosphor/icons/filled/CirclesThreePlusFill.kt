package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CirclesThreePlusFill: ImageVector
    get() {
        if (_CirclesThreePlusFill != null) {
            return _CirclesThreePlusFill!!
        }
        _CirclesThreePlusFill = ImageVector.Builder(
            name = "Filled.CirclesThreePlusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 80f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 80f)
                close()
                moveTo(176f, 120f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 120f)
                close()
                moveTo(80f, 136f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 40f, 40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 136f)
                close()
                moveTo(208f, 168f)
                lineTo(184f, 168f)
                lineTo(184f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(24f)
                lineTo(144f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(184f, 184f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _CirclesThreePlusFill!!
    }

@Suppress("ObjectPropertyName")
private var _CirclesThreePlusFill: ImageVector? = null

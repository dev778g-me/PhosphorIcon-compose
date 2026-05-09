package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RadicalFill: ImageVector
    get() {
        if (_RadicalFill != null) {
            return _RadicalFill!!
        }
        _RadicalFill = ImageVector.Builder(
            name = "Filled.RadicalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(208f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-8f)
                lineTo(125.42f, 104f)
                lineToRelative(-30f, 75f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.86f, 0f)
                lineToRelative(-32f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 63.43f, 93f)
                lineTo(88f, 154.46f)
                lineTo(112.57f, 93f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 88f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
            }
        }.build()

        return _RadicalFill!!
    }

@Suppress("ObjectPropertyName")
private var _RadicalFill: ImageVector? = null

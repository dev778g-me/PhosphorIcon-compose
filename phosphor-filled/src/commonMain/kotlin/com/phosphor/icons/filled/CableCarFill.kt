package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CableCarFill: ImageVector
    get() {
        if (_CableCarFill != null) {
            return _CableCarFill!!
        }
        _CableCarFill = ImageVector.Builder(
            name = "Filled.CableCarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(247.87f, 30.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.28f, -6.46f)
                lineToRelative(-224f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 80f)
                arcToRelative(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -0.12f)
                lineTo(120f, 61.56f)
                lineTo(120f, 96f)
                lineTo(64f, 96f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
                verticalLineToRelative(64f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                lineTo(192f, 224f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                lineTo(224f, 128f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                lineTo(136f, 96f)
                lineTo(136f, 58.7f)
                lineTo(241.4f, 39.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.87f, 30.59f)
                close()
                moveTo(104f, 160f)
                lineTo(104f, 112f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(48f)
                close()
                moveTo(64f, 112f)
                lineTo(88f, 112f)
                verticalLineToRelative(48f)
                lineTo(48f, 160f)
                lineTo(48f, 128f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 112f)
                close()
                moveTo(208f, 128f)
                verticalLineToRelative(32f)
                lineTo(168f, 160f)
                lineTo(168f, 112f)
                horizontalLineToRelative(24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 128f)
                close()
            }
        }.build()

        return _CableCarFill!!
    }

@Suppress("ObjectPropertyName")
private var _CableCarFill: ImageVector? = null

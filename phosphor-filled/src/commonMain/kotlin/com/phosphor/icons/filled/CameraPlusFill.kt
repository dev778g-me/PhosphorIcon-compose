package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CameraPlusFill: ImageVector
    get() {
        if (_CameraPlusFill != null) {
            return _CameraPlusFill!!
        }
        _CameraPlusFill = ImageVector.Builder(
            name = "Filled.CameraPlusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 56f)
                lineTo(180.28f, 56f)
                lineTo(169f, 39.12f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 155.72f, 32f)
                lineTo(100.28f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87f, 39.12f)
                lineTo(75.72f, 56f)
                lineTo(48f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                lineTo(24f, 192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                lineTo(208f, 216f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(232f, 80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 56f)
                close()
                moveTo(160f, 144f)
                lineTo(136f, 144f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 144f)
                lineTo(96f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(24f)
                lineTo(120f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _CameraPlusFill!!
    }

@Suppress("ObjectPropertyName")
private var _CameraPlusFill: ImageVector? = null
